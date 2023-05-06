package one.digital.innovation.gof.strategy;

import java.util.logging.Logger;

public class ComportamentoAgressivo implements Comportamento{
	
	private static final Logger logger = Logger.getLogger(ComportamentoAgressivo.class.getName());
	
	@Override
	public void mover() {
		logger.info("Movendo-se agressivamente...");
	}

}
