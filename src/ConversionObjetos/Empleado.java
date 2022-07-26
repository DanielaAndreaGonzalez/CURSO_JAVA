/**
 * 
 */
package ConversionObjetos;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Empleado {
	protected String nombre;
	protected double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		
	}
	
	public String obtenerDetalles() {	
		return "Nombre" + this.nombre + ", "+"sueldo "+this.sueldo;
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

	/**
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo el sueldo a establecer
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [nombre=");
		builder.append(nombre);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
