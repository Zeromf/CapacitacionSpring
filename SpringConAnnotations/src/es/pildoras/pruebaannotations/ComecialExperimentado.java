package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComecialExperimentado implements IEmpleados {

	@Autowired
	@Qualifier("informeFinancieroTrim4") //bean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;

	
	//Ejecucion de codigo despues de creacion del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		
		System.out.println("Ejecutado tras creacion de bean");
		
	}
	
	
	//Ejecucion de codigo despues de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		
		System.out.println("Ejecutando  antes de la destruccion");

		
	}
	
	
	//El @Autowired busca en todo el proyecto a ver si hay alguna clase que implemente la interfaz CreacionInformeFinanciero
	// y si la encuentra es de esa clase de donde obtiene la inyeccion de dependencia
	/*@Autowired 
	public ComecialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	
	/*@Autowired
	public void lolapelito(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender,vender y vender mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	
	

}
