package br.edu.insper.desagil.aula4;

import java.util.ArrayList;
import java.util.List;

public class Cumulativo {

	public List<Integer> calcula(List<Integer> v) {
		List<Integer> c = new ArrayList<>();

		for (int i = 0; i < v.size(); i++) {
			int s = 0;
			for (int j = 0; j <= i; j++) {
				s += v.get(j);
			}
			c.add(s);
		}

		return c;
	}

}
