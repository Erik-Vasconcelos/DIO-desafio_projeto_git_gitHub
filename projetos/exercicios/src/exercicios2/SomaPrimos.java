package exercicios2;

import java.util.Scanner;

public class SomaPrimos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o número: ");
		int numero = leitor.nextInt();
		int somaPrimos = 0;

		for (int i = 1; i <= numero; i++) {
			if (isPrimo(i) == 1) {
				somaPrimos += i;
			}
		}
		
		System.out.println("Soma dos primos: " + somaPrimos);

	}

	private static int isPrimo(int valor) {
		int quantidadeDivisores = 0;

		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				quantidadeDivisores++;
			}
		}

		if (quantidadeDivisores == 2) {
			return 1;
		}

		return 0;
	}
}
