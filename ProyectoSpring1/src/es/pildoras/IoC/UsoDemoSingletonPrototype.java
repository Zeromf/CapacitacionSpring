package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {

		//Cargamos el archivo xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		
		//peticion de beans al contenedor Spring
		
		SecretarioEmpleado Maria= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		SecretarioEmpleado Pedro= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		SecretarioEmpleado Leandro= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		SecretarioEmpleado Enzo= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		SecretarioEmpleado Fede= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		SecretarioEmpleado Ana= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		
		System.out.println(Maria);
		
		System.out.println(Pedro);
		
		System.out.println(Leandro);

		System.out.println(Enzo);

		System.out.println(Fede);

		System.out.println(Ana);

		
		if(Maria.equals(Pedro)) {
			
			System.out.println("apuntan al mimso objeto");

		}else {
			
			System.out.println("no se trata del mismo objeto");

		}
		

	}

}
