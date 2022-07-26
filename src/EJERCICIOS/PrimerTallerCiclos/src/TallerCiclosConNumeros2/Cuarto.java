package TallerCiclosConNumeros2;

import java.util.Scanner;

public class Cuarto {

	
	/*
	 * Cree una función que dada un texto determine si dicho texto es o no un
	palíndromo.
	NOTA: un texto palíndromo es aquel que se lee igual de izquiera a derecha
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la palabra ");
		String cadena = dato.nextLine();
		System.out.println(determinarTexto(cadena));
	}
	public static String determinarTexto(String cadena){
		
		String esPalindromo="";
		String inversa="";
		
		for(int i=0; i<cadena.length(); i++){	
			inversa = cadena.charAt(i)+inversa;
		}
		if (inversa.equals(cadena)){
			esPalindromo = esPalindromo +"Es una palabra Palindroma";
		}else{
			esPalindromo = esPalindromo+ "No es una palabra palindroma";
		}
		
		return esPalindromo;
		
	}

}
