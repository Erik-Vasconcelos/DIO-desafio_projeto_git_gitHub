package one.digital.innovation.gof.singleton;

/**
 * Singleton "apressado" 
 * Instancia logo de cara uma instancia
 * @author erikv
 * @since 10/04/2023
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
