package br.edu.insper.desagil.aula5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisciplinaOldTest {
	private Disciplina disciplina;

	@BeforeEach
	public void setUp() {
		List<String> ementa = new ArrayList<>();
		Map<Date, String> plano = new HashMap<>();
		disciplina = new Disciplina("DESSOFT", "Design de Software", ementa, plano);
	}

	@Test
	public void testConstructor() {
		List<String> expectedEmenta = new ArrayList<>();
		Map<Date, String> expectedPlano = new HashMap<>();

		assertEquals("DESSOFT", disciplina.getCodigo());
		assertEquals("Design de Software", disciplina.getNome());
		assertEquals(expectedEmenta, disciplina.getEmenta());
		assertEquals(expectedPlano, disciplina.getPlano());
	}

	@Test
	public void testSetters() {
		List<String> ementa = new ArrayList<>();
		ementa.add("programação");
		Map<Date, String> plano = new HashMap<>();
		plano.put(new Date(0), "apresentação");

		disciplina.setCodigo("DESAGIL");
		disciplina.setNome("Desenvolvimento Colaborativo Ágil");
		disciplina.setEmenta(ementa);
		disciplina.setPlano(plano);

		List<String> expectedEmenta = new ArrayList<>();
		expectedEmenta.add("programação");
		Map<Date, String> expectedPlano = new HashMap<>();
		expectedPlano.put(new Date(0), "apresentação");

		assertEquals("DESAGIL", disciplina.getCodigo());
		assertEquals("Desenvolvimento Colaborativo Ágil", disciplina.getNome());
		assertEquals(expectedEmenta, disciplina.getEmenta());
		assertEquals(expectedPlano, disciplina.getPlano());
	}
}
