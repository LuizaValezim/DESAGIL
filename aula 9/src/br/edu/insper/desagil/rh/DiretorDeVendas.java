package br.edu.insper.desagil.rh;

public class DiretorDeVendas extends Diretor {
	private double faturamentoTotal;

	public DiretorDeVendas(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase, "Vendas");
		this.faturamentoTotal = 0;
	}

	public void incrementaFaturamento(double faturamento) {
		this.faturamentoTotal += faturamento;
	}

	@Override
	public double getSalario() {
		return super.getSalario() + 0.1 * this.faturamentoTotal;
	}

	@Override
	public String getTitulo() {
		return getNome() + " (CSO)";
	}
}
