package sobrecargametodos;

public class Operacion {

	
	/**
	 * SOBRECARGA DE M�TODOS 
	 * DEFINIR dos o m�s veces el m�todo a utilizar pero poniendo el mismo nombre
	 * la diferencia radica en la cantidad de argumentos
	 */
	
	//ser� static para no tener que instancar objetos de esta clase
	public static int sumar(int a, int b) {
		System.out.println("Sumar (int a, int b)");
		return a+ b;
	}
	//Debe cambiar el tipo de dato
	public static double sumar(double a, double b) {
		System.out.println("sumar (double a, double b)");
		return a + b;
	}
	
	
	
	
}
