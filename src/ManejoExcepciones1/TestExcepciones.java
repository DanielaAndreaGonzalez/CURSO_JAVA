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
		 * Excepciones de mayor jerarqu�a al final
		 */
			int resultado = 0;
			try {
				resultado = dividir(10, 0);
			}
			
			catch(OperacionExcepcion e) {
				System.out.println("Ocurri� un error de tipo OperacionExcepcion");
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				//Imprimir la pila de excepciones
				//una excepcion puede generar a su vez
				//m�s excepciones
				System.out.println("Ocurri� un error de tipo excepcion ");
				//e.printStackTrace(System.out);
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Se revis� la divisi�n entre cero");
			}
			System.out.println("Resultado "+resultado);
			
			
			
	}
	

}
