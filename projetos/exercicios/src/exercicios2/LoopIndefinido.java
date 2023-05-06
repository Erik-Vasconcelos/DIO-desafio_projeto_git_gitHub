package exercicios2;

import java.util.Scanner;

public class LoopIndefinido {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String sentinela = "";

		int soma = 0;
		int media = 0;
		int menor = 0;
		int maior = 0;
		int quantidadeEntradas = 0;

		while (!"sair".equalsIgnoreCase(sentinela)) {
			System.out.println("Digite um número: ");
			sentinela = leitor.next();

			if (!"sair".equalsIgnoreCase(sentinela)) {
				int numero = Integer.parseInt(sentinela);

				if(menor == 0) {
					menor = numero;
				}
				
				soma += numero;
				++quantidadeEntradas;

				if (numero > maior) {
					maior = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
		}
		
		media = soma / quantidadeEntradas;

		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + media);
		System.out.println("MENOR: " + menor);
		System.out.println("MAIOR: " + maior);

		leitor.close();
	}

}
