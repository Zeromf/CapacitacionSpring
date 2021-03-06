package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// Leer el xml de configuracion
		
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//leer el class de configuracion
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir un bean al contenedor
		
		/*IEmpleados Lucia =contexto.getBean("ComercialExperimentado",IEmpleados.class);	
		
		IEmpleados Juan =contexto.getBean("ComercialExperimentado",IEmpleados.class);	
		
		//Apuntan al mimso objeto de memoria?
		
		if(Lucia.equals(Juan)) {
			
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Lucia + "\n" + Juan );
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Lucia + "\n" + Juan );

		}*/
		
		//pedir el bean al contenedor

		/*IEmpleados empleado = contexto.getBean("d irectorFinanciero",IEmpleados.class);
		
		
		System.out.println(empleado.getTareas());
		
		System.out.println(empleado.getInforme());
		 */
		
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println("Email del director: "+ empleado.getEmail());
		
		System.out.println("Nombre de la empresa: "+ empleado.getNombreEmpresa());
		
	
		//cerrar el contexto

		contexto.close();
		
	}

}
