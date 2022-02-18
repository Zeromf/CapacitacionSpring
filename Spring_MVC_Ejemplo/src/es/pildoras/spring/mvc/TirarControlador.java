package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/secundario")
public class TirarControlador {

	//Proporciona el formulario
		@RequestMapping("/muestraFormulario")   //Peticion de una Url
		public String muestraFormulario() {
			
			return "HolaAlumnosFormulario";	
			
		}
		
	@RequestMapping("/procesarFormulario3")   
	public String otroProcesoFormulario(@RequestParam("nombreAlumno")String nombre,Model modelo) {
		
		//String nombre = request.getParameter("nombreAlumno");
		
		nombre+=" es el peor alumno";
		
		String mensajeFinal=" ¿Quien es el peor alumno? " + nombre;
		
		// agregando info al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "HolaAlumnosSpring";
		
		
	}
}
