package br.edu.insper.desagil.aula5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Oferecimento {
	
	// Atributos
	private Disciplina disciplina;
	private Map<Date, String> plano;
	private List<Matricula> matriculas;
	
	
	// Construtor
	public Oferecimento(Disciplina disciplina, Map<Date, String> plano, List<Matricula> matriculas) {
		super();
		this.disciplina = disciplina;
		this.plano = plano;
		this.matriculas = matriculas;
	}

	
	// Getters and Setters
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Map<Date, String> getPlano() {
		return plano;
	}

	public void setPlano(Map<Date, String> plano) {
		this.plano = plano;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}