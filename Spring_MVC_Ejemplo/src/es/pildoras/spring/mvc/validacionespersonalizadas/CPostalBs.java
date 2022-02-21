package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//futura clase que contendra la logica de la validacion
@Constraint(validatedBy=CPostalBsValidacion.class)
//Destino de nuestra validacion a metodos o campos
@Target({ElementType.METHOD,ElementType.FIELD})
// chequea la anotacion en tiempo de ejecucion
@Retention(RetentionPolicy.RUNTIME)
public @interface CPostalBs {

	// Definir el codigo postal por defecto
	
	public String value() default "28";
	
	 
	
	// Definir el mensaje de error
	
	public String message() default " El C. Postal debe comenzar por 28";
	
	
	// Definir los grupos 
	
	Class<?>[] groups() default {};
	
	
	
	// Definir los payloads
	
    Class<? extends Payload>[] payload() default {};

	
	
	
}
