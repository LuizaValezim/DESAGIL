package br.edu.insper.desagil.rh;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	private List<Funcionario> funcionarios;

	public Gerente(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase);
		this.funcionarios = new ArrayList<>();
	}

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void adicionaFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
}
