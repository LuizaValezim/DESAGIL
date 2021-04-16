package br.edu.insper.desagil.aula1;

public class Calculadora {

	public double executa(int a, int b, char op) {
		if (op == '+') {
			return a + b;
		}
		
		else if (op == '-') {
			return a - b;
		}
		
		else if (op == '/') {
			if (b == 0) {
				return 0.0;
			}
			return (double) a/b;
		}
		
		else if (op == '*') {
			return a * b;
		}
		
		else {
			return 0.0;
		}
	}
}
