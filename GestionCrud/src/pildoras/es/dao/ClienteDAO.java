package pildoras.es.dao;

import java.util.List;

import pildoras.es.controlador.entity.Cliente;

public interface ClienteDAO {

	public List<Cliente> getClientes();

	public void insertarCliente(Cliente elCliente);

	public Cliente getClientes(int id);

	public void eliminarCliente(int id);

	
	
}
