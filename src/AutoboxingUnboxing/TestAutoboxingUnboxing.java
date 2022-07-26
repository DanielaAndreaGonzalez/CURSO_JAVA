package AutoboxingUnboxing;

public class TestAutoboxingUnboxing {
	
	
		public static void main(String[] args) {
			// TODO Esbozo de m�todo generado autom�ticamente

				//Clases envolventes de tipos primitivos
				/*
				 * 	int - Integer    : Las clases contienen atributos y m�todos 
				 * 	long - Long        a diferencias de los tipos primitivos
				 * float - Float       solo almacenan un valor, pero no tienen
				 * double - Double     atributos ni m�todos
				 *  boolean - Boolean
				 *  byte - Byte
				 *  char - Character
				 *  short - Short
				 */
		
		Integer entero = 10;  //Autoboxing
		System.out.println("Entero " + entero);
		System.out.println("Entero double = " + entero.doubleValue());
		
			
	/**
	* Concepto de unboxing:
	* lo que sucede es que almacena este object
	* se extrae
	* por eso la variable de tipo int tiene el valor de 10
	*/
		int entero2 = entero; // Unboxing
		System.out.println("Entero2 = "+entero2);
		
		
		}
	
	
	
}
