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

import br.edu.insper.desagil.blackbeard.model.AlunoListener;
import br.edu.insper.desagil.blackbeard.model.Model;
import br.edu.insper.desagil.blackbeard.model.base.Aluno;

public class AlunoView extends JPanel implements AlunoListener, ActionListener {
	private static final long serialVersionUID = 1L;

	private DefaultTableModel tableModel;
	private JTextField idField;
	private JTextField nomeField;
	private Model model;

	public AlunoView(Model model) {
		super();

		Vector<String> columnNames = new Vector<>(Arrays.asList("ID", "Nome"));
		this.tableModel = new DefaultTableModel(columnNames, 0);
		JScrollPane tablePane = new JScrollPane(new JTable(this.tableModel));

		this.idField = new JTextField();
		this.nomeField = new JTextField();

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(this.idField);
		panel.add(this.nomeField);

		JButton button = new JButton("Adicionar");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(tablePane);
		add(panel);
		add(button);

		this.model = model;
		this.model.addAlunoListener(this);
	}

	@Override
	public void adicionou(Aluno aluno) {
		String idText = Integer.toString(aluno.getId());
		String nome = aluno.getNome();
		this.tableModel.addRow(new Object[]{idText, nome});
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		int id;
		try {
			id = Integer.parseInt(this.idField.getText());
		} catch (NumberFormatException exception) {
			id = 0;
		}
		String nome = this.nomeField.getText();
		this.model.doAdicionaAluno(id, nome);
	}
}
