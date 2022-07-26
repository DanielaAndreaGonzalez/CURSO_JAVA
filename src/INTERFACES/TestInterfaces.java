/**
 * 
 */
package INTERFACES;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		AccesoDatos datos = new ImplementacionMysql();
		//datos.listar();
		datos = new ImplementacionOracle();
		imprimir(datos);
		//datos.listar();
		
	}
	
	public static void imprimir(AccesoDatos datos) {
		datos.listar();
	}
	
	

}
