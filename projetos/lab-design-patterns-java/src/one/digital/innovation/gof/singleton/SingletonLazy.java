package one.digital.innovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * Instancia um objeto somente qundo o método getInstancia for chamado
 * @author erikv
 * @since 10/04/2023
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}

}
