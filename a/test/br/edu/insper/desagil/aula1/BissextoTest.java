package br.edu.insper.desagil.aula1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BissextoTest {
	private Bissexto b;

	@BeforeEach
	private void setUp() {
		b = new Bissexto();
	}

    @Test
    public void devolveTrueSeRecebe2000() {
		assertTrue(b.decide(2000));
	}

    @Test
    public void devolveFalseSeRecebe2001() {
		assertFalse(b.decide(2001));
	}

    @Test
    public void devolveFalseSeRecebe2002() {
		assertFalse(b.decide(2002));
	}

    @Test
    public void devolveFalseSeRecebe2003() {
		assertFalse(b.decide(2003));
	}

    @Test
    public void devolveTrueSeRecebe2004() {
		assertTrue(b.decide(2004));
	}

    @Test
    public void devolveFalseSeRecebe2005() {
		assertFalse(b.decide(2005));
	}

    @Test
    public void devolveFalseSeRecebe2006() {
		assertFalse(b.decide(2006));
	}

    @Test
    public void devolveFalseSeRecebe2007() {
		assertFalse(b.decide(2007));
	}

    @Test
    public void devolveTrueSeRecebe2008() {
		assertTrue(b.decide(2008));
	}

    @Test
    public void devolveFalseSeRecebe2009() {
		assertFalse(b.decide(2009));
	}

    @Test
    public void devolveFalseSeRecebe2010() {
		assertFalse(b.decide(2010));
	}

    @Test
    public void devolveFalseSeRecebe2011() {
		assertFalse(b.decide(2011));
	}

    @Test
    public void devolveTrueSeRecebe2012() {
		assertTrue(b.decide(2012));
	}

    @Test
    public void devolveFalseSeRecebe2013() {
		assertFalse(b.decide(2013));
	}

    @Test
    public void devolveFalseSeRecebe2014() {
		assertFalse(b.decide(2014));
	}

    @Test
    public void devolveFalseSeRecebe2015() {
		assertFalse(b.decide(2015));
	}

    @Test
    public void devolveTrueSeRecebe2016() {
		assertTrue(b.decide(2016));
	}

    @Test
    public void devolveFalseSeRecebe2017() {
		assertFalse(b.decide(2017));
	}

    @Test
    public void devolveFalseSeRecebe2018() {
		assertFalse(b.decide(2018));
	}

    @Test
    public void devolveFalseSeRecebe2019() {
		assertFalse(b.decide(2019));
	}

    @Test
    public void devolveTrueSeRecebe2020() {
		assertTrue(b.decide(2020));
	}
}
