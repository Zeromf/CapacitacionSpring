package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrearPedidosCliente {

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
			
			//Crear Pedidos del Cliente
			
			Pedido pedido1=new Pedido(new GregorianCalendar(2022,7,5));
			Pedido pedido2=new Pedido(new GregorianCalendar(2022,6,1));
			Pedido pedido3=new Pedido(new GregorianCalendar(120,2,5));
			Pedido pedido4=new Pedido(new GregorianCalendar(120,7,7));
		
			
			//agregar pedido creados al cliente creado
			
			elCliente.agregarPedidos(pedido1);
			elCliente.agregarPedidos(pedido2);
			elCliente.agregarPedidos(pedido3);
			elCliente.agregarPedidos(pedido4);

			//Guardar los pedidos en la BBDD en la tabla pedido
			
			miSession.save(pedido1);
			miSession.save(pedido2);
			miSession.save(pedido3);
			miSession.save(pedido4);

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
