package br.edu.insper.desagil.aula4;

public class Tabuada {

	public String constroi(int n) {
		String tabuada = "";
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				tabuada += (i * j) + " ";
				j++;
			}
			tabuada += "\n";
			i++;
		}
		return tabuada;
	}

}
