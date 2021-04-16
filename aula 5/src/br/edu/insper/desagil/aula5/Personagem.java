package br.edu.insper.desagil.aula5;

public class Personagem {
	private String nome;
	private int forca;
	private double precisao;
	private int x;
	private int y;

	public Personagem(String nome, int forca, double precisao, int x, int y) {
		this.nome = nome;
		this.forca = forca;
		this.precisao = precisao;
		this.x = x;
		this.y = y;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return this.forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}

	public double getPrecisao() {
		return this.precisao;
	}
	public void setPrecisao(double precisao) {
		this.precisao = precisao;
	}

	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
