package HERENCIA;

public class Persona {
	//Lo que sea privado no se hereda a las clases hijas
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, char genero, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return this.genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
//Este m�todo por ser p�blico hereda al hijo

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
