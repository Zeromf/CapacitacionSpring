package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class ObtenerPedidosCliente {

	public static void main(String[] args) {

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.addAnnotatedClass(Pedido.class)
				.buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
			
			//obtener el cliente de la tabla Cliente de la BBDD
			//Cliente elCliente=miSession.get(Cliente.class, 2);
			
			Query<Cliente> consulta=miSession.createQuery("SELECT CL FROM Cliente CL JOIN FETCH CL.pedidos WHERE "
					+ "CL.id=:elClienteId",Cliente.class);
			
			consulta.setParameter("elClienteId", 2);
			
			Cliente elCliente=consulta.getSingleResult();
			
			System.out.println("Cliente: "+ elCliente);
			

			
			miSession.getTransaction().commit();
			
			miSession.close();
			
			for (Pedido pedidos : elCliente.getPedidos()  ) {
				
				System.out.println("Pedidos: "+pedidos);

			}
			

			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} 
		
		finally{
			miSession.close();
			miFactory.close();
			
		}
		
		
		
	}

}
