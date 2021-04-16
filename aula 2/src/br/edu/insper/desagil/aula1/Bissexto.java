package br.edu.insper.desagil.aula1;

public class Bissexto {

	public boolean decide(int ano) {
		if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0){
			return true;
		}	
		else {
			return false;
		} 
}

}
