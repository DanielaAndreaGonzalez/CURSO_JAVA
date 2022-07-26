/**
 * 
 */
package ConversionObjetos;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class TestConversionObjetos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
			Empleado empleado;
			
			empleado = new Escritor("Dani" , 5000, TipoEscritura.CLASICO);
			//System.out.println("empleado = "+empleado);
			
			
			System.out.println(empleado.obtenerDetalles());
			
			//downCasting
			//((Escritor)empleado).getTipoEscritura();
			// Conversion Un tipo padre a tipo hija
			Escritor escritor = (Escritor) empleado;
			escritor.getTipoEscritura();
			
			//Upcasting
			// conversion de Un tipo hija a tipo padre
			Empleado empleado2 = escritor;
			empleado2.obtenerDetalles();
			
			
			
	}

}
