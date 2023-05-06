package exercicios;

import java.util.function.IntPredicate;

public class ContaEspacos {
	public static void main(String[] args) {
		String valor = "COntE Os espAcos desta string em java-programming";

		long result = ContaEspacos.espacos2(valor);
		System.out.printf("Tamanho da String= %d, quantidade de espacos = %d", valor.length(), result);

		System.out.println("\nquantidade de vogais = " + ContaEspacos.vogais(valor));
	}

	private static int espacos(String valor) {
		int quantidade = 0;

		for (int i = 0; i < valor.length(); i++) {
			if (valor.charAt(i) == ' ') {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	private static long espacos2(String valor) {
		return valor.chars().filter(c -> c == ' ').count();
	}

	private static long vogais(String valor) {
		valor = valor.toLowerCase();
		IntPredicate isVogal = c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
		return valor.chars()
				.filter(isVogal)
				.count();
	}
	
	   /*String[] strSplit = str.split(" ");
	     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
	     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
	    
	    for (String item : strSplit) {*/
}
