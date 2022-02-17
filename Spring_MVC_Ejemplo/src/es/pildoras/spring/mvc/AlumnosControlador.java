package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlumnosControlador {
	
	//Proporciona el formulario
	@RequestMapping("/muestraFormulario")   //Peticion de una Url
	public String muestraFormulario() {
		
		return "HolaAlumnosFormulario";	
		
	}
	
	@RequestMapping("/procesarFormulario")   //Peticion de una Url
	public String procesarFormulario() {   
		
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormulario2")   
	public String otroProcesoFormulario(@RequestParam("nombreAlumno")String nombre,Model modelo) {
		
		//String nombre = request.getParameter("nombreAlumno");
		
		nombre+=" es el mejor alumno";
		
		String mensajeFinal=" ¿Quien es el mejor alumno? " + nombre;
		
		// agregando info al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "HolaAlumnosSpring";
		
	}
	
	
	
	
	
}
