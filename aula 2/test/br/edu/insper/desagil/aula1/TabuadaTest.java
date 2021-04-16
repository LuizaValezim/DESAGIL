package br.edu.insper.desagil.aula1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabuadaTest {
	private Tabuada t;

	@BeforeEach
	private void setUp() {
		t = new Tabuada();
	}

	@Test
	public void constroiPara1() {
		assertEquals(String.join("",
			"1 \n"
		), t.constroi(1));
	}

	@Test
	public void constroiPara2() {
		assertEquals(String.join("",
			"1 2 \n",
			"2 4 \n"
		), t.constroi(2));
	}

	@Test
	public void constroiPara3() {
		assertEquals(String.join("",
			"1 2 3 \n",
			"2 4 6 \n",
			"3 6 9 \n"
		), t.constroi(3));
	}

	@Test
	public void constroiPara4() {
		assertEquals(String.join("",
			"1 2 3 4 \n",
			"2 4 6 8 \n",
			"3 6 9 12 \n",
			"4 8 12 16 \n"
		), t.constroi(4));
	}

	@Test
	public void constroiPara5() {
		assertEquals(String.join("",
			"1 2 3 4 5 \n",
			"2 4 6 8 10 \n",
			"3 6 9 12 15 \n",
			"4 8 12 16 20 \n",
			"5 10 15 20 25 \n"
		), t.constroi(5));
	}
}
