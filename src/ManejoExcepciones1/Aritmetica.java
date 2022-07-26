/**
 * 
 */
package ManejoExcepciones1;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Aritmetica {
	public static int dividir(int numerador, int denominador) throws OperacionExcepcion {
		
		if (denominador == 0) {
			//Arrojar
			throw new OperacionExcepcion("Divisi�n entre cero");	
		}
		return numerador /denominador;
	}

}
