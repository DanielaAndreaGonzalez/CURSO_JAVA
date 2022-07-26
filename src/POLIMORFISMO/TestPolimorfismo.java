/**
 * 
 */
package POLIMORFISMO;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestPolimorfismo {
	
	public static void main(String [] args) {
		
		
		Empleado empleado = new Empleado("Daniela",5000);
		//System.out.println("Empleado "+empleado.obtenerDetalles());
		imprimir(empleado);
		Gerente gerente = new Gerente("Karla",10000,"Contabilidad");
		/**
		 * Se aplica concepto de polimorfismo porque cuando se le
		 * pasa gerente ejecuta el método que se está sobreescribiendo
		 * en la clase hija. Multiples comportamientos dependiendo
		 * del tipo al cual se esta apuntando
		 */
		imprimir(gerente);
		//System.out.println("gerente = "+gerente.obtenerDetalles());
		
		
	}
	
	public static void imprimir(Empleado empleado) {
		String detalles = empleado.obtenerDetalles();
		System.out.println("Empledo "+empleado.obtenerDetalles());
		
		
		
		
		
		
	}
	
	
	
}
