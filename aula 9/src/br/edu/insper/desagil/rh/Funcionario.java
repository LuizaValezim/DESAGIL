package br.edu.insper.desagil.rh;

public class Funcionario {
	private int id;
	private String nome;
	private double salarioBase;

	public Funcionario(int id, String nome, double salarioBase) {
		this.id = id;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getId() {
		return this.id;
	}

	public double getSalario() {
		return getSalarioBase();
	}
}
