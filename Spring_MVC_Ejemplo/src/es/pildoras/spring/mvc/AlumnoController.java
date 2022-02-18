package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo){
		
		Alumno elAlumno = new Alumno();
		
		modelo.addAttribute("elAlumno", elAlumno);
		
		return "alumnoRegistroFormulario";
		
	}
	
	@RequestMapping("/procesarFormulario")	
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno")Alumno elAlumno,
			BindingResult resultadoValidacion) {//Bilding guarda la validacion como objeto
		
		if (resultadoValidacion.hasErrors()) {
			
			return "alumnoRegistroFormulario";
			
		}else {
			
			return "confirmacionRegistroAlumno" ;
				
		}
		
	}
	


}
