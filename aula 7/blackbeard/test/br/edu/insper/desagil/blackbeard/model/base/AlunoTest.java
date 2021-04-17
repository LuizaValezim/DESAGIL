package br.edu.insper.desagil.blackbeard.model.base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	private Aluno aluno;

	@BeforeEach
	public void setUp() {
		aluno = new Aluno(1, "João");
	}

	@Test
	public void testConstructor() {
		assertEquals(1, aluno.getId());
		assertEquals("João", aluno.getNome());
	}
}
