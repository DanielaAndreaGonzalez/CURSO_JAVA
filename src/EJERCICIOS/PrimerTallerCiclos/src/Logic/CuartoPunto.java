package Logic;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class CuartoPunto {

	/*Registrar n palabras,
	 *  el programa terminará de realizar los registros hasta que se ingrese la palabra CODIGO.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el número de palabras a ingresar: ");
		int numeroPalabras = dato.nextInt();
		registrarPalabar(numeroPalabras);
	}
	
	public static void registrarPalabar(int palabras){
		String cadena = "CODIGO";
		String palabra="";
		for (int i=0; i<palabras; i++){
			Scanner dato= new Scanner(System.in);
			System.out.println("Ingrese la palabra: "+i);
			palabra = dato.nextLine();
			if ( palabra.equals(cadena)){
				break;
			}else{	
				continue;
			}
		}
		
		
	}

}
