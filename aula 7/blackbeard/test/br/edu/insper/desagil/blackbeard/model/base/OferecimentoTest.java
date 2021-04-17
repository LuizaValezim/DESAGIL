package br.edu.insper.desagil.blackbeard.model.base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OferecimentoTest {
	private Oferecimento oferecimento;

	@BeforeEach
	public void setUp() {
		oferecimento = new Oferecimento(new Disciplina("DESSOFT", "Design de Software"));
	}

	@Test
	public void testConstructor() {
		Map<Date, String> expectedPlano = new HashMap<>();
		List<Matricula> expectedMatriculas = new ArrayList<>();

		assertEquals("DESSOFT", oferecimento.getDisciplina().getCodigo());
		assertEquals("Design de Software", oferecimento.getDisciplina().getNome());
		assertEquals(expectedPlano, oferecimento.getPlano());
	}
}
