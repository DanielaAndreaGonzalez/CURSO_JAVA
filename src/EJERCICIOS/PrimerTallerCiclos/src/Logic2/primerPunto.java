package Logic2;

import java.util.Scanner;

public class primerPunto {

	/*
	 * Realizar una función que reciba una palabra y
	 *  cuente la cantidad de vocales que tiene la palabra.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese la palabra: ");
		String palabra = dato.nextLine();
		System.out.println("Hay "+contarVocales(palabra)+" vocales");
	}
	public static int contarVocales(String cadena){
		
		int contadorVocal=0;
		for (int i=0;i < cadena.length();i++){
			
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) =='u'){
				contadorVocal+=1;
			}
			
		}
		return contadorVocal;
		
	}
	
	
}
