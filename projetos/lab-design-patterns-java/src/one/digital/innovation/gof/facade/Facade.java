package one.digital.innovation.gof.facade;

import subsistema1.CrmCliente;
import subsistema2.ApiCep;

/**
 * Tem como objetivo disponibilizar uma interface para reduzir complexidade
 *  de integracões
 * @author erikv
 * @since 10/04/2023
 */
public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = ApiCep.getCidade(cep);
		String estado = ApiCep.getEstado(cep);
		
		CrmCliente.gravarCliente(nome, cep, cidade, estado);
	}
	
}
