package exercicios;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int n1 = leitor.nextInt();
		System.out.println("Digite o segundo número");
		int n2 = leitor.nextInt();
		
		
		if(n2 % n1 == 0) {
			System.out.printf("São múltiplos");
		}else {
			System.out.printf("Não são múltiplos");
		}
	}
}
