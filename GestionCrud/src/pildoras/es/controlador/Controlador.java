package pildoras.es.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class Controlador {

	@RequestMapping("/lista")
	public String listaCliente(Model elModelo) {
		
		return "lista-cliente";
		
		
		
	}
	
	
}