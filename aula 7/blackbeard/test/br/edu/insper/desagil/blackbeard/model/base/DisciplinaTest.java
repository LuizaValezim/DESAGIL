package br.edu.insper.desagil.blackbeard.model.base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisciplinaTest {
	private Disciplina disciplina;

	@BeforeEach
	public void setUp() {
		disciplina = new Disciplina("DESSOFT", "Design de Software");
	}

	@Test
	public void testConstructor() {

		assertEquals("DESSOFT", disciplina.getCodigo());
		assertEquals("Design de Software", disciplina.getNome());
	}
}
