package TallerCiclosConNumeros2;

import java.util.Scanner;

public class Segundo {

	/*
	 * Escriba una función que retorne la cantidad de aes que contiene una cadena
	ingresada por parámetro.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese la cadena ");
		String cadena = dato.nextLine();
		int cantidad = cantidadAes(cadena);
		System.out.println("Cantidad de aes que tiene la cadena es = :"+cantidad);	
	}
	public static int cantidadAes(String cadena){
		int cantidadAs=0;
		
		for(int i=0; i<cadena.length();i++){
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A'){
				cantidadAs+=1;
			}
		}
		
		return cantidadAs;
	}
	
}
