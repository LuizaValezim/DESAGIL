package sim;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estabelecimento {
	// Atributos
	private String nome;
	private Map<Integer, Item> itens;

	// Construtor
	public Estabelecimento(String nome) {
		this.nome = nome;
		this.itens = new HashMap<>();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void addDicionario(int codigo, Item item){
		this.itens.put(codigo, item);
	}
	
	public double somaPrecos(List<Integer> codigos) {
		double soma = 0.0;
		
		for (int codigo:codigos) {
			double preco = this.itens.get(codigo).getPreco();
			soma = soma + preco;
		}	
		return soma;
	}
}