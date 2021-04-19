package br.edu.insper.desagil.rh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiretorDeMarketing extends Diretor {
	private List<String> portfolio;

	public DiretorDeMarketing(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase, "Marketing");
		this.portfolio = new ArrayList<>();
	}

	public List<String> getPortfolio() {
		return Collections.unmodifiableList(this.portfolio);
	}

	public void adicionaItem(String item) {
		this.portfolio.add(item);
	}

	@Override
	public String getTitulo() {
		return getNome() + " (CMO)";
	}
}
