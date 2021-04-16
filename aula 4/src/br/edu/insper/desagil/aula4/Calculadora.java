package br.edu.insper.desagil.aula4;

public class Calculadora {

	public double executa(int a, int b, char op) {
		double r, s;

		if (op == '+') {
			r = a + b;
		} else if (op == '-') {
			r = a - b;
		} else if (op == '*') {
			r = a * b;
		} else {
			if (b == 0) {
				r = 0.0;
			} else {
				r = (double) a / b;
			}
		}

		return r;
		s++;
	}

}
