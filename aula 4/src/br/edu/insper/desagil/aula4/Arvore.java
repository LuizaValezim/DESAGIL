package br.edu.insper.desagil.aula4;

public class Arvore {

	public String constroi(int n) {
		String arvore = "";

		int i = 0;
		while (i < n) {
			int j;

			j = 0;
			while (j < n - 1 - i) {
				arvore += " ";
				j++;
			}

			j = 0;
			while (j < i) {
				arvore += "/";
				j++;
			}

			arvore += "|";

			j = 0;
			while (j < i) {
				arvore += "\\";
				j++;
			}

			arvore += "\n";

			i++;
		}

		return arvore;
	}

}
