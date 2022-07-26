package TallerCiclosConNumeros2;

import java.io.Reader;
import java.util.Scanner;

public class Quinto {

	/*
	 * Programe un funci�n que reciba como par�metros una cadena de texto y un
	car�cter, retorna la posici�n donde se encuentra el car�cter ingresado dentro
	de la cadena

	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la cadena");
		String cadena = dato.nextLine();
		System.out.println("Ingrese el car�cter ");
		char caracter = dato.next().charAt(0);
		String posicion = encontrarPosicion(cadena, caracter);
		System.out.println("La posici�n que est� es: "+posicion);
	}
	
	public static String encontrarPosicion(String cadena,char c){
		
		String posicion="";
		
		for(int i=0; i<cadena.length();i++){
			
			if(cadena.charAt(i) == c){
				posicion= posicion +","+ i;
				
			}
		}
		
		return posicion;
	}

}
