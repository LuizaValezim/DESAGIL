package br.edu.insper.desagil.aula4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimoTest {
	private Primo p;

	@BeforeEach
	private void setUp() {
		p = new Primo();
	}

	@Test
	public void devolve1SeRecebe2() {
		assertEquals(1, p.conta(2));
	}

	@Test
	public void devolve2SeRecebe3() {
		assertEquals(2, p.conta(3));
	}

	@Test
	public void devolve2SeRecebe4() {
		assertEquals(2, p.conta(4));
	}

	@Test
	public void devolve3SeRecebe5() {
		assertEquals(3, p.conta(5));
	}

	@Test
	public void devolve3SeRecebe6() {
		assertEquals(3, p.conta(6));
	}

	@Test
	public void devolve4SeRecebe7() {
		assertEquals(4, p.conta(7));
	}

	@Test
	public void devolve4SeRecebe8() {
		assertEquals(4, p.conta(8));
	}

	@Test
	public void devolve4SeRecebe9() {
		assertEquals(4, p.conta(9));
	}

	@Test
	public void devolve4SeRecebe10() {
		assertEquals(4, p.conta(10));
	}

	@Test
	public void devolve5SeRecebe11() {
		assertEquals(5, p.conta(11));
	}

	@Test
	public void devolve5SeRecebe12() {
		assertEquals(5, p.conta(12));
	}

	@Test
	public void devolve6SeRecebe13() {
		assertEquals(6, p.conta(13));
	}
}
