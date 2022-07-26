package Datos;

import java.sql.SQLException;
import java.util.List;

import domain.PersonaDTO;
import domain.UsuarioDTO;

public interface UsuarioDAO2 {
	
	public List<UsuarioDTO> select() throws SQLException;
	
	public int insert(UsuarioDTO usuario) throws SQLException;
	
	public int update(UsuarioDTO usuario) throws SQLException;
	
	public int delete(UsuarioDTO usuario) throws SQLException;

}
