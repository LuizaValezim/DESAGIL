/*
 *
 * VOCÊ NÃO PRECISA ENTENDER ESTE ARQUIVO.
 *
 */

package br.edu.insper.desagil.blackbeard.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.insper.desagil.blackbeard.model.DisciplinaListener;
import br.edu.insper.desagil.blackbeard.model.Model;
import br.edu.insper.desagil.blackbeard.model.OferecimentoListener;
import br.edu.insper.desagil.blackbeard.model.base.Disciplina;
import br.edu.insper.desagil.blackbeard.model.base.Oferecimento;

public class OferecimentoView extends JPanel implements DisciplinaListener, OferecimentoListener, ActionListener {
	private static final long serialVersionUID = 1L;

	private DefaultTableModel tableModel;
	private JLabel numeroLabel;
	private DefaultComboBoxModel<Disciplina> disciplinaModel;
	private JComboBox<Disciplina> disciplinaBox;
	private Model model;

	private String getNumeroText() {
		return Integer.toString(this.tableModel.getRowCount() + 1);
	}

	private void updateNumeroLabel() {
		this.numeroLabel.setText(getNumeroText() + " ");
	}

	public OferecimentoView(Model model) {
		super();

		Vector<String> columnNames = new Vector<>(Arrays.asList("Número", "Disciplina"));
		this.tableModel = new DefaultTableModel(columnNames, 0);
		JScrollPane tablePane = new JScrollPane(new JTable(this.tableModel));

		this.numeroLabel = new JLabel();
		this.disciplinaModel = new DefaultComboBoxModel<>();
		this.disciplinaBox = new JComboBox<>(this.disciplinaModel);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(this.numeroLabel);
		panel.add(this.disciplinaBox);

		JButton button = new JButton("Adicionar");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(tablePane);
		add(panel);
		add(button);

		this.model = model;
		this.model.addDisciplinaListener(this);
		this.model.addOferecimentoListener(this);

		updateNumeroLabel();
	}

	@Override
	public void adicionou(Disciplina disciplina) {
		this.disciplinaModel.addElement(disciplina);
	}

	@Override
	public void adicionou(Oferecimento oferecimento) {
		String numeroText = getNumeroText();
		String codigoDisciplina = oferecimento.getDisciplina().getCodigo();
		this.tableModel.addRow(new Object[]{numeroText, codigoDisciplina});
		updateNumeroLabel();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Disciplina disciplina = null;
		int index = this.disciplinaBox.getSelectedIndex();
		if (index > -1) {
			disciplina = this.disciplinaBox.getItemAt(index);
		}
		this.model.doAdicionaOferecimento(disciplina);
	}
}
