/**
 * 
 */
package ManejoArchivos;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestManejoarchivos {
	
	public static void main(String [] args) {
		String nombreArchivo = "prueba.txt";
		ManejoArchivos archivo = new ManejoArchivos();
		//archivo.crearArchivo(nombreArchivo);
		ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde Java");
		
		ManejoArchivos.anexarArchivo(nombreArchivo, "Adiós");
		
		
	}

}
