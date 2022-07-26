package Parcial;

import java.util.Scanner;

public class CaracteristicasNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		int cantidad = dato.nextInt();
		String [] arreglo = llenarArreglo(cantidad);
		System.out.println(determinarCaracteristicasNombres(arreglo));
	}
	/**
	 * Función que llena un arreglo de strings
	 * @param cantidad
	 * @return
	 */
	public static String[] llenarArreglo(int cantidad)
	{
		String []arreglo = new String[cantidad];
		Scanner dato=new Scanner(System.in);
		String palabra="";
		for(int i=0;i<arreglo.length;i++){
			System.out.println((i+1)+" Ingrese la palabra");
			palabra = dato.nextLine();
			arreglo[i] = palabra;	
		}
		return arreglo;
	}
	/**  Función que determina cuantos nombres inician con vocal, cuantos terminan en
	 * consonantes y cuantos son palindromas
	 * 
	 * 	@param arreglo
	 * 	@return
	 */
	public static String determinarCaracteristicasNombres(String []arreglo){
		String cadena="";
		String palabra="";
		int contadorVocal=0;
		int contadorConsontantes=0;
		int contadorPalindroma=0;
		
		
		for (int i=0;i<arreglo.length;i++){
			
			palabra = arreglo[i];
			char inicial = palabra.charAt(0);
			char terminaFinal = palabra.charAt(palabra.length()-1);
			
				if (inicial == 'a' || inicial == 'e' || inicial == 'i' 
						|| inicial == 'o' || inicial == 'u'){
					contadorVocal+=1;	
				}
				if(terminaFinal >= 'a' &&  terminaFinal <='z'){
					contadorConsontantes+=1;
				}
				if(esPalindroma(palabra)){
					contadorPalindroma+=1;
				}
			palabra="";
		}
		
		cadena += "Nombres que comienzan con vocales "+contadorVocal+" Nombres que terminan en consonantes: "+contadorConsontantes
				+" Cantidad de nombres que son palindromass: "+contadorPalindroma;
		
		return cadena;
	}
	/**
	 * Función que determina cuantos nombres son palindromos
	 * @param palabra
	 * @return
	 */
	public static boolean esPalindroma(String palabra){
		boolean esPalindroma=false;
		String inversa="";
		for(int i=palabra.length()-1;i>=0;i--){
			inversa = inversa + palabra.charAt(i);
		}
		if(inversa.equals(palabra)){
			esPalindroma = true;
		}else{
			esPalindroma=false;
		}
		return esPalindroma;
		
	}
	
}