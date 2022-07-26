/**
 * 
 */
package Logic;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Datos.*;
import domain.PersonaDTO;
import domain.UsuarioDTO;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ManejoUsuarios {
	
	public static void main(String [] args ) {
		
	
		UsuarioDaoJDBC userJDBC = new UsuarioDaoJDBC();
		Connection conexion = null;	
		
		
		try {
			conexion = Conexion.getConnection();	
			
			if(conexion.getAutoCommit()) {
				conexion.setAutoCommit(false);
			}
				UsuarioDaoJDBC usuarioDao = new UsuarioDaoJDBC();
				List<UsuarioDTO> usuario = usuarioDao.select(); 
				
				for(UsuarioDTO user : usuario) {
					System.out.println("Usuario DTO: "+user);
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
