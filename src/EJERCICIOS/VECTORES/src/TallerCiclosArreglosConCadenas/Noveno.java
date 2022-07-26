package TallerCiclosArreglosConCadenas;

import java.util.Scanner;

public class Noveno {

	//Realice una función que permita leer un arreglo de Strings y suprimir todas las vocales 
	//de cada de unas palabras contenidas
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		int tamanio = dato.nextInt();
		System.out.println(suprimirVocales(tamanio));
	}
	
	public static String suprimirVocales(int tamanio){
		String cadena="";
		String arreglo[] = new String[tamanio];
		char auxVocales=' ';
		String cadena2="";
		String auxConsonantes ="";
		
		for(int i=0; i<arreglo.length;i++){
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese la palabra");
			String palabra=dato.nextLine();
			arreglo[i] = palabra;	
		}
		
		for (int i=0; i<arreglo.length;i++){
			cadena = arreglo[i];
			
			for (int j=0; j<cadena.length();j++){
				
				if (cadena.charAt(j) =='a' || cadena.charAt(j) =='e' || cadena.charAt(j) =='i' ||  
						cadena.charAt(j) =='o' || cadena.charAt(j) =='u')
				{
					auxVocales = cadena.charAt(j);
					auxVocales=' ';
					
				}else{
					auxConsonantes =""+cadena.charAt(j);
					cadena2 +=auxConsonantes;
				}
				cadena2 +=auxVocales;	
			}
		System.out.println(cadena2);	
		cadena2="";
		
		
		}
		return cadena;
	}
	
	

}
