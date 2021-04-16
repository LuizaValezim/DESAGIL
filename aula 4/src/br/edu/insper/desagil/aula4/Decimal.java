package br.edu.insper.desagil.aula4;

public class Decimal {

	public double converte(String codigo) {
		char hA = codigo.charAt(0);
		int dA;
		if (hA == '9') {
			dA = 9;
		} else if (hA == '8') {
			dA = 8;
		} else if (hA == '7') {
			dA = 7;
		} else if (hA == '6') {
			dA = 6;
		} else if (hA == '5') {
			dA = 5;
		} else if (hA == '4') {
			dA = 4;
		} else if (hA == '3') {
			dA = 3;
		} else if (hA == '2') {
			dA = 2;
		} else if (hA == '1') {
			dA = 1;
		} else {
			dA = 0;
		}

		char hB = codigo.charAt(1);
		int dB;
		if (hB == '9') {
			dB = 9;
		} else if (hB == '8') {
			dB = 8;
		} else if (hB == '7') {
			dB = 7;
		} else if (hB == '6') {
			dB = 6;
		} else if (hB == '5') {
			dB = 5;
		} else if (hB == '4') {
			dB = 4;
		} else if (hB == '3') {
			dB = 3;
		} else if (hB == '2') {
			dB = 2;
		} else if (hB == '1') {
			dB = 1;
		} else {
			dB = 0;
		}

		return 10 * dA + dB;
	}

}
