package Logic2;

import java.util.Scanner;

public class TercerPunto {

	/*
	 * Dada una cadena de números, sumar cada uno de los dígitos de la cadena.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese la cadena de números: ");
		String numero = dato.nextLine();
		System.out.println(sumarNumeros(numero));
	}

	public static int sumarNumeros(String numeros){
		int acu=0;
		for (int i=0; i<numeros.length();i++ ){
			if (numeros.charAt(i) >= '0' && numeros.charAt(i) <= '9'){
				acu = acu + Integer.parseInt(""+numeros.charAt(i));		
			}
		}
		return acu;
			
	}
	
}
