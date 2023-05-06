package one.digital.innovation.gof.strategy;

import java.util.logging.Logger;

public class ComportamentoNormal implements Comportamento{
	
	private static final Logger logger = Logger.getLogger(ComportamentoNormal.class.getName());
	
	@Override
	public void mover() {
		logger.info("Movendo-se normalmente...");
	}

}
