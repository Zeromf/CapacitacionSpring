package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	// definir el bean para el InformeFinancieroDtoCompras
	@Bean
	// Sera el id del Bean inyectado
	public CreacionInformeFinanciero informeFinancieroDtoCompras(){
		
		return new InformeFinancieroDtoCompras();
	}
	
	
	
	// definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public IEmpleados directorFinanciero(){
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
		
		
		
	}

}
