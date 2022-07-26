/**
 * 
 */
package ClaseOBJECT;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ClaseObjectJAVA {
	
	
	public static void main(String [] args) {
		
		
		Empleado empleado = new Empleado("daniela",5000);
		Empleado empleado2 = new Empleado("Daniela", 5000);
		
		if(empleado == empleado2) {
			System.out.println("Tienen la misma referencia en memoria");
		}
		else {
			System.out.println("Tienen distinta referencia en memoria");
		}
		
		
		if(empleado.equals(empleado2)) {
			System.out.println("Los objetos son iguales en contenido");
		}else {
			System.out.println("Los objetos son distintos en contenidos");
		}
		
		if (empleado.hashCode() == empleado2.hashCode()) {
			System.out.println("El valor hascode es igual");
		}else {
			System.out.println("El valor hashcode es distinto");
		}
		
		
		
		
	}
	
	

}
