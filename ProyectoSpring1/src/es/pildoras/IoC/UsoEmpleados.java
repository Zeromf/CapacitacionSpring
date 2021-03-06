package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Creacion de objetos de tipo Empleado
		
		
		//Iempleados Empleado1=new DirectorEmpleado();
		
		//uso de los objetos creados

		//System.out.println(Empleado1.getTareas());
		  
		
		
		//Cargamos el archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		

		
		//Utilizamos el bean
		//IEmpleados Juan= contexto.getBean("miEmpleado",IEmpleados.class);
		
	
		//System.out.println(Juan.getTareas());
		
		//System.out.println(Juan.getInforme());

		
		/*SecretarioEmpleado Maria= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		SecretarioEmpleado Pablo= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		
		
		System.out.println(Maria.getTareas());

		System.out.println(Maria.getInforme());

		System.out.println("Email: "+Maria.getEmail());

		System.out.println("Nombre Empresa: "+Maria.getNombreEmpresa());

		
		System.out.println("Email Pablo: "+Pablo.getEmail());*/

		
		DirectorEmpleado Juan= contexto.getBean("miEmpleado",DirectorEmpleado.class);


		System.out.println(Juan.getTareas());

		System.out.println(Juan.getInforme());

		System.out.println("Email: "+Juan.getEmail());
		
		System.out.println("NombreEmpresa: "+Juan.getNombreEmpresa());
		
		
		
		//Cerrar el xml para no consumir recursos
		contexto.close();
		
	}

}
