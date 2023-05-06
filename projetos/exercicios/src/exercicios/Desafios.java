package exercicios;

import java.util.Scanner;

public class Desafios {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String animal1, animal2, animal3;

		animal1 = leitor.nextLine();
		animal2 = leitor.nextLine();
		animal3 = leitor.nextLine();

		boolean isAguia = "vertebrado".equals(animal1) && "ave".equals(animal2) && "carnivoro".equals(animal3);
		boolean isPomba = "vertebrado".equals(animal1) && "ave".equals(animal2) && "onivoro".equals(animal3);
		boolean isHomem = "vertebrado".equals(animal1) && "mamifero".equals(animal2) && "onivoro".equals(animal3);
		boolean isVaca = "vertebrado".equals(animal1) && "mamifero".equals(animal2) && "herbivoro".equals(animal3);

		boolean isPulga = "invertebrado".equals(animal1) && "inserto".equals(animal2) && "hematofago".equals(animal3);
		boolean isLagarta = "invertebrado".equals(animal1) && "inseto".equals(animal2) && "herbivoro".equals(animal3);
		boolean isSanguessuga = "invertebrado".equals(animal1) && "anelideo".equals(animal2)
				&& "hematofago".equals(animal3);
		boolean isMinhoca = "invertebrado".equals(animal1) && "anelideo".equals(animal2) && "onivoro".equals(animal3);

		String resultado = "";

		if (isAguia) {
			resultado = "aguia";
		} else if (isPomba) {
			resultado = "pomba";
		} else if (isHomem) {
			resultado = "homem";
		} else if (isVaca) {
			resultado = "vaca";
		} else if (isPulga) {
			resultado = "pulga";

		} else if (isLagarta) {
			resultado = "lagarta";
		} else if (isSanguessuga) {
			resultado = "sanguessuga";
		} else if (isMinhoca) {
			resultado = "minhoca";
		} else {
			resultado = "indefinido!";
		}

		System.out.println(resultado);

	}

}
