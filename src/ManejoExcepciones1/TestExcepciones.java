/**
 * 
 */
package ManejoExcepciones1;
import static ManejoExcepciones1.Aritmetica.dividir;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestExcepciones {
	
	public static void main(String [] args) {
		/*
		 * Excepciones de mayor jerarquía al final
		 */
			int resultado = 0;
			try {
				resultado = dividir(10, 0);
			}
			
			catch(OperacionExcepcion e) {
				System.out.println("Ocurrió un error de tipo OperacionExcepcion");
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				//Imprimir la pila de excepciones
				//una excepcion puede generar a su vez
				//más excepciones
				System.out.println("Ocurrió un error de tipo excepcion ");
				//e.printStackTrace(System.out);
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Se revisó la división entre cero");
			}
			System.out.println("Resultado "+resultado);
			
			
			
	}
	

}
