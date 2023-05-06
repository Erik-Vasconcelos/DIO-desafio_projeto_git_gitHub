package one.digital.innovation.gof.singleton;

/**
 * Singleton "LazyHolder" (mais otimizado)
 * Encapsula a instancia em uma classe statica 
 * @author erikv
 * @since 10/04/2023
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
