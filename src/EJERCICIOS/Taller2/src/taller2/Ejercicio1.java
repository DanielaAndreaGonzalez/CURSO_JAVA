package taller2;

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * Funci�n que verifica que un caracter ingresado es una letra may�scula 
	 * 	y recibe como par�metro : @param caracter
	 */
	public static void hallarCaracter(String caracter){
		
		if (caracter.hashCode() >= 65 && caracter.hashCode() <= 90){
			 System.out.println("La letra ingresada es may�scula ");
			 return;
		}
		System.out.println("No es may�scula");	
	}
	
	public static void mayuscula(char letra){
		if(letra >= 'A' && letra <= 'Z'){
			System.out.println("La letra es may�scula ");
		}else{
			System.out.println("La letra no es may�scula");
		}	
	}
	
	public static void main(String[] args) {
		
		// 1. Realizar un programa que lea un car�cter ingresado por teclado y compruebe
		//si es una letra may�scula.
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el car�cter: ");
		String caracter = dato.next();
		char letra = dato.next().charAt(0);
		//hallarCaracter(caracter);
		mayuscula(letra);
	}


}
