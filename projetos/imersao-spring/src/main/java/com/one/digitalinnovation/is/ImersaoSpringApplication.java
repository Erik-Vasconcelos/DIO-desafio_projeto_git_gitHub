package com.one.digitalinnovation.is;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.one.digitalinnovation.is.scope.SistemaMensagem;

@SpringBootApplication
public class ImersaoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImersaoSpringApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}
	
	
//	@Bean
//	public CommandLineRunner run(ConversorJson conversor) throws Exception {
//		return args -> {
//			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
//			ViaCepResponse response = conversor.converter(json);
//			System.out.println("Dados do CEP: " + response);
//		};
//	}


}
