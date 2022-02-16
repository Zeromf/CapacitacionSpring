package es.pildoras.IoC;

public class jefeEmpleado implements IEmpleados {
	
	public jefeEmpleado(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private ICreacionInformes informeNuevo;

	
	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
		
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos : " + informeNuevo.getInforme();
	}
	
	

}
