package pildoras.es.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pildoras.es.controlador.entity.Cliente;
import pildoras.es.dao.ClienteDAO;

@Controller
@RequestMapping("/cliente")
public class Controlador {

	@Autowired
	private ClienteDAO clienteDAO;
	
	@RequestMapping("/lista")
	public String listaCliente(Model elModelo) {
		
		// obtener lso cliente desde el DAO
		
		List<Cliente> losClientes = clienteDAO.getClientes();
		
		//agregar los clientes al modelo
		elModelo.addAttribute("clientes",losClientes);
		
		return "lista-cliente";
	}
	
	@RequestMapping("/muestraFormularioAgregar")
	public String muestraFormularioAgregar(Model elModelo) {
		
		//Bind datos clientes
		
		Cliente elCliente=new Cliente();
		
		elModelo.addAttribute("cliente",elCliente);
		
		
		return "formularioCliente";
		
	}
	
	//introducimos la url a que apunta el boton
	@PostMapping("/insertarCliente")
	public String insertarCliente(@ModelAttribute("cliente") Cliente elCliente) {
		
		// Insertar Cliente en BBDD
		
		clienteDAO.insertarCliente(elCliente);
		
		return "redirect:/cliente/lista";
	}
	
	//obtenemos el cliente con el id 
		@GetMapping("/muestraFormularioActualizar")
		public String muestraFormularioActualizar(@RequestParam("clienteId") int Id,Model elModelo) {
			
			// Obtener el cliente 
			Cliente elCliente=clienteDAO.getClientes(Id);
			
			//Establecer el cliente como atributo del modelo
			
			elModelo.addAttribute("cliente",elCliente);
			
			//Enviar al formulario
			
			
			return "formularioCliente";
		}
		
		
		@GetMapping("/eliminar")
		public String eliminarCliente(@RequestParam("clienteId") int Id) {
			
			// eliminar el cliente 
			clienteDAO.eliminarCliente(Id);
			
			//Redireccionar a la lista de clientes
			
			return "redirect:/cliente/lista";
		}
	
}
