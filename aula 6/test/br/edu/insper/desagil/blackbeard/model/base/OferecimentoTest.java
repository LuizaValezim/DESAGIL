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
		List<String> ementa = new ArrayList<>();
		Map<Date, String> plano = new HashMap<>();
		List<Matricula> matriculas = new ArrayList<>();
		oferecimento = new Oferecimento(new Disciplina("DESSOFT", "Design de Software", ementa), plano, matriculas);
	}

	@Test
	public void testConstructor() {
		List<String> expectedEmenta = new ArrayList<>();
		Map<Date, String> expectedPlano = new HashMap<>();
		List<Matricula> expectedMatriculas = new ArrayList<>();

		assertEquals("DESSOFT", oferecimento.getDisciplina().getCodigo());
		assertEquals("Design de Software", oferecimento.getDisciplina().getNome());
		assertEquals(expectedEmenta, oferecimento.getDisciplina().getEmenta());
		assertEquals(expectedPlano, oferecimento.getPlano());
		assertEquals(expectedMatriculas, oferecimento.getMatriculas());
	}

	@Test
	public void testSetters() {
		List<String> ementa = new ArrayList<>();
		ementa.add("programação");
		Map<Date, String> plano = new HashMap<>();
		plano.put(new Date(0), "apresentação");
		List<Matricula> matriculas = new ArrayList<>();
		matriculas.add(new Matricula(new Aluno(1, "João"), true));

		oferecimento.setDisciplina(new Disciplina("DESAGIL", "Desenvolvimento Colaborativo Ágil", ementa));
		oferecimento.setPlano(plano);
		oferecimento.setMatriculas(matriculas);

		List<String> expectedEmenta = new ArrayList<>();
		expectedEmenta.add("programação");
		Map<Date, String> expectedPlano = new HashMap<>();
		expectedPlano.put(new Date(0), "apresentação");
		List<Matricula> expectedMatriculas = new ArrayList<>();
		expectedMatriculas.add(new Matricula(new Aluno(1, "João"), true));

		assertEquals("DESAGIL", oferecimento.getDisciplina().getCodigo());
		assertEquals("Desenvolvimento Colaborativo Ágil", oferecimento.getDisciplina().getNome());
		assertEquals(expectedEmenta, oferecimento.getDisciplina().getEmenta());
		assertEquals(expectedPlano.size(), oferecimento.getPlano().size());
		assertEquals(expectedPlano.get(new Date(0)), oferecimento.getPlano().get(new Date(0)));
		assertEquals(expectedMatriculas.size(), oferecimento.getMatriculas().size());
		assertEquals(expectedMatriculas.get(0).getAluno().getId(), oferecimento.getMatriculas().get(0).getAluno().getId());
		assertEquals(expectedMatriculas.get(0).getAluno().getNome(), oferecimento.getMatriculas().get(0).getAluno().getNome());
		assertEquals(expectedMatriculas.get(0).isTrancada(), oferecimento.getMatriculas().get(0).isTrancada());
	}
}
