package br.edu.insper.desagil.aula4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CumulativoTest {
	private Cumulativo c;

	@BeforeEach
	private void setUp() {
		c = new Cumulativo();
	}

	@Test
	public void test0() {
		assertEquals(Arrays.asList(0), c.calcula(Arrays.asList(0)));
	}

	@Test
	public void test1() {
		assertEquals(Arrays.asList(1), c.calcula(Arrays.asList(1)));
	}

	@Test
	public void test5() {
		assertEquals(Arrays.asList(5), c.calcula(Arrays.asList(5)));
	}

	@Test
	public void test0e0e0() {
		assertEquals(Arrays.asList(0, 0, 0), c.calcula(Arrays.asList(0, 0, 0)));
	}

	@Test
	public void test1e1e1() {
		assertEquals(Arrays.asList(1, 2, 3), c.calcula(Arrays.asList(1, 1, 1)));
	}

	@Test
	public void test5e5e5() {
		assertEquals(Arrays.asList(5, 10, 15), c.calcula(Arrays.asList(5, 5, 5)));
	}

	@Test
	public void test1e3e5() {
		assertEquals(Arrays.asList(1, 4, 9), c.calcula(Arrays.asList(1, 3, 5)));
	}

	@Test
	public void test1e1e3() {
		assertEquals(Arrays.asList(1, 2, 5), c.calcula(Arrays.asList(1, 1, 3)));
	}

	@Test
	public void test1e3e3() {
		assertEquals(Arrays.asList(1, 4, 7), c.calcula(Arrays.asList(1, 3, 3)));
	}

	@Test
	public void test5e3e1() {
		assertEquals(Arrays.asList(5, 8, 9), c.calcula(Arrays.asList(5, 3, 1)));
	}

	@Test
	public void test5e5e3() {
		assertEquals(Arrays.asList(5, 10, 13), c.calcula(Arrays.asList(5, 5, 3)));
	}

	@Test
	public void test5e3e3() {
		assertEquals(Arrays.asList(5, 8, 11), c.calcula(Arrays.asList(5, 3, 3)));
	}

	@Test
	public void test0e0e0e0e0() {
		assertEquals(Arrays.asList(0, 0, 0, 0, 0), c.calcula(Arrays.asList(0, 0, 0, 0, 0)));
	}

	@Test
	public void test1e1e1e1e1() {
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), c.calcula(Arrays.asList(1, 1, 1, 1, 1)));
	}

	@Test
	public void test5e5e5e5e5() {
		assertEquals(Arrays.asList(5, 10, 15, 20, 25), c.calcula(Arrays.asList(5, 5, 5, 5, 5)));
	}

	@Test
	public void test1e2e3e4e5() {
		assertEquals(Arrays.asList(1, 3, 6, 10, 15), c.calcula(Arrays.asList(1, 2, 3, 4, 5)));
	}

	@Test
	public void test1e1e1e2e3() {
		assertEquals(Arrays.asList(1, 2, 3, 5, 8), c.calcula(Arrays.asList(1, 1, 1, 2, 3)));
	}

	@Test
	public void test1e2e3e3e3() {
		assertEquals(Arrays.asList(1, 3, 6, 9, 12), c.calcula(Arrays.asList(1, 2, 3, 3, 3)));
	}

	@Test
	public void test5e4e3e2e1() {
		assertEquals(Arrays.asList(5, 9, 12, 14, 15), c.calcula(Arrays.asList(5, 4, 3, 2, 1)));
	}

	@Test
	public void test5e5e5e4e3() {
		assertEquals(Arrays.asList(5, 10, 15, 19, 22), c.calcula(Arrays.asList(5, 5, 5, 4, 3)));
	}

	@Test
	public void test5e4e3e3e3() {
		assertEquals(Arrays.asList(5, 9, 12, 15, 18), c.calcula(Arrays.asList(5, 4, 3, 3, 3)));
	}
}
