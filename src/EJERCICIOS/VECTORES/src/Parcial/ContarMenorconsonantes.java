package Parcial;

import java.util.Scanner;

public class ContarMenorconsonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector:  ");
		int tamanio = dato.nextInt();
		String arreglo[] = llenarArreglo(tamanio);
		System.out.println("Palabra menor Consonante: "+sacarMenorConsonantes(arreglo));
	}
	
	public static String[] llenarArreglo(int cantidad){
		String arreglo[] = new String[cantidad];
		Scanner dato=new Scanner(System.in);
		String palabra="";
		for(int i=0;i<arreglo.length;i++){
			System.out.println((i+1)+" Ingrese la palabra");
			palabra = dato.nextLine();
			arreglo[i] = palabra;	
		}
		return arreglo;			
	}
	public static boolean esConsonante(char a){
		boolean consonante=false;
		
		if (a != 'a' || a!= 'e' || a!= 'i' || a != 'o' || a != 'u'){
			consonante= true;
		}else{
			consonante = false;
		}
		return consonante;
	}
	
	public static String sacarMenorConsonantes(String [] arreglo){
		int menorConsonantes=9999;
		int cantidadMenor=0;
		String palabra="";
		for(int i=0;i<arreglo.length;i++){
			String cadena = arreglo[i];
			
			for(int j=0;j<=cadena.length();j++){
				if(esConsonante(cadena.charAt(i)))
				{
					cantidadMenor+=1;
				}
			}
			if(cantidadMenor < menorConsonantes){
				 menorConsonantes = cantidadMenor ;
				 palabra = cadena;
			}
			cantidadMenor=0;
		}
		return palabra;
	}
	
	

}
