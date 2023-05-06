package com.one.digitalinnovation.is;

import org.springframework.boot.CommandLineRunner;

/*a classe garante que o objeto Calculadora seja gerenciado pelo sb, pois se fosse instanciado um objeto da classe e usado no main, 
ela seria um objeto desconhecido pelo o sb. 
Os nossos componentes não podem ser criador pela palavra reservada new
*/
//@Component
public class MyApp implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

/*	@Autowired
	private Calculadora calculadora;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("O resultado é: " + calculadora.somar(45, 2));
	}*/

}
