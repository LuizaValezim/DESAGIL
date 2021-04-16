package br.edu.insper.desagil.aula1;

public class Faixa {
	public String calcula(int idade) {
		if (idade < 18) {
			return "jovem";
		}
		else if (idade >= 18 && idade < 60) {
			return "adulto";
			}
		
		else {
			return "idoso";
			
		}
	}
}
