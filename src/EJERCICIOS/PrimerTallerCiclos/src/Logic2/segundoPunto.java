package Logic2;

import java.util.Scanner;

public class segundoPunto {

	
	/*
	 * Dada una palabra que contiene letras y números, retornar la palabra sin números.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la cadena de caracteres: ");
		String cadena = dato.nextLine();
		System.out.println("Cadena sin números "+eliminarNumeros2(cadena));
		
	}
	
	public static String eliminarNumeros(String cadena){
		String cadenaNueva="";
		String numeros="";
		char [] cadenaDiv = cadena.toCharArray();
		
		for (int i=0;i <cadena.length();i++){
			
			if (Character.isDigit(cadenaDiv[i])){
				
				numeros = numeros + cadenaDiv[i];
			}else{
				cadenaNueva = cadenaNueva + cadenaDiv[i];
			}
				
		}
		return cadenaNueva;
	}
	
	
	public static String eliminarNumeros2(String cadena){
		String cadenaFinal="";
		
		for (int i=0; i<cadena.length();i++){
			
			if ((cadena.charAt(i) >= 'a' && cadena.charAt(i)<= 'z' )||( cadena.charAt(i) >= 'A' && 
					cadena.charAt(i) <= 'Z')){
				cadenaFinal = cadenaFinal +=cadena.charAt(i);
			}
			
		}
		return cadenaFinal;
	}
	
	

}
