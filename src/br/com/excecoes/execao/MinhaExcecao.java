package br.com.excecoes.execao;

public class MinhaExcecao extends Exception{
	
	public static String tratar(Exception e) {
		
		if (e instanceof NullPointerException) {
			return "H? um objeto nulo!!!";
		}else if (e instanceof NumberFormatException) {
			return "N?mero inv?lido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Exce??o n?o conhecida";
		}
		
	}
	
	

}
