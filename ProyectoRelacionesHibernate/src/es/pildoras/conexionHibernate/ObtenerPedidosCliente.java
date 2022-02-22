package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
			Cliente elCliente=miSession.get(Cliente.class, 2);
			
			System.out.println("Cliente: "+ elCliente);
			
			System.out.println("Pedidos: "+ elCliente.getPedidos());
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BBDD");
			
			
			miSession.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} 
		
		finally{
			miSession.close();
			miFactory.close();
			
		}
		
		
		
	}

}
