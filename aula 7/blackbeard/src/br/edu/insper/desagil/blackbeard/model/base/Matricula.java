package br.edu.insper.desagil.blackbeard.model.base;

public class Matricula {
	private Aluno aluno;
	private boolean trancada;

	public Matricula(Aluno aluno) {
		this.aluno = aluno;
		this.trancada = false;
	}

	public Aluno getAluno() {
		return this.aluno;
	}

	public boolean isTrancada() {
		return this.trancada;
	}
}
