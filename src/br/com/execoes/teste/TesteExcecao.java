package br.com.execoes.teste;

import br.com.excecoes.execao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		/* Exce��es:
		Checked: S�o exce��es verificadas AC (Antes da Compila��o)
		Uncheked: S�o exce��es verificadas DC (Depois da Complica��o)
		 */
		
		
		
		
		try {
			int numero = Integer.parseInt("A");
			System.out.println("N�mero: " + numero);
			String palavra = "";
			System.out.println("Quantidade de Letras: " + palavra.length());
			
			int[] numeros = new int[3];
			numeros[0] = 765;
			numeros[1] = 123;
			numeros[2] = 5;
	
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally {
			System.out.println("Obrigado! Volte Sempre!");
		}
		
		

	}

}
