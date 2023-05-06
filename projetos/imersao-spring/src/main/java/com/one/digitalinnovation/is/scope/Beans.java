package com.one.digitalinnovation.is.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
	
	@Bean
	@Scope("prototype") //diz para o spring que será servido um objeto para cada necessidade
	public Remetente remetente() {
		System.out.println("CRIANDO UM OBJETO REMETENTE");
		Remetente remetente = new Remetente();
		remetente.setEmail("noreply@dio.com.br");
		remetente.setNome("Digital Innovation One");
		return remetente;
	}
	
}
