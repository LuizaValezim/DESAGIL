package br.edu.insper.desagil.rh;

import java.util.ArrayList;
import java.util.List;

public class RH {
	private List<Funcionario> folha;

	public RH() {
		this.folha = new ArrayList<>();
	}

	public void contrata(Funcionario funcionario) {
		this.folha.add(funcionario);
	}

	public double calculaMedia() {
		if (this.folha.isEmpty()) {
			return 0;
		}
		double s = 0;
		for (Funcionario funcionario: this.folha) {
			s += funcionario.getSalario();
		}
		return s / this.folha.size();
	}
}
