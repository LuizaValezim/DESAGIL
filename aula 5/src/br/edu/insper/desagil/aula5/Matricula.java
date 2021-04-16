package br.edu.insper.desagil.aula5;

public class Matricula {
	
	// Atributos
	private Aluno aluno;
	private boolean trancada;
	
	// Construtor
	public Matricula(Aluno aluno, boolean trancada) {
		super();
		this.aluno = aluno;
		this.trancada = trancada;
	}

	// Getters and Setters
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public boolean isTrancada() {
		return trancada;
	}

	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}
	
	
	
	
}