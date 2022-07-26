package ForEach;

public class Persona {

	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
