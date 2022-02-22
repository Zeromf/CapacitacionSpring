package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminarCliente {

	public static void main(String[] args) {

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
			
			Cliente elCliente = miSession.get(Cliente.class,3);
			if (elCliente!=null) {
				
				System.out.println("Voy a eliminar al cliente: "+ elCliente.getNombre());
				
				miSession.delete(elCliente);
			}
			
			//Esto guarda la informacion en las dos tablas relacionadas
						
			miSession.getTransaction().commit();
				
			if (elCliente!=null) {
				
				System.out.println("Registro eliminado correctamente en BBDD");
			}else {
				
				System.out.println("Nada que eliminar");				
			}
			
			
			miSession.close();
			
		} finally{
			
			miFactory.close();
			
		}
		
		
		
	}

}
