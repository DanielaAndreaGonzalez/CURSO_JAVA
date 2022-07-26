package Parcial;

import java.util.Scanner;

public class PromedioNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector: ");
		int cantidad= dato.nextInt();
		int []arreglo = llenarArreglo(cantidad);
		System.out.println(calcularPromedios(arreglo));	
	}
	
	public static int[] llenarArreglo(int cantidad){
		int arreglo[] = new int[cantidad];
		Scanner dato=new Scanner(System.in);
		int numero=0;
		
		for(int i=0;i<arreglo.length;i++){
			System.out.println((i+1)+"Ingrese el número: ");
			numero = dato.nextInt();
			arreglo[i] = numero;	
		}
		return arreglo;
	}
	
	public static String calcularPromedios(int []arreglo){
		String cadena="";
		int cantidadPositivos=0;
		int cantidadNegativos=0;
		double promedioPositivos=0;
		double promedioNegativos=0;
		int sumaPositivos=0;
		int sumaNegativos=0;
		String cadenaPositivos="";
		String cadenaNegativos="";
		
		
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i] >0){
				sumaPositivos+=arreglo[i];
				cantidadPositivos+=1;
			}
			if(arreglo[i]<0){
				sumaNegativos+=arreglo[i];
				cantidadNegativos+=1;
			}
		}
		if (cantidadPositivos != 0){
			promedioPositivos = sumaPositivos/cantidadPositivos;
			cadenaPositivos = cadenaPositivos + "Promedio Positivos "+promedioPositivos;
		}else{
			
			promedioPositivos=0;
			cadenaPositivos = cadenaPositivos + "No hay números Positivos";
		}
		if(cantidadNegativos!=0){
			promedioNegativos = sumaNegativos/cantidadNegativos;
			cadenaNegativos = cadenaNegativos + "Promedio Negativos "+promedioNegativos;
		}else{
			promedioNegativos=0;
			cadenaNegativos = cadenaNegativos + "No hay números negativos: "+promedioNegativos;
		}
		cadena = cadena + cadenaPositivos + " "+ cadenaNegativos;
				
		return cadena;
	}
	
	

}
