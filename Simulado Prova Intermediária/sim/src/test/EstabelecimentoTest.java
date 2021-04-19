package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import sim.Estabelecimento;
import sim.ItemCombo;
import sim.ItemComum;

public class EstabelecimentoTest {
	private static double DELTA = 0.01;
	private Estabelecimento estab;
	private List<Integer> codigos;
	
	@BeforeEach
	public void setUp() {
		estab = new Estabelecimento("Coffee Shop");
		codigos = new ArrayList<>();
	}
	
	@Test
	public void teste1() {
		estab.addDicionario(1, new ItemComum("Frapuccino", 8.99));
		estab.addDicionario(2, new ItemComum("Capuccino", 9.99));
		estab.addDicionario(3, new ItemComum("Água", 4.99));
		
		codigos.add(1);
		codigos.add(3);
		
		assertEquals(13.98, estab.somaPrecos(codigos), DELTA);
	}
	
	
	@Test
	public void teste2() {
		List<ItemComum> itensCombo = new ArrayList<>();
		
		itensCombo.add(new ItemComum("Copo personalizado", 20));
		itensCombo.add(new ItemComum("Canudo personalizado", 12));
		itensCombo.add(new ItemComum("Caneta personalizada", 18));
		
		estab.addDicionario(1, new ItemComum("Café", 5));
		estab.addDicionario(2, new ItemComum("Pão de queijo", 4));
		estab.addDicionario(3, new ItemCombo("Combo personlizado", 0.9, itensCombo));
		
		codigos.add(1);
		codigos.add(2);
		codigos.add(3);
		
		assertEquals(54, estab.somaPrecos(codigos), DELTA);
	}
	
	@Test
	public void teste3() {
		List<ItemComum> itensCombo1 = new ArrayList<>();
		List<ItemComum> itensCombo2 = new ArrayList<>();
		
		itensCombo1.add(new ItemComum("Copo personalizado", 20));
		itensCombo1.add(new ItemComum("Canudo personalizado", 12));
		itensCombo1.add(new ItemComum("Caneta personalizada", 18));
		
		itensCombo2.add(new ItemComum("Copo criança", 14.99));
		itensCombo2.add(new ItemComum("Canudo criança", 9.99));
		itensCombo2.add(new ItemComum("Caneta criança", 5.99));
		
		estab.addDicionario(1, new ItemComum("Café", 5));
		estab.addDicionario(2, new ItemCombo("Combo personlizado", 0.9, itensCombo1));
		estab.addDicionario(3, new ItemCombo("Combo criança", 0.5, itensCombo2));
		
		codigos.add(1);
		codigos.add(2);
		codigos.add(3);
		
		assertEquals(65.485, estab.somaPrecos(codigos), DELTA);
		
	}
}
