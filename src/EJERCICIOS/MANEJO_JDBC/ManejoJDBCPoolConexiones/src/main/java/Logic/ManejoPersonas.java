/**
 * 
 */
package Logic;

import Datos.PersonaDaoJDBC;
import domain.PersonaDTO;

import java.sql.*;
import java.util.List;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ManejoPersonas {

	
	public static void main(String [] args) {
	PersonaDaoJDBC personaJDBC = new PersonaDaoJDBC();
	Connection conexion = null;	
	try {
		conexion = Conexion.getConnection();	
		
		if(conexion.getAutoCommit()) {
			conexion.setAutoCommit(false);
		}
			PersonaDaoJDBC personaDao = new PersonaDaoJDBC();
			List<PersonaDTO> personas  = personaDao.select();
			
			for(PersonaDTO persona : personas) {
				System.out.println("Persona DTO: "+persona);
			}
			
			//Hacemos commit de la transacción 
			conexion.commit();
			
			System.out.println("Se ha hecho commit de la transacción ");
	    }catch(SQLException ex) {
	    	ex.printStackTrace(System.out);
	    	System.out.println("Entramos al rollback");
	     }
	
	
	
	}
	
}
