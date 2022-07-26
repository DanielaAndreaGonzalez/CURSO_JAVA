package Parcial;

import java.util.Scanner;

public class FusionarArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el tamaño para los arreglos: ");
		int cantidad=dato.nextInt();
		int []arreglo1 = llenarArreglo(cantidad);
		System.out.println("Segundo arreglo");
		int []arreglo2 = llenarArreglo(cantidad);
		int []arreglo = fusionarArreglos(arreglo1, arreglo2);
		recorrerArreglo(arreglo);
		
		
	}
	/**
	 * Función que llena un arreglo
	 * @param cantidad
	 * @return
	 */
	public static int[] llenarArreglo(int cantidad){
		int arreglo[] = new int[cantidad];
		Scanner dato=new Scanner(System.in);
		int numero=0;
		
		for(int i=0;i<cantidad;i++){
			System.out.println("Ingrese el número: ");
			numero = dato.nextInt();
			arreglo[i] = numero;
		}
		//dato.close();
		return arreglo;
	}
	/**
	 * Función que permite fusionar en un arreglo resultante dos arreglos
	 * enviados por parámetros  
	 * @param arreglo1
	 * @param arreglo2
	 * @return
	 */
	public static int[] fusionarArreglos(int arreglo1[],int arreglo2[]){
		int tamanio = (arreglo1.length) + (arreglo2.length);
		int arregloResultante[] = new int[tamanio];
		int k=0;
		for (int i=0;i<arreglo1.length;i++){
			arregloResultante[k] = arreglo1[i];
			k+=2;	
		}
		k=1;
		for (int j=arreglo2.length-1;j>=0;j--){
			arregloResultante[k] = arreglo2[j];
			k+=2;
		}
		
		return arregloResultante;	
	}
	/**
	 * Función que permite imprimir los elementos de un arreglo
	 * @param arreglo
	 */
	public static void recorrerArreglo(int []arreglo){
		
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
		
		
	}

}
