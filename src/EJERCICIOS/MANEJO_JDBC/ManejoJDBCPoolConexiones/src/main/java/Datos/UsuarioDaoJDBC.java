/**
 * 
 */
package Datos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Logic.Conexion;
import domain.PersonaDTO;
import domain.UsuarioDTO;
import java.util.ArrayList;
/**
 * @author DanielaAGonzalezH
 *
 */
public class UsuarioDaoJDBC implements UsuarioDAO2{
	
	private Conexion conexionTransaccional;
	
	private static final String SQL_SELECT = "SELECT idusuario,username,password FROM usuario";
	private static final String SQL_INSERT  = "INSERT INTO usuario(username,password) VALUES(?, ?) ";
	private static final String SQL_UPDATE  = "UPDATE usuario SET username = ? ,password = ?  WHERE idusuario = ?";
	private static final String SQL_DELETE = "DELETE FROM usuario WHERE idusuario = ?";
	
	public UsuarioDaoJDBC() {
		
	}
	
	public UsuarioDaoJDBC(Conexion conexionTransaccional) {
		this.conexionTransaccional = conexionTransaccional;
	}
	
	
	
	public List<UsuarioDTO> select() throws SQLException{
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		UsuarioDTO usuario = null;
		List<UsuarioDTO> usuarios = new ArrayList<>();
		
		
		try {
			conn = (Connection) (this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection());
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idUsuario = rs.getInt("idusuario");
				String username = rs.getString("username");
				String password = rs.getString("password");
				
				usuario =  new UsuarioDTO();
				
				usuario.setIdusuario(idUsuario);
				usuario.setUsername(username);
				usuario.setPassword(password);
				
				usuarios.add(usuario);	
			}
		}
		finally {
			try {
				Conexion.close(rs);
				Conexion.close(stmt);
				if(this.conexionTransaccional == null) {
					Conexion.close(conn);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		return usuarios;	
	}
	
	
	public int insert(UsuarioDTO usuario) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows =0;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, usuario.getUsername());
			stmt.setString(2, usuario.getPassword());
			rows = stmt.executeUpdate();
			System.out.println("Registros afectados "+rows);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		finally {
			try {
				stmt.close();
				conn.close();
				//close(conn);
			}catch(SQLException ex) {
				ex.printStackTrace(System.out);
			}		
		}
		return rows;
	}

	
	public int update(UsuarioDTO usuario) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros =0;
		
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			
			stmt.setInt(1, usuario.getIdusuario());
			stmt.setString(2, usuario.getUsername());
			stmt.setString(3, usuario.getPassword());
			
			registros = stmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		return registros;
	}
	
	public int delete(UsuarioDTO usuario) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros =0;
		
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, usuario.getIdusuario());
			registros = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		return registros;
	}


	

}
