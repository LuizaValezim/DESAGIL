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
		List<String> ementa = new ArrayList<>();
		disciplina = new Disciplina("DESSOFT", "Design de Software", ementa);
	}

	@Test
	public void testConstructor() {
		List<String> expectedEmenta = new ArrayList<>();

		assertEquals("DESSOFT", disciplina.getCodigo());
		assertEquals("Design de Software", disciplina.getNome());
		assertEquals(expectedEmenta, disciplina.getEmenta());
	}

	@Test
	public void testSetters() {
		List<String> ementa = new ArrayList<>();
		ementa.add("programação");

		disciplina.setCodigo("DESAGIL");
		disciplina.setNome("Desenvolvimento Colaborativo Ágil");
		disciplina.setEmenta(ementa);

		List<String> expectedEmenta = new ArrayList<>();
		expectedEmenta.add("programação");

		assertEquals("DESAGIL", disciplina.getCodigo());
		assertEquals("Desenvolvimento Colaborativo Ágil", disciplina.getNome());
		assertEquals(expectedEmenta, disciplina.getEmenta());
	}
}
