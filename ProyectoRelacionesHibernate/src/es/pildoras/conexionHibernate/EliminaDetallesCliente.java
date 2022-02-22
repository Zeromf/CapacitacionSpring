package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaDetallesCliente {

	public static void main(String[] args) {

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
			
			DetallesCliente detallesDelCliente = miSession.get(DetallesCliente.class,2);
			
			detallesDelCliente.getElCliente().setDetallesCliente(null);
			
			if (detallesDelCliente!=null) {
				
				//System.out.println("Voy a eliminar al cliente: "+ detallesDelCliente.getNombre());
				
				miSession.delete(detallesDelCliente);
			}
			
			//Esto guarda la informacion en las dos tablas relacionadas
						
			miSession.getTransaction().commit();
				
			if (detallesDelCliente!=null) {
				
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
