package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {

	public static void main(String[] args) {

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			Cliente cliente1=new Cliente("Monica","Aguirre","Goya");
			
			DetallesCliente detallesCliente1=new DetallesCliente("SysOne.com .ar","123213124","Primer cliente");
			
			//Asociar los objetos 
			
			cliente1.setDetallesCliente(detallesCliente1);
			
			miSession.beginTransaction();
			
			//Esto guarda la informacion en las dos tablas relacionadas
			
			miSession.save(cliente1);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BBDD");
			
			
			miSession.close();
			
		} finally{
			
			miFactory.close();
			
		}
		
		
		
	}

}
