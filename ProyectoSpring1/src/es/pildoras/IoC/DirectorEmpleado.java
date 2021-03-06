package es.pildoras.IoC;

public class DirectorEmpleado implements IEmpleados {
	
	//Creacion de campo tipo CreacionInforme (interfaz)
	
	private ICreacionInformes informeNuevo;
	
	
	private String email;
	
	private String nombreEmpresa;
	
	//Creacion de constructor que inyecta la depedencia
	public DirectorEmpleado(ICreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
		
	}
	
	

	//Metodo init . Ejecutar tares antes de el bean este disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo initi . Aqui irian las tareas a ejecutar "
				+ "antes de que el bean este listo");
		
	}
	
	
	//Metodo destroy ,Ejecutar tareas despues de que el bean haya sido utilizado
		public void metodoFinal() {
		
		System.out.println("Dentro del metodo destroi . Aqui irian las tareas a ejecutar "
				+ "despues de utilizar el bean");
		
	}

	

	@Override
	public String getTareas() {
		return "Gestionar la pantilla de la empresa";
	}

	@Override
	public String getInforme() {
		
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


}
