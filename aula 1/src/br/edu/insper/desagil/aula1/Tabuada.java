package br.edu.insper.desagil.aula1;

public class Tabuada {

	public String constroi(int n) {
		String resultado = "";
	    for (int i = 1; i <= n; i++) {
	    	for (int l = 1; l <= n; l++) {
	    		String a = Integer.toString(i*l);
	    		resultado = resultado + a; 
	    		resultado = resultado + " ";	
	    	}
	    	String pula = "\n";
	    	resultado = resultado + pula;
	    }
	    return resultado;
}
}