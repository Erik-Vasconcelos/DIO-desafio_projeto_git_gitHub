package exercicios2;

import java.util.Scanner;

public class CrescenteDecrescente {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		boolean saoIguais = false;
		
		while(!saoIguais) {
			System.out.println("X: ");
			x = leitor.nextInt();
			System.out.println("Y: ");
			y = leitor.nextInt();
			
			if(x < y) {
				System.out.println("Ordem crescente!");
			}else if(x > y) {
				System.out.println("Ordem decrescente!");
			}else{
				saoIguais = true;
			}
		}
		
	}
}
