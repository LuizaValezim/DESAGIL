package br.edu.insper.desagil.blackbeard.model.base;

public class Matricula {
	private Aluno aluno;
	private boolean trancada;

	public Matricula(Aluno aluno, boolean trancada) {
		this.aluno = aluno;
		this.trancada = trancada;
	}

	public Aluno getAluno() {
		return this.aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public boolean isTrancada() {
		return this.trancada;
	}
	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}
}
