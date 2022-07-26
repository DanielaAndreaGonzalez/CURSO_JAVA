package BloquesInicialización;

public class Persona {

	
	private final int idPersona;
	private static int contadorPersonas;
	
	
	//Bloque de inicialización estático
	//Se ejecuta antes del constructor
	static {
		System.out.println("Ejecución bloque estático");
		++Persona.contadorPersonas;
	}
	
	//Bloque de inicialización no estático
	//Se ejecuta antes del constructor de nuestra clase
	{
		System.out.println("Ejecución bloque no estático");
		this.idPersona = Persona.contadorPersonas++;
	}
	

	public Persona() {
		System.out.println("Ejecución del constructor");
	}


	/**
	 * @return el idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
