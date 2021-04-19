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
		assertEquals("DESSOFT: Design de Software", disciplina.toString());
	}

	@Test
	public void testSetters() {
		List<String> ementa = new ArrayList<>();
		ementa.add("programaÃ§Ã£o");

		disciplina.setCodigo("DESAGIL");
		disciplina.setNome("Desenvolvimento Colaborativo Ã�gil");
		disciplina.setEmenta(ementa);

		List<String> expectedEmenta = new ArrayList<>();
		expectedEmenta.add("programaÃ§Ã£o");

		assertEquals("DESAGIL", disciplina.getCodigo());
		assertEquals("Desenvolvimento Colaborativo Ã�gil", disciplina.getNome());
		assertEquals(expectedEmenta, disciplina.getEmenta());
	}
}
