package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// Leer el xml de configuracion
		
			ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

				
		//pedir un bean al contenedor
				
			IEmpleados Juan =contexto.getBean("ComercialExperimentado",IEmpleados.class);	
			
				
		//usar el bean
			
			
			System.out.println(Juan.getInforme());
			System.out.println(Juan.getTareas());

				
		//cerrar el contexto

			contexto.close();
	}

}
