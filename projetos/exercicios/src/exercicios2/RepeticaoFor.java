package exercicios2;

import java.util.Scanner;

public class RepeticaoFor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o número: ");
		int numero = leitor.nextInt();
		int somaImpares = 0;
		
		for (int i = 1; i <= numero; i++) {
			if(i % 2 == 1) {
				somaImpares += i;
			}
		}
		
		System.out.println("Resultado: " + somaImpares);
	}
}
