package ArgumentosVariables;
/**
 * 
 * @author DanielaAGonzalezH
 *
 */
public class TestArgumentosVariables {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		imprimirNumeros(3,4,5);
		imprimirNumeros(1,2);
		//POr eso se conoce como argumentos variables, porque estos varían
		variosParametros("Daniela", 8 ,9 ,10);
		
		
	}
	
	private static void imprimirNumeros(int... numeros) {
		
		for(int i= 0; i < numeros.length; i++ ) {
			System.out.println("Elemento: "+ numeros[i]);
			
		}
		
	}
	private static void variosParametros(String nombre, int...numeros) {
		
		System.out.println("Nombre = "+nombre);
		imprimirNumeros(numeros);
	}
	

}
