package subsistema1;

public class CrmCliente {

	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("O cliente foi salvo no CRM:");
		
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
