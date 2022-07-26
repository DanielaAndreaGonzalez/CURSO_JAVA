package PalabraFinal;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		/*EN VARIABLES: Evita cambiar el valor que almacena la variable
		 * EN CLASES: Evita que se cree una subclase
		 EN M�TODOS: Evita que se modifique la definici�n de un m�todo desde una subclase
		 */
		
		
		
		final int miVariable = 10;
		System.out.println("MiVariable = "+miVariable);
		
		// Esto ya no se puede hacer... miVariable = 5;
		/**
		 * En Clases, si se coloca una clase padre como final, no se puede heredar los hijos
		 * lo mismo sucede con los m�todos pues,no se podr� imprimir en la clase hija, porque esta escrito en la clase padre 
		 */
		
		/*
		 * PALABRA FINAL EN OBJETOS
		 */
		
		final Persona persona= new Persona();
		persona.setNombre("Dani");
		
	}

}
