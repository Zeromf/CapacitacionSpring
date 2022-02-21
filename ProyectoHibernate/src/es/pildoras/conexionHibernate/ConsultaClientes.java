package es.pildoras.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		
	try {
			
			//comenzar sesion
			miSession.beginTransaction();

			//consulta de clientes
			
			List<Clientes> losClientes=miSession.createQuery("from Clientes ").getResultList();
			
			//mostrar los clientes
			recorreClientesConsultados(losClientes);
			
			//consulta:dame los lopez
			losClientes=miSession.createQuery("from Clientes cl where cl.apellido='Lopez'").getResultList();

			//mostrar los lopez
			
			recorreClientesConsultados(losClientes);
			
			//muestra los que viven en Varela o se apellidan Aguirre
			
			losClientes=miSession.createQuery("from Clientes cl where cl.direccion='Varela' "
					+ " or cl.apellido='Aguirre'").getResultList();

			recorreClientesConsultados(losClientes);
			
			// commit 
			
			miSession.getTransaction().commit();

			
		}finally {
			
			miFactory.close();
			
		}
		
	}

	private static void recorreClientesConsultados(List<Clientes> losClientes) {
		for (Clientes unCliente :losClientes ) {
			
			System.out.println(unCliente);
			
		}
	}
		
	}
