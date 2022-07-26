package CLASES;

public class Persona {
		//Atributos de la clase
		private int idPersona;
		String nombre;
		private static int contadorPersonas;

		public Persona(String nombre) {
			this.nombre = nombre;
			//Incrementar el contador por cada objeto nuevo
			Persona.contadorPersonas++;
			//ASignar el nuevo valor a la variable idPersona
			this.idPersona = Persona.contadorPersonas;
		}
		
		public int getIdPersonas() {
			
			return idPersona;
		}
		
		public static void setContadorPersonas(int aContadorPersonas) {
			contadorPersonas = aContadorPersonas;
		}
		
		@Override
		public String toString() {
			return "Persona {" + "idPersona="+ idPersona + ", nombre="+ nombre +"}";
		}
}


