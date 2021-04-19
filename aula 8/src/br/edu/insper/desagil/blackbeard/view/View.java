/*
 *
 * VOCÊ NÃO PRECISA ENTENDER ESTE ARQUIVO.
 *
 */

package br.edu.insper.desagil.blackbeard.view;

import java.awt.Dimension;

import javax.swing.JTabbedPane;

import br.edu.insper.desagil.blackbeard.model.Model;

public class View extends JTabbedPane {
	private static final long serialVersionUID = 1L;

	public View(Model model) {
		super();

		AlunoView alunoView = new AlunoView(model);
		DisciplinaView disciplinaView = new DisciplinaView(model);
		OferecimentoView oferecimentoView = new OferecimentoView(model);
		MatriculaView matriculaView = new MatriculaView(model);

		this.addTab("Alunos", alunoView);
		this.addTab("Disciplinas", disciplinaView);
		this.addTab("Oferecimentos", oferecimentoView);
		this.addTab("Matriculas", matriculaView);

		this.setPreferredSize(new Dimension(500, 500));
	}
/*
	@Override
	public Dimension getPreferredSize() {
		int tabsWidth = 0;
        for (int i = 0; i < getTabCount(); i++) {
        	tabsWidth += getBoundsAt(i).width;
        }
        Dimension size = super.getPreferredSize();
        size.width = Math.max(size.width, tabsWidth);
        return size;
	}
*/
}
