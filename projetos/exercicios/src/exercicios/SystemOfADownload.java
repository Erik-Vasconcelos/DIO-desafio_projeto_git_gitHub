package exercicios;

import java.util.Scanner;

public class SystemOfADownload {

	public static String verificarMusica(int numero) {
		String reposta = "";
		switch (numero) {
		case 0:
			reposta = "PROXYCITY";
			break;
		case 1:
			reposta = "P.Y.N.G";
			break;
		case 2:
			reposta = "DNSUEY!";
			break;
		case 3:
			reposta = "SERVERS";
			break;
		case 4:
			reposta = "HOST!";
			break;
		case 5:
			reposta = "CRIPTONIZE";
			break;
		case 6:
			reposta = "OFFLINE DAY";
			break;
		case 7:
			reposta = "SALT";
			break;
		case 8:
			reposta = "ANSWER!";
			break;
		case 9:
			reposta = "RAR?";
			break;
		case 10:
			reposta = "WIFI ANTENNAS";
			break;
		case 11:
			reposta = "Música não encontrada";
			break;
		}
		
		return reposta;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número do primeiro botão: ");
		int botao1 = leitor.nextInt();
		
		System.out.println("Digite o número do segundo botão: ");
		int botao2 = leitor.nextInt();
		
		int numeroMusica = botao1 + botao2;
		
		System.out.println(verificarMusica(numeroMusica));
	}
	
}
