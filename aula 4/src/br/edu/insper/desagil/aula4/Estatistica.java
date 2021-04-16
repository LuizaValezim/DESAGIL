package br.edu.insper.desagil.aula4;

import java.util.List;

public class Estatistica {

	public double calculaVariancia(List<Integer> numeros) {
		double s;

		double m = calculaMedia(numeros);

		s = 0.0;
		for (int n: numeros) {
			double d = n - m;
			s += d * d;
		}
		return s / numeros.size();
	}

	public double calculaMedia(List<Integer> numeros) {
		double s;
		s = 0.0;
		for (int n: numeros) {
			s += n;
		}
		double m = s / numeros.size();
		return m;
	}

}
