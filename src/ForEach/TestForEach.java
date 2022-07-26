package ForEach;

public class TestForEach {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		int edades[] = {5, 6, 8, 9};
		for(int edad: edades) {
			//Con esto java recorre cada elemento que se tiene en el arreglo
			System.out.println("Edad "+edad);
		//Con este m�todo no se puede acceder a un contador como el
			//for original
		}
		
		Persona personas[] = {new Persona("Daniela"), new Persona("Karla"), new Persona("Agust�n")};
		for (Persona persona: personas) {
			System.out.println("Persona" +persona);
			
		}
		
		
		
		
		
		
	}

}
