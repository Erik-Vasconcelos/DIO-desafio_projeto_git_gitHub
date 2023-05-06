package one.digital.innovation.gof.strategy;

import java.util.logging.Logger;

public class ComportamentoDefensivo implements Comportamento{
	
	private static final Logger logger = Logger.getLogger(ComportamentoDefensivo.class.getName());
	
	@Override
	public void mover() {
		logger.info("Movendo-se defensivamente...");
	}

}
