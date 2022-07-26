package TallerCiclosConNumeros2;

import java.util.Scanner;

public class Tercero {

	/*
	 * Escriba una función que retorne la cantidad de vocales, que contiene una
	cadena ingresada por parámetro, de manera discriminada (cuantas a?,
	cuantes e?,….).
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la cadena: ");
		String cadena = dato.nextLine();
		System.out.println(contarVocales(cadena));
	}

	public static String contarVocales(String cadena){
		String cantidadesVocales="";
		int cantidadAes=0;
		int cantidadEs=0;
		int cantidadIes=0;
		int cantidadO=0;
		int cantidadUes=0;
		for (int i=0; i<cadena.length(); i++){
			
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A'){
				cantidadAes +=1;
			}else if(cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E'){
				cantidadEs+=1;
			}else if(cadena.charAt(i) =='i' || cadena.charAt(i) == 'I'){
				 cantidadIes+=1;
			}else if( cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O'){
				 cantidadO+=1;
			}else if(cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U'){
				cantidadUes+=1;
			}else{
				cantidadesVocales += "";
			}
			
			
		}
		cantidadesVocales = cantidadesVocales +"Cantidad de A o a ="+cantidadAes+
				"\n Cantidad de E o e ="+cantidadEs+"\n Cantidad de I o i ="+cantidadIes+
				"\n Cantidad de O u o = "+cantidadO+ "\n Cantidad de U o u ="+cantidadUes;
		
		return cantidadesVocales;
	}
}
