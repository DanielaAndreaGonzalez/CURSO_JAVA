/**
 * 
 */
package Logic;
import java.util.List;

import Datos.*;
import domain.Usuario;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ManejoUsuarios {
	
	public static void main(String [] args ) {
		
	
		UsuarioJDBC userJDBC = new UsuarioJDBC();
		
		//Ejecutando listado de usuarios
		
		List <Usuario> lista = userJDBC.seleccionar();
		
		for(Usuario user: lista) {
			System.out.println("Usuario: "+user);
		}
		
		//Insertamos un nuevo usuario
		
		//Usuario usuario = new Usuario("Carlos.Juarez","123");
		//userJDBC.insertar(usuario);
		
		//Modificamos usuario existente
		
		Usuario usuario = new Usuario(2,"Carlos.Juarez","456");
		userJDBC.actualizar(usuario);
		
		userJDBC.eliminar(new Usuario(3));
		
		
	}
	
	
	
}
