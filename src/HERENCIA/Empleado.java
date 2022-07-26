package HERENCIA;
//Para heredar de la clase persona

public class Empleado extends Persona{
	
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	/*
	public Empleado() {
		Se utiliza para mandar a llamar constructores de la misma clase 
		this();
	}*/
	
	
	
	public Empleado(String nombre, double sueldo) {
		//Esta línea se da para llamar al constructor de la clase padre
		super(nombre);
		this.idEmpleado =  ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public static int getContadorEmpleado() {
		return contadorEmpleado;
	}


	public static void setContadorEmpleado(int contadorEmpleado) {
		Empleado.contadorEmpleado = contadorEmpleado;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=").append(this.idEmpleado);
		builder.append(idEmpleado);
		builder.append(", sueldo=");
		builder.append(sueldo);
		//COn el super estamos accediendo a la información de la clase padre
		builder.append(" ]").append(super.toString()).append("");
		return builder.toString();
	}



		
	
	
	
	
	/**public Empleado(String nombre, char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		// TODO Esbozo de constructor generado automáticamente
	} Constructor de la clase padre*/
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
