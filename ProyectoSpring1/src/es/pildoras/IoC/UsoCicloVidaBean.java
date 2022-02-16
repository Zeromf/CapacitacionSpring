package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {

		
		//Cargar el xml de configuracion
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		
		//Obtencion del bean
		
		IEmpleados Juan =contexto.getBean("miEmpleado",IEmpleados.class);
		
		System.out.println(Juan.getInforme());
		
		
		//Cerrar el contexto
		
		contexto.close();
		
		
		
	}

}
