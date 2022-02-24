package pildoras.es.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pildoras.es.controlador.entity.Cliente;

@Repository
public class ClienteDAOclase implements ClienteDAO {
	
	@Autowired
	private SessionFactory SessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Cliente> getClientes() {
			
		// Obtener la session
		
		Session miSession=SessionFactory.getCurrentSession();
		
		
		//Crear la consulta(Query)
		
		Query<Cliente> miQuery= miSession.createQuery("from Cliente ",Cliente.class);
		
		//Ejecutar la query y devolver resultados
		
		
		List<Cliente> clientes=miQuery.getResultList();
		
		
		return clientes;
	}

}
