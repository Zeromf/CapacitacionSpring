package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {

		
		String jdbcUrl= "jdbc:mysql://localhost:3306/relacioneshibernate?useSSL=false";
		
		String usuario="root";
		
		String contra="";
		
		
		try {
			
			System.out.println("Intentando conectar con la BBDD" +jdbcUrl );
			
			Connection miConexion=DriverManager.getConnection(jdbcUrl,usuario,contra);
			
			System.out.println("Conexion exitosa!!");
			
			
		} catch (Exception e) {

			e.printStackTrace();

		
		
		}

		
	}

}
