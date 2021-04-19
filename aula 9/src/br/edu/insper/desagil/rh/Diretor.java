package br.edu.insper.desagil.rh;

public abstract class Diretor extends Funcionario {
	private String departamento;

	public Diretor(int id, String nome, double salarioBase, String departamento) {
		super(id, nome, salarioBase);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	@Override
	public double getSalario() {
		return 2 * getSalarioBase();
	}

	public abstract String getTitulo();
}
