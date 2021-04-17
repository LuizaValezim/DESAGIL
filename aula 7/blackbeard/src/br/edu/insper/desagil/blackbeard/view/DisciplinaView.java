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
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.edu.insper.desagil.blackbeard.model.DisciplinaListener;
import br.edu.insper.desagil.blackbeard.model.Model;
import br.edu.insper.desagil.blackbeard.model.base.Disciplina;

public class DisciplinaView extends JPanel implements DisciplinaListener, ActionListener {
	private static final long serialVersionUID = 1L;

	private DefaultTableModel tableModel;
	private JTextField codigoField;
	private JTextField nomeField;
	private Model model;

	public DisciplinaView(Model model) {
		super();

		Vector<String> columnNames = new Vector<>(Arrays.asList("Código", "Nome"));
		this.tableModel = new DefaultTableModel(columnNames, 0);
		JScrollPane tablePane = new JScrollPane(new JTable(this.tableModel));

		this.codigoField = new JTextField();
		this.nomeField = new JTextField();

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(this.codigoField);
		panel.add(this.nomeField);

		JButton button = new JButton("Adicionar");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(tablePane);
		add(panel);
		add(button);

		this.model = model;
		this.model.addDisciplinaListener(this);
	}

	@Override
	public void adicionou(Disciplina disciplina) {
		String codigo = disciplina.getCodigo();
		String nome = disciplina.getNome();
		this.tableModel.addRow(new Object[]{codigo, nome});
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String codigo = this.codigoField.getText();
		String nome = this.nomeField.getText();
		this.model.doAdicionaDisciplina(codigo, nome);
	}
}
