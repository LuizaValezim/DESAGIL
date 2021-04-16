package br.edu.insper.desagil.aula5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OferecimentoOldTest {
	private Oferecimento oferecimento;

	@BeforeEach
	public void setUp() {
		List<String> ementa = new ArrayList<>();
		Map<Date, String> plano = new HashMap<>();
		List<Aluno> alunos = new ArrayList<>();
		oferecimento = new Oferecimento(new Disciplina("DESSOFT", "Design de Software", ementa), plano, alunos);
	}

	@Test
	public void testConstructor() {
		List<String> expectedEmenta = new ArrayList<>();
		Map<Date, String> expectedPlano = new HashMap<>();
		List<Aluno> expectedAlunos = new ArrayList<>();

		assertEquals("DESSOFT", oferecimento.getDisciplina().getCodigo());
		assertEquals("Design de Software", oferecimento.getDisciplina().getNome());
		assertEquals(expectedEmenta, oferecimento.getDisciplina().getEmenta());
		assertEquals(expectedPlano, oferecimento.getPlano());
		assertEquals(expectedAlunos, oferecimento.getAlunos());
	}

	@Test
	public void testSetters() {
		List<String> ementa = new ArrayList<>();
		ementa.add("programação");
		Map<Date, String> plano = new HashMap<>();
		plano.put(new Date(0), "apresentação");
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno(1, "João"));

		oferecimento.setDisciplina(new Disciplina("DESAGIL", "Desenvolvimento Colaborativo Ágil", ementa));
		oferecimento.setPlano(plano);
		oferecimento.setAlunos(alunos);

		List<String> expectedEmenta = new ArrayList<>();
		expectedEmenta.add("programação");
		Map<Date, String> expectedPlano = new HashMap<>();
		expectedPlano.put(new Date(0), "apresentação");
		List<Aluno> expectedAlunos = new ArrayList<>();
		expectedAlunos.add(new Aluno(1, "João"));

		assertEquals("DESAGIL", oferecimento.getDisciplina().getCodigo());
		assertEquals("Desenvolvimento Colaborativo Ágil", oferecimento.getDisciplina().getNome());
		assertEquals(expectedEmenta, oferecimento.getDisciplina().getEmenta());
		assertEquals(expectedPlano.size(), oferecimento.getPlano().size());
		assertEquals(expectedPlano.get(new Date(0)), oferecimento.getPlano().get(new Date(0)));
		assertEquals(expectedAlunos.size(), oferecimento.getAlunos().size());
		assertEquals(expectedAlunos.get(0).getId(), oferecimento.getAlunos().get(0).getId());
		assertEquals(expectedAlunos.get(0).getNome(), oferecimento.getAlunos().get(0).getNome());
	}
}
