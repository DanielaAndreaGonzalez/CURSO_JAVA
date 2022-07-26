package taller2;

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * Función que verifica que un caracter ingresado es una letra mayúscula 
	 * 	y recibe como parámetro : @param caracter
	 */
	public static void hallarCaracter(String caracter){
		
		if (caracter.hashCode() >= 65 && caracter.hashCode() <= 90){
			 System.out.println("La letra ingresada es mayúscula ");
			 return;
		}
		System.out.println("No es mayúscula");	
	}
	
	public static void mayuscula(char letra){
		if(letra >= 'A' && letra <= 'Z'){
			System.out.println("La letra es mayúscula ");
		}else{
			System.out.println("La letra no es mayúscula");
		}	
	}
	
	public static void main(String[] args) {
		
		// 1. Realizar un programa que lea un carácter ingresado por teclado y compruebe
		//si es una letra mayúscula.
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el carácter: ");
		String caracter = dato.next();
		char letra = dato.next().charAt(0);
		//hallarCaracter(caracter);
		mayuscula(letra);
	}


}
