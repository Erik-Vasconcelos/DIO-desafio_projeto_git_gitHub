package exercicios;

import java.util.Scanner;

public class Intervalo {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int n1 = leitor.nextInt();
		System.out.println("Digite o segundo número");
		int n2 = leitor.nextInt();
		System.out.println("Digite o terceiro número");
		int n3 = leitor.nextInt();
		
		if(n3 > n1 && n3 < n2) {
			System.out.printf("Dentro do intervalo entre %d e %d", n1, n2);
		}else {
			System.out.printf("fora do intervalo entre %d e %d", n1, n2);
		}
	}

}
