package exercicios;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();

		boolean isTriangulo = Math.abs(b - c) < a && a < (b + c);

		if (isTriangulo) {
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f", perimetro);

		} else {
			double area = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f", area);
		}

	}

}
