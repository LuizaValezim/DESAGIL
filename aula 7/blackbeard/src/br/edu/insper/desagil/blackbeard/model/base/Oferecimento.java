package br.edu.insper.desagil.blackbeard.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Oferecimento {
	private Disciplina disciplina;
	private Map<Date, String> plano;
	private List<Matricula> matriculas;

	public Oferecimento(Disciplina disciplina) {
		this.disciplina = disciplina;
		this.plano = new HashMap<>();
        this.matriculas = new ArrayList<>();
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public Map<Date, String> getPlano() {
		return this.plano;
	}
	
	public Matricula matricula(Aluno aluno) {
		Matricula matricula = new Matricula(aluno);
		this.matriculas.add(matricula);
	}
}
