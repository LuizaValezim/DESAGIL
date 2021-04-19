/*
 *
 * VOCÊ NÃO PRECISA ENTENDER ESTE ARQUIVO.
 *
 */

package br.edu.insper.desagil.blackbeard;

import javax.swing.JFrame;

import br.edu.insper.desagil.blackbeard.model.Model;
import br.edu.insper.desagil.blackbeard.view.View;

public class Blackbeard {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(() -> {
			Model model = new Model();

			View view = new View(model);

			JFrame window = new JFrame("Blackbeard");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setContentPane(view);
			window.setResizable(false);
			window.setVisible(true);
			window.pack();
			window.pack();
		});
	}
}
