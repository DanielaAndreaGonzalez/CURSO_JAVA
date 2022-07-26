package PalabraFinal;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*EN VARIABLES: Evita cambiar el valor que almacena la variable
		 * EN CLASES: Evita que se cree una subclase
		 EN MÉTODOS: Evita que se modifique la definición de un método desde una subclase
		 */
		
		
		
		final int miVariable = 10;
		System.out.println("MiVariable = "+miVariable);
		
		// Esto ya no se puede hacer... miVariable = 5;
		/**
		 * En Clases, si se coloca una clase padre como final, no se puede heredar los hijos
		 * lo mismo sucede con los métodos pues,no se podrá imprimir en la clase hija, porque esta escrito en la clase padre 
		 */
		
		/*
		 * PALABRA FINAL EN OBJETOS
		 */
		
		final Persona persona= new Persona();
		persona.setNombre("Dani");
		
	}

}
