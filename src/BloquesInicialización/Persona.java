package BloquesInicializaci�n;

public class Persona {

	
	private final int idPersona;
	private static int contadorPersonas;
	
	
	//Bloque de inicializaci�n est�tico
	//Se ejecuta antes del constructor
	static {
		System.out.println("Ejecuci�n bloque est�tico");
		++Persona.contadorPersonas;
	}
	
	//Bloque de inicializaci�n no est�tico
	//Se ejecuta antes del constructor de nuestra clase
	{
		System.out.println("Ejecuci�n bloque no est�tico");
		this.idPersona = Persona.contadorPersonas++;
	}
	

	public Persona() {
		System.out.println("Ejecuci�n del constructor");
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
