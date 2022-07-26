/**
 * 
 */
package Datos;

import java.util.List;
import java.sql.*;
import domain.PersonaDTO;

/**
 * @author DanielaAGonzalezH
 *
 */
public interface PersonaDAO2 {

	
	public List<PersonaDTO> select() throws SQLException;
	
	public int insert(PersonaDTO persona) throws SQLException;
	
	public int update(PersonaDTO persona) throws SQLException;
	
	public int delete(PersonaDTO persona) throws SQLException;
	
	
	
}
