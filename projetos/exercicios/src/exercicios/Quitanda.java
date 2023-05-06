package exercicios;

import java.util.Scanner;

public class Quitanda {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int pesoMorangos = leitor.nextInt();
		int pesoMacas = leitor.nextInt();

		double valorPadraoMorango = 2.50;
		double valorPadraoMaca = 1.80;

		double valorMorango = pesoMorangos > 5 ? pesoMorangos * (valorPadraoMorango - 0.30)
				: pesoMorangos * valorPadraoMorango;
		double valorMaca = pesoMacas > 5 ? pesoMacas * (valorPadraoMaca - 0.30) : pesoMacas * valorPadraoMaca;

		double valorFinal = pesoMacas + pesoMorangos > 8 ? (valorMaca + valorMorango) * 0.90 : valorMaca + valorMorango;

		System.out.println(valorFinal);
		
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();
		boolean isTriangulo = Math.abs(b - c) < a && a < (b + c);

	}
}
