/**
 * 
 */
package ManejoArchivos;

import java.io.BufferedReader;
import java.io.File;//Io significa input output
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;


/**
 * @author DanielaAGonzalezH
 *
 */
public class ManejoArchivos {
	
	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close(); // se crea el archivo en el disco duro
			System.out.println("Se ha creado el archivo");
		}catch(FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}	
	}
	
	public static void escribirArchivo(String nombreArchivo,String contenido) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close(); // se crea el archivo en el disco duro
			System.out.println("Se ha escrito al archivo");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}		
	}
	
	public static void anexarArchivo(String nombreArchivo,String contenido){
		File archivo = new File(nombreArchivo);
		try {

			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close(); // se crea el archivo en el disco duro
			System.out.println("Se ha anexado información al archivo");

		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}	catch(IOException ex) {
			ex.printStackTrace(System.out);
		}
		
		
		
	}

	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			// Se leen líneas completas
			String lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println("Lectura = " + lectura);
				lectura = entrada.readLine();
			}
			//Se cierra el bufferedReader
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public ManejoArchivos() {
	
	}
	
	
	

}
