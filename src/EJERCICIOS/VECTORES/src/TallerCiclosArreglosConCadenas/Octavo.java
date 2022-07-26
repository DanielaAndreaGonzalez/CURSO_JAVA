package TallerCiclosArreglosConCadenas;

import java.util.Scanner;

public class Octavo {

	//Realice una función que dado un arreglo de Strings informe la palabra con mayor
	//cantidad de vocales
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el tamaño");
		int tamanio = dato.nextInt();
		System.out.println(imprimir(tamanio));
		
	}
	
	public static String imprimir(int tamanio){
		String cadena="";
		String arreglo[] = new String[tamanio];
		int contador=0;
		String cadena2="";
		String palabraMayor ="";
		int aux=0;
		String cadenaIm="";
		for(int i=0; i<arreglo.length;i++){
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese la palabra");
			String palabra = dato.nextLine();
			arreglo[i] = palabra;
			
		}	
		
		for(int i=0; i<arreglo.length;i++){
			cadena = arreglo[i];
			
			for (int j=0; j<cadena.length();j++){
				if (cadena.charAt(j) =='a' || cadena.charAt(j) =='e' || cadena.charAt(j) =='i' ||  
						cadena.charAt(j) =='o' || cadena.charAt(j) =='u'){
					contador +=1;
				}	
			}
		if(contador>aux){
			aux = contador;
			palabraMayor= cadena;
		}
			
		contador=0;
			
		}
		cadenaIm = aux +"-"+palabraMayor;
		return cadenaIm;
	}

}
