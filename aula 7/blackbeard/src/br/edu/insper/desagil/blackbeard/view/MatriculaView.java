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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.insper.desagil.blackbeard.model.AlunoListener;
import br.edu.insper.desagil.blackbeard.model.MatriculaListener;
import br.edu.insper.desagil.blackbeard.model.Model;
import br.edu.insper.desagil.blackbeard.model.OferecimentoListener;
import br.edu.insper.desagil.blackbeard.model.base.Aluno;
import br.edu.insper.desagil.blackbeard.model.base.Oferecimento;

public class MatriculaView extends JPanel implements AlunoListener, OferecimentoListener, MatriculaListener, ActionListener {
	private static final long serialVersionUID = 1L;

	private DefaultTableModel tableModel;
	private DefaultComboBoxModel<Aluno> alunoModel;
	private JComboBox<Aluno> alunoBox;
	private DefaultComboBoxModel<String> oferecimentoModel;
	private JComboBox<String> oferecimentoBox;
	private Model model;

	public MatriculaView(Model model) {
		super();

		Vector<String> columnNames = new Vector<>(Arrays.asList("Aluno", "Oferecimento"));
		this.tableModel = new DefaultTableModel(columnNames, 0);
		JScrollPane tablePane = new JScrollPane(new JTable(this.tableModel));

		this.alunoModel = new DefaultComboBoxModel<>();
		this.alunoBox = new JComboBox<>(this.alunoModel);
		this.oferecimentoModel = new DefaultComboBoxModel<>();
		this.oferecimentoBox = new JComboBox<>(this.oferecimentoModel);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(this.alunoBox);
		panel.add(this.oferecimentoBox);

		JButton button = new JButton("Adicionar");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(tablePane);
		add(panel);
		add(button);

		this.model = model;
		this.model.addAlunoListener(this);
		this.model.addOferecimentoListener(this);
		this.model.addMatriculaListener(this);
	}

	@Override
	public void adicionou(Aluno aluno) {
		this.alunoModel.addElement(aluno);
	}

	@Override
	public void adicionou(Oferecimento oferecimento) {
		int numero = this.oferecimentoModel.getSize() + 1;
		String codigoDisciplina = oferecimento.getDisciplina().getCodigo();
		this.oferecimentoModel.addElement(numero + ": " + codigoDisciplina);
	}

	@Override
	public void matriculou(Aluno aluno, int numero) {
		String idText = Integer.toString(aluno.getId());
		String numeroText = Integer.toString(numero);
		System.out.println(idText + " " + numeroText);
		this.tableModel.addRow(new Object[]{idText, numeroText});
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		int index;
		Aluno aluno = null;
		index = this.alunoBox.getSelectedIndex();
		if (index > -1) {
			aluno = this.alunoBox.getItemAt(index);
		}
		index = this.oferecimentoBox.getSelectedIndex();
		this.model.doAdicionaMatricula(aluno, index);
	}
}
