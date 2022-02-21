package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaClientes {

	public static void main(String[] args) {
		
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			//int ClienteId=7;
			miSession.beginTransaction();
						
			//Clientes miCliente=miSession.get(Clientes.class, ClienteId);
			
			/*miCliente.setApellido("Lopez");
			miCliente.setNombre("Vaneza");
			miCliente.setDireccion("Frances");*/
			
			miSession.createQuery("delete Clientes where Direccion ='Francia'").executeUpdate();
			
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro eliminado correctamente en BBDD");
			
			//Lectura de registro
			
			

			
			miSession.close();
			
		} finally{
			
			miFactory.close();
			
		}
		

	}

}
