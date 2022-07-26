/**
 * 
 */
package JavaBeans;

import java.io.Serializable;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class PersonaBean implements Serializable{
		
	private String nombre;
	private String apellido;
	//Debe tener un constructor vacío 
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido =apellido;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonaBean [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append("]");
		return builder.toString();
	}
	public PersonaBean() {
		
	}
	public PersonaBean(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	
	
}
