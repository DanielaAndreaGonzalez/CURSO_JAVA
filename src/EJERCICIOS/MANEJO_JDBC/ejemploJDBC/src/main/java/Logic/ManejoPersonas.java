/**
 * 
 */
package Logic;

import Datos.PersonaJDBC;
import domain.Persona;

import java.sql.*;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ManejoPersonas {

	
	public static void main(String [] args) {
	PersonaJDBC personaJDBC = new PersonaJDBC();
	Connection conexion = null;	
	try {
		conexion = Conexion.getConnection();	
		
		if(conexion.getAutoCommit()) {
			conexion.setAutoCommit(false);
		}
			PersonaJDBC personajdbc = new PersonaJDBC();
			Persona cambioPersona = new Persona();
			cambioPersona.setIdpersona(1);
			cambioPersona.setNombre("Karla Ivon");
			cambioPersona.setApellido("Goméz");
			cambioPersona.setEmail("karla@gmail.c");
			cambioPersona.setTelefono("315768981");
			personajdbc.actualizar(cambioPersona);
			
			Persona nuevaPersona = new Persona();
			nuevaPersona.setNombre("Carlos");
			nuevaPersona.setApellido("Ramirez");
			personajdbc.insertar(nuevaPersona);
			
			//Hacemos commit de la transacción 
			conexion.commit();
			
		System.out.println("Se hizo");
	    }catch(SQLException ex) {
	    	ex.printStackTrace(System.out);
	    	System.out.println("Entramos al rollback");
	     }
	
	
	
	}
	
}
