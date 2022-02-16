package es.pildoras.IoC;

public class SecretarioEmpleado implements IEmpleados {

	private ICreacionInformes informeNuevo;

	private String Email;
	
	private String nombreEmpresa;
	
	
	public void setInformeNuevo(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informa generado por el secretario " + informeNuevo.getInforme();
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String Email) {
		this.Email = Email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	


}
