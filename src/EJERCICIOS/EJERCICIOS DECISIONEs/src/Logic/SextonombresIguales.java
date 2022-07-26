package Logic;

import java.util.Scanner;

public class SextonombresIguales {

	/**
	 * Realizar un programa que solicite al usuario ingresar los nombres de dos
personas, los cuales se almacenarán en dos variables. A continuación,
imprimir “coincidencia” si los nombres de ambas personas comienzan con la
misma letra ó si terminan con la misma letra. Si no es así, imprimir “no hay
coincidencia”.
	 * @param nombre1
	 * @param nombre2
	 */
	
	public static void mirarLetras(String nombre1,String nombre2){
		
		char primeraLetra = nombre1.charAt(0);
		char primeraLetra2 = nombre2.charAt(0);
		String ultimaLetra = nombre1.substring(nombre1.length()-1);
		String ultimaLetra2 = nombre2.substring(nombre2.length()-1);
		
		if (primeraLetra == primeraLetra2){
			System.out.println("Coincidencia");
		}else if ( ultimaLetra.equals(ultimaLetra2)){
			System.out.println("Coincidencia");
		}else{
			System.out.println("No hay coincidencia");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el primer nombre: ");
		String nombre1 = dato.nextLine();
		System.out.println("Ingrese el segundo nombre: ");
		String nombre2 = dato.nextLine();
		mirarLetras(nombre1, nombre2);
	}

}
