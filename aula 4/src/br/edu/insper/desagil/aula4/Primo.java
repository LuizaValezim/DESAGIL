package br.edu.insper.desagil.aula4;

public class Primo {

	public int conta(int limite) {
		int total = 0;

		int n = 2;
		while (n <= limite) {
			boolean temDivisor = false;

			int d = 2;
			while (d < n) {
				if (n % d == 0) {
					temDivisor = true;
					break;
				}
				d++;
			}
			
			if (!temDivisor) {
				total += 1;
			}

			n++;
		}

		return total;
	}
}
