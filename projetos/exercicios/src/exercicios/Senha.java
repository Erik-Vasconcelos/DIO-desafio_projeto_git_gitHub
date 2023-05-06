package exercicios;

import java.util.Scanner;

public class Senha {

	private String senha = "202324040105";

	public void validar(String valor) {
		if (valor.equals(senha)) {
			System.out.println("ACESSO PERMITIDO!");
		} else {
			System.err.println("SENHA INVÁLIDA!");
		}
	}

	public static void main(String[] args) {
		Senha senha = new Senha();

		System.out.println("Digite a senha: ");
		Scanner leitor = new Scanner(System.in);
		String valor = leitor.next();

		senha.validar(valor);
	}

}
