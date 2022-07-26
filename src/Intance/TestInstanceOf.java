/**
 * 
 */
package Intance;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestInstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//Instanceof también sirve para comvertir variables 
		
		
		Empleado empleado = new Empleado("Daniela", 5000);
		//determinarTipo(empleado);
		empleado = new Gerente("Karla", 10000, "Contabilidad");
		determinarTipo(empleado);
	
	}
	public static void determinarTipo(Empleado empleado) {
		// Intance of para preguntar por clases hijas
		//
		if (empleado instanceof Gerente) {
			System.out.println("Es de tipo gerente");
			Gerente gerente = (Gerente)empleado;
			System.out.println("gerente = "+gerente.departamento);
			
		}
		else if(empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");
			//Gerente gerente = (Gerente)empleado;
			System.out.println("gerente = "+empleado.getNombre());
		}
		else if(empleado instanceof Object) {
			System.out.println("Es de tipo Object");
			empleado.toString();
		}
		
			
		
		
		
	}

}
