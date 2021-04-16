package br.edu.insper.desagil.aula1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaixaTest {
	private Faixa f;

	@BeforeEach
	private void setUp() {
		f = new Faixa();
	}

    @Test
    public void devolveJovemSeRecebe1() {
		assertEquals("jovem", f.calcula(1));
	}

    @Test
    public void devolveJovemSeRecebe9() {
		assertEquals("jovem", f.calcula(9));
	}

    @Test
    public void devolveJovemSeRecebe17() {
		assertEquals("jovem", f.calcula(17));
	}

    @Test
    public void devolveAdultoSeRecebe18() {
		assertEquals("adulto", f.calcula(18));
	}

    @Test
    public void devolveAdultoSeRecebe19() {
		assertEquals("adulto", f.calcula(19));
	}

    @Test
    public void devolveAdultoSeRecebe39() {
		assertEquals("adulto", f.calcula(39));
	}

    @Test
    public void devolveAdultoSeRecebe59() {
		assertEquals("adulto", f.calcula(59));
	}

    @Test
    public void devolveIdosoSeRecebe60() {
		assertEquals("idoso", f.calcula(60));
	}

    @Test
    public void devolveIdosoSeRecebe61() {
		assertEquals("idoso", f.calcula(61));
	}

    @Test
    public void devolveIdosoSeRecebe80() {
		assertEquals("idoso", f.calcula(80));
	}

    @Test
    public void devolveIdosoSeRecebe100() {
		assertEquals("idoso", f.calcula(100));
	}
}
