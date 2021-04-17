package br.edu.insper.desagil.blackbeard.model.base;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Oferecimento {
	private Disciplina disciplina;
	private Map<Date, String> plano;
	private List<Matricula> matriculas;

	public Oferecimento(Disciplina disciplina, Map<Date, String> plano, List<Matricula> matriculas) {
		this.disciplina = disciplina;
		this.plano = plano;
		this.matriculas = matriculas;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Map<Date, String> getPlano() {
		return this.plano;
	}
	public void setPlano(Map<Date, String> plano) {
		this.plano = plano;
	}

	public List<Matricula> getMatriculas() {
		return this.matriculas;
	}
	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}
