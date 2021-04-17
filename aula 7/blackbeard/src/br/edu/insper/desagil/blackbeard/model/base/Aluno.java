package br.edu.insper.desagil.blackbeard.model.base;

public class Aluno {
	private int id;
	private String nome;

	public Aluno(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	
	// Métodos
	
	public String toString() {
		return this.id + ": " + this.nome;
	}
}