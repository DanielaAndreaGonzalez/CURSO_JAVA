package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Logic.Conexion;
import domain.PersonaDTO;

public class PersonaDaoJDBC implements PersonaDAO2{

	private Conexion conexionTransaccional;
	
	
	
	private static final String SQL_SELECT = "SELECT idpersona , nombre , apellido, email, telefono FROM persona";
	private static final String SQL_INSERT  = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?) ";
	private static final String SQL_UPDATE  = "UPDATE persona SET nombre = ? , apellido = ?, email = ? , telefono = ? WHERE idpersona = ?";
	private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";
	
	
	
	public PersonaDaoJDBC() {
		
	}
	
	public PersonaDaoJDBC(Conexion conexionTransaccional) {
		this.conexionTransaccional = conexionTransaccional;
	}
	
	public List<PersonaDTO> select() throws SQLException{
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		PersonaDTO persona = null;
		List<PersonaDTO> personas = new ArrayList<>();
		Conexion conex = null;
		
		try {
			conn = (Connection) (this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection());
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idPersona = rs.getInt("idpersona");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String email = rs.getString("email");
				String telefono = rs.getString("telefono");
				persona =  new PersonaDTO(idPersona,nombre, apellido, email, telefono);
				personas.add(persona);	
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
		return personas;	
	}
	
	
	public int insert(PersonaDTO persona) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros =0;
		try {
			conn = (Connection) (this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection());
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellido());
			stmt.setString(3, persona.getEmail());
			stmt.setString(4, persona.getTelefono());
			registros = stmt.executeUpdate();
			
			
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
		return registros;
	}

	
	public int update(PersonaDTO persona) throws SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros =0;
		
		try {
			conn = (Connection) (this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection());
			stmt = conn.prepareStatement(SQL_UPDATE);
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellido());
			stmt.setString(3, persona.getEmail());
			stmt.setString(4, persona.getTelefono());
			stmt.setInt(5, persona.getIdpersona());
			registros = stmt.executeUpdate();
		
		} 
		finally {
			try {
			
				Conexion.close(stmt);
				if(this.conexionTransaccional == null) {
					Conexion.close(conn);
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		return registros;
	}
	
public int delete(PersonaDTO persona) throws SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros =0;
		
		try {
			conn = (Connection) (this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection());
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, persona.getIdpersona());
			registros = stmt.executeUpdate();
		} finally {
			try {
				
				Conexion.close(stmt);
				if(this.conexionTransaccional == null) {
					Conexion.close(conn);
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		return registros;
	}
	
	
	
	
	
	
	
	
	
	
}
