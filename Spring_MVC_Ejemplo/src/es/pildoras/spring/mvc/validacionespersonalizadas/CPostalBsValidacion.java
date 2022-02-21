package es.pildoras.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalBsValidacion implements ConstraintValidator<CPostalBs, String> {

	private String prefijoCodigoBs;
	
	 @Override
	    public void initialize(CPostalBs elCodigo) {
		 
			prefijoCodigoBs=elCodigo.value();
		 
	    }
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext elCodigo) {
		boolean valCodigo;
		
		
		if (arg0!=null) {
			
			valCodigo=arg0.startsWith(prefijoCodigoBs);
			
		}else{
			
			valCodigo=true;
			
		}
		
		return valCodigo;
		
	}

}
