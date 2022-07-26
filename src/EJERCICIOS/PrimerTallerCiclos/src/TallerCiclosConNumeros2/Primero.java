package TallerCiclosConNumeros2;

import java.util.Scanner;

public class Primero {

	/*
	 * Cree una función que dado un texto retorne dicho texto en orden inverso.
	Ejemplo texto=”Hola”, texto inverso seria “aloH”.
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese la cadena");
		String cadena = dato.next();
		System.out.println(retornarCadenaInversa(cadena));
	}
	
	public static String retornarCadenaInversa(String cadena){
		String inversa="";
		for(int i=0;i<cadena.length();i++){
			inversa =cadena.charAt(i)+inversa;
			System.out.println(cadena.charAt(i)+inversa);
		}
		
		return inversa;
	}

}
