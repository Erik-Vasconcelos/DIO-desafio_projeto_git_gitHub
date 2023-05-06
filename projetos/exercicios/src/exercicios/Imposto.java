package exercicios;

import java.util.Scanner;

public class Imposto {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double renda = leitor.nextDouble();

		System.out.println(calcularImposto(renda));
	}

	private static String calcularImposto(double salario) {
		double imposto = 0.0;
		double faixa1 = 2000.00;
		double faixa2 = 3000.00;
		double faixa3 = 4500.00;
		double salarioTemp = salario;

		if (salario > faixa3) {
			salarioTemp = salarioTemp - faixa3;
			imposto += salarioTemp * 0.28;
			salarioTemp = faixa3;
		}
		if (salario > faixa2) {
			salarioTemp = salarioTemp - faixa2;
			imposto += salarioTemp * 0.18;
			salarioTemp = faixa2;
		}
		if (salario > faixa1) {
			salarioTemp = salarioTemp - faixa1;
			imposto += salarioTemp * 0.08;
		}

		return imposto > 0.0 ? String.format("R$ %.2f", imposto).replace(",", ".") : "Isento";
	}
}
