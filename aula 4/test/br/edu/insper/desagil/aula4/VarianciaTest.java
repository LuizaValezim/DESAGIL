package br.edu.insper.desagil.aula4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VarianciaTest {
	private static double DELTA = 0.000001;

	private Estatistica v;

	@BeforeEach
	private void setUp() {
		v = new Estatistica();
	}

	@Test
	public void soN5() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(-5)), DELTA);
	}

	@Test
	public void soN1() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(-1)), DELTA);
	}

	@Test
	public void soZero() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(0)), DELTA);
	}

	@Test
	public void soP1() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(1)), DELTA);
	}

	@Test
	public void soP5() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(5)), DELTA);
	}

	@Test
	public void N5N5() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(-5, -5)), DELTA);
	}

	@Test
	public void N5N1() {
		assertEquals(4.0, v.calculaVariancia(Arrays.asList(-5, -1)), DELTA);
	}

	@Test
	public void N5Zero() {
		assertEquals(6.25, v.calculaVariancia(Arrays.asList(-5, 0)), DELTA);
	}

	@Test
	public void N5P1() {
		assertEquals(9.0, v.calculaVariancia(Arrays.asList(-5, 1)), DELTA);
	}

	@Test
	public void N5P5() {
		assertEquals(25.0, v.calculaVariancia(Arrays.asList(-5, 5)), DELTA);
	}

	@Test
	public void N1N5() {
		assertEquals(4.0, v.calculaVariancia(Arrays.asList(-1, -5)), DELTA);
	}

	@Test
	public void N1N1() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(-1, -1)), DELTA);
	}

	@Test
	public void N1Zero() {
		assertEquals(0.25, v.calculaVariancia(Arrays.asList(-1, 0)), DELTA);
	}

	@Test
	public void N1P1() {
		assertEquals(1.0, v.calculaVariancia(Arrays.asList(-1, 1)), DELTA);
	}

	@Test
	public void N1P5() {
		assertEquals(9.0, v.calculaVariancia(Arrays.asList(-1, 5)), DELTA);
	}

	@Test
	public void ZeroN5() {
		assertEquals(6.25, v.calculaVariancia(Arrays.asList(0, -5)), DELTA);
	}

	@Test
	public void ZeroN1() {
		assertEquals(0.25, v.calculaVariancia(Arrays.asList(0, -1)), DELTA);
	}

	@Test
	public void ZeroZero() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(0, 0)), DELTA);
	}

	@Test
	public void ZeroP1() {
		assertEquals(0.25, v.calculaVariancia(Arrays.asList(0, 1)), DELTA);
	}

	@Test
	public void ZeroP5() {
		assertEquals(6.25, v.calculaVariancia(Arrays.asList(0, 5)), DELTA);
	}

	@Test
	public void P1N5() {
		assertEquals(9.0, v.calculaVariancia(Arrays.asList(1, -5)), DELTA);
	}

	@Test
	public void P1N1() {
		assertEquals(1.0, v.calculaVariancia(Arrays.asList(1, -1)), DELTA);
	}

	@Test
	public void P1Zero() {
		assertEquals(0.25, v.calculaVariancia(Arrays.asList(1, 0)), DELTA);
	}

	@Test
	public void P1P1() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(1, 1)), DELTA);
	}

	@Test
	public void P1P5() {
		assertEquals(4.0, v.calculaVariancia(Arrays.asList(1, 5)), DELTA);
	}

	@Test
	public void P5N5() {
		assertEquals(25.0, v.calculaVariancia(Arrays.asList(5, -5)), DELTA);
	}

	@Test
	public void P5N1() {
		assertEquals(9.0, v.calculaVariancia(Arrays.asList(5, -1)), DELTA);
	}

	@Test
	public void P5Zero() {
		assertEquals(6.25, v.calculaVariancia(Arrays.asList(5, 0)), DELTA);
	}

	@Test
	public void P5P1() {
		assertEquals(4.0, v.calculaVariancia(Arrays.asList(5, 1)), DELTA);
	}

	@Test
	public void P5P5() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(5, 5)), DELTA);
	}

	@Test
	public void N5N5N5() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(-5, -5, -5)), DELTA);
	}

	@Test
	public void N5N5N1() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(-5, -5, -1)), DELTA);
	}

	@Test
	public void N5N5Zero() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(-5, -5, 0)), DELTA);
	}

	@Test
	public void N5N5P1() {
		assertEquals(8.0, v.calculaVariancia(Arrays.asList(-5, -5, 1)), DELTA);
	}

	@Test
	public void N5N5P5() {
		assertEquals(22.222222, v.calculaVariancia(Arrays.asList(-5, -5, 5)), DELTA);
	}

	@Test
	public void N5N1N5() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(-5, -1, -5)), DELTA);
	}

	@Test
	public void N5N1N1() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(-5, -1, -1)), DELTA);
	}

	@Test
	public void N5N1Zero() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(-5, -1, 0)), DELTA);
	}

	@Test
	public void N5N1P1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(-5, -1, 1)), DELTA);
	}

	@Test
	public void N5N1P5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(-5, -1, 5)), DELTA);
	}

	@Test
	public void N5ZeroN5() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(-5, 0, -5)), DELTA);
	}

	@Test
	public void N5ZeroN1() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(-5, 0, -1)), DELTA);
	}

	@Test
	public void N5ZeroZero() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(-5, 0, 0)), DELTA);
	}

	@Test
	public void N5ZeroP1() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(-5, 0, 1)), DELTA);
	}

	@Test
	public void N5ZeroP5() {
		assertEquals(16.666666, v.calculaVariancia(Arrays.asList(-5, 0, 5)), DELTA);
	}

	@Test
	public void N5P1N5() {
		assertEquals(8.0, v.calculaVariancia(Arrays.asList(-5, 1, -5)), DELTA);
	}

	@Test
	public void N5P1N1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(-5, 1, -1)), DELTA);
	}

	@Test
	public void N5P1Zero() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(-5, 1, 0)), DELTA);
	}

	@Test
	public void N5P1P1() {
		assertEquals(8.000000, v.calculaVariancia(Arrays.asList(-5, 1, 1)), DELTA);
	}

	@Test
	public void N5P1P5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(-5, 1, 5)), DELTA);
	}

	@Test
	public void N5P5N5() {
		assertEquals(22.222222, v.calculaVariancia(Arrays.asList(-5, 5, -5)), DELTA);
	}

	@Test
	public void N5P5N1() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(-5, 5, -1)), DELTA);
	}

	@Test
	public void N5P5Zero() {
		assertEquals(16.666666, v.calculaVariancia(Arrays.asList(-5, 5, 0)), DELTA);
	}

	@Test
	public void N5P5P1() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(-5, 5, 1)), DELTA);
	}

	@Test
	public void N5P5P5() {
		assertEquals(22.222222, v.calculaVariancia(Arrays.asList(-5, 5, 5)), DELTA);
	}

	@Test
	public void N1N5N5() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(-1, -5, -5)), DELTA);
	}

	@Test
	public void N1N5N1() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(-1, -5, -1)), DELTA);
	}

	@Test
	public void N1N5Zero() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(-1, -5, 0)), DELTA);
	}

	@Test
	public void N1N5P1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(-1, -5, 1)), DELTA);
	}

	@Test
	public void N1N5P5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(-1, -5, 5)), DELTA);
	}

	@Test
	public void N1N1N5() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(-1, -1, -5)), DELTA);
	}

	@Test
	public void N1N1N1() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(-1, -1, -1)), DELTA);
	}

	@Test
	public void N1N1Zero() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(-1, -1, 0)), DELTA);
	}

	@Test
	public void N1N1P1() {
		assertEquals(0.888888, v.calculaVariancia(Arrays.asList(-1, -1, 1)), DELTA);
	}

	@Test
	public void N1N1P5() {
		assertEquals(8.000000, v.calculaVariancia(Arrays.asList(-1, -1, 5)), DELTA);
	}

	@Test
	public void N1ZeroN5() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(-1, 0, -5)), DELTA);
	}

	@Test
	public void N1ZeroN1() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(-1, 0, -1)), DELTA);
	}

	@Test
	public void N1ZeroZero() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(-1, 0, 0)), DELTA);
	}

	@Test
	public void N1ZeroP1() {
		assertEquals(0.666666, v.calculaVariancia(Arrays.asList(-1, 0, 1)), DELTA);
	}

	@Test
	public void N1ZeroP5() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(-1, 0, 5)), DELTA);
	}

	@Test
	public void N1P1N5() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(-1, 1, -5)), DELTA);
	}

	@Test
	public void N1P1N1() {
		assertEquals(0.888888, v.calculaVariancia(Arrays.asList(-1, 1, -1)), DELTA);
	}

	@Test
	public void N1P1Zero() {
		assertEquals(0.666666, v.calculaVariancia(Arrays.asList(-1, 1, 0)), DELTA);
	}

	@Test
	public void N1P1P1() {
		assertEquals(0.888888, v.calculaVariancia(Arrays.asList(-1, 1, 1)), DELTA);
	}

	@Test
	public void N1P1P5() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(-1, 1, 5)), DELTA);
	}

	@Test
	public void N1P5N5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(-1, 5, -5)), DELTA);
	}

	@Test
	public void N1P5N1() {
		assertEquals(8.000000, v.calculaVariancia(Arrays.asList(-1, 5, -1)), DELTA);
	}

	@Test
	public void N1P5Zero() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(-1, 5, 0)), DELTA);
	}

	@Test
	public void N1P5P1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(-1, 5, 1)), DELTA);
	}

	@Test
	public void N1P5P5() {
		assertEquals(8.0, v.calculaVariancia(Arrays.asList(-1, 5, 5)), DELTA);
	}

	@Test
	public void ZeroN5N5() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(0, -5, -5)), DELTA);
	}

	@Test
	public void ZeroN5N1() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(0, -5, -1)), DELTA);
	}

	@Test
	public void ZeroN5Zero() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(0, -5, 0)), DELTA);
	}

	@Test
	public void ZeroN5P1() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(0, -5, 1)), DELTA);
	}

	@Test
	public void ZeroN5P5() {
		assertEquals(16.666666, v.calculaVariancia(Arrays.asList(0, -5, 5)), DELTA);
	}

	@Test
	public void ZeroN1N5() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(0, -1, -5)), DELTA);
	}

	@Test
	public void ZeroN1N1() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(0, -1, -1)), DELTA);
	}

	@Test
	public void ZeroN1Zero() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(0, -1, 0)), DELTA);
	}

	@Test
	public void ZeroN1P1() {
		assertEquals(0.666666, v.calculaVariancia(Arrays.asList(0, -1, 1)), DELTA);
	}

	@Test
	public void ZeroN1P5() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(0, -1, 5)), DELTA);
	}

	@Test
	public void ZeroZeroN5() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(0, 0, -5)), DELTA);
	}

	@Test
	public void ZeroZeroN1() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(0, 0, -1)), DELTA);
	}

	@Test
	public void ZeroZeroZero() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(0, 0, 0)), DELTA);
	}

	@Test
	public void ZeroZeroP1() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(0, 0, 1)), DELTA);
	}

	@Test
	public void ZeroZeroP5() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(0, 0, 5)), DELTA);
	}

	@Test
	public void ZeroP1N5() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(0, 1, -5)), DELTA);
	}

	@Test
	public void ZeroP1N1() {
		assertEquals(0.666666, v.calculaVariancia(Arrays.asList(0, 1, -1)), DELTA);
	}

	@Test
	public void ZeroP1Zero() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(0, 1, 0)), DELTA);
	}

	@Test
	public void ZeroP1P1() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(0, 1, 1)), DELTA);
	}

	@Test
	public void ZeroP1P5() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(0, 1, 5)), DELTA);
	}

	@Test
	public void ZeroP5N5() {
		assertEquals(16.666666, v.calculaVariancia(Arrays.asList(0, 5, -5)), DELTA);
	}

	@Test
	public void ZeroP5N1() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(0, 5, -1)), DELTA);
	}

	@Test
	public void ZeroP5Zero() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(0, 5, 0)), DELTA);
	}

	@Test
	public void ZeroP5P1() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(0, 5, 1)), DELTA);
	}

	@Test
	public void ZeroP5P5() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(0, 5, 5)), DELTA);
	}

	@Test
	public void P1N5N5() {
		assertEquals(8.0, v.calculaVariancia(Arrays.asList(1, -5, -5)), DELTA);
	}

	@Test
	public void P1N5N1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(1, -5, -1)), DELTA);
	}

	@Test
	public void P1N5Zero() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(1, -5, 0)), DELTA);
	}

	@Test
	public void P1N5P1() {
		assertEquals(8.000000, v.calculaVariancia(Arrays.asList(1, -5, 1)), DELTA);
	}

	@Test
	public void P1N5P5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(1, -5, 5)), DELTA);
	}

	@Test
	public void P1N1N5() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(1, -1, -5)), DELTA);
	}

	@Test
	public void P1N1N1() {
		assertEquals(0.888888, v.calculaVariancia(Arrays.asList(1, -1, -1)), DELTA);
	}

	@Test
	public void P1N1Zero() {
		assertEquals(0.666666, v.calculaVariancia(Arrays.asList(1, -1, 0)), DELTA);
	}

	@Test
	public void P1N1P1() {
		assertEquals(0.888888, v.calculaVariancia(Arrays.asList(1, -1, 1)), DELTA);
	}

	@Test
	public void P1N1P5() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(1, -1, 5)), DELTA);
	}

	@Test
	public void P1ZeroN5() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(1, 0, -5)), DELTA);
	}

	@Test
	public void P1ZeroN1() {
		assertEquals(0.666666, v.calculaVariancia(Arrays.asList(1, 0, -1)), DELTA);
	}

	@Test
	public void P1ZeroZero() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(1, 0, 0)), DELTA);
	}

	@Test
	public void P1ZeroP1() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(1, 0, 1)), DELTA);
	}

	@Test
	public void P1ZeroP5() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(1, 0, 5)), DELTA);
	}

	@Test
	public void P1P1N5() {
		assertEquals(8.000000, v.calculaVariancia(Arrays.asList(1, 1, -5)), DELTA);
	}

	@Test
	public void P1P1N1() {
		assertEquals(0.888888, v.calculaVariancia(Arrays.asList(1, 1, -1)), DELTA);
	}

	@Test
	public void P1P1Zero() {
		assertEquals(0.222222, v.calculaVariancia(Arrays.asList(1, 1, 0)), DELTA);
	}

	@Test
	public void P1P1P1() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(1, 1, 1)), DELTA);
	}

	@Test
	public void P1P1P5() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(1, 1, 5)), DELTA);
	}

	@Test
	public void P1P5N5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(1, 5, -5)), DELTA);
	}

	@Test
	public void P1P5N1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(1, 5, -1)), DELTA);
	}

	@Test
	public void P1P5Zero() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(1, 5, 0)), DELTA);
	}

	@Test
	public void P1P5P1() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(1, 5, 1)), DELTA);
	}

	@Test
	public void P1P5P5() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(1, 5, 5)), DELTA);
	}

	@Test
	public void P5N5N5() {
		assertEquals(22.222222, v.calculaVariancia(Arrays.asList(5, -5, -5)), DELTA);
	}

	@Test
	public void P5N5N1() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(5, -5, -1)), DELTA);
	}

	@Test
	public void P5N5Zero() {
		assertEquals(16.666666, v.calculaVariancia(Arrays.asList(5, -5, 0)), DELTA);
	}

	@Test
	public void P5N5P1() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(5, -5, 1)), DELTA);
	}

	@Test
	public void P5N5P5() {
		assertEquals(22.222222, v.calculaVariancia(Arrays.asList(5, -5, 5)), DELTA);
	}

	@Test
	public void P5N1N5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(5, -1, -5)), DELTA);
	}

	@Test
	public void P5N1N1() {
		assertEquals(8.000000, v.calculaVariancia(Arrays.asList(5, -1, -1)), DELTA);
	}

	@Test
	public void P5N1Zero() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(5, -1, 0)), DELTA);
	}

	@Test
	public void P5N1P1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(5, -1, 1)), DELTA);
	}

	@Test
	public void P5N1P5() {
		assertEquals(8.0, v.calculaVariancia(Arrays.asList(5, -1, 5)), DELTA);
	}

	@Test
	public void P5ZeroN5() {
		assertEquals(16.666666, v.calculaVariancia(Arrays.asList(5, 0, -5)), DELTA);
	}

	@Test
	public void P5ZeroN1() {
		assertEquals(6.888888, v.calculaVariancia(Arrays.asList(5, 0, -1)), DELTA);
	}

	@Test
	public void P5ZeroZero() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(5, 0, 0)), DELTA);
	}

	@Test
	public void P5ZeroP1() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(5, 0, 1)), DELTA);
	}

	@Test
	public void P5ZeroP5() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(5, 0, 5)), DELTA);
	}

	@Test
	public void P5P1N5() {
		assertEquals(16.888888, v.calculaVariancia(Arrays.asList(5, 1, -5)), DELTA);
	}

	@Test
	public void P5P1N1() {
		assertEquals(6.222222, v.calculaVariancia(Arrays.asList(5, 1, -1)), DELTA);
	}

	@Test
	public void P5P1Zero() {
		assertEquals(4.666666, v.calculaVariancia(Arrays.asList(5, 1, 0)), DELTA);
	}

	@Test
	public void P5P1P1() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(5, 1, 1)), DELTA);
	}

	@Test
	public void P5P1P5() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(5, 1, 5)), DELTA);
	}

	@Test
	public void P5P5N5() {
		assertEquals(22.222222, v.calculaVariancia(Arrays.asList(5, 5, -5)), DELTA);
	}

	@Test
	public void P5P5N1() {
		assertEquals(8.0, v.calculaVariancia(Arrays.asList(5, 5, -1)), DELTA);
	}

	@Test
	public void P5P5Zero() {
		assertEquals(5.555555, v.calculaVariancia(Arrays.asList(5, 5, 0)), DELTA);
	}

	@Test
	public void P5P5P1() {
		assertEquals(3.555555, v.calculaVariancia(Arrays.asList(5, 5, 1)), DELTA);
	}

	@Test
	public void P5P5P5() {
		assertEquals(0.0, v.calculaVariancia(Arrays.asList(5, 5, 5)), DELTA);
	}
}
