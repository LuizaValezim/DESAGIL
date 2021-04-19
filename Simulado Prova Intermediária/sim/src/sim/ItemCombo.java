package sim;

import java.util.List;

public class ItemCombo extends Item {
	private double desconto;
	private List<ItemComum> itens;
	
	// Construtor
	public ItemCombo(String nome, double desconto, List<ItemComum> itens) {
		super(nome);
		this.desconto = desconto;
		this.itens = itens;
	}
	
	// Métodos
	@Override
	public double getPreco() {
		double total = 0.0;
		
		for (ItemComum i : this.itens) {
			total = total + i.getPreco();
		}
		
		return total*desconto;
	}
	
}