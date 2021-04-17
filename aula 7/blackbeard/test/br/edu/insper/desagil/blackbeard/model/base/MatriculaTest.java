package br.edu.insper.desagil.blackbeard.model.base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatriculaTest {
	private Matricula matricula;

	@BeforeEach
	public void setUp() {
		matricula = new Matricula(new Aluno(1, "João"));
	}

	@Test
	public void testConstructor() {
		assertEquals(1, matricula.getAluno().getId());
		assertEquals("João", matricula.getAluno().getNome());
		assertEquals(false, matricula.isTrancada());
	}
}
