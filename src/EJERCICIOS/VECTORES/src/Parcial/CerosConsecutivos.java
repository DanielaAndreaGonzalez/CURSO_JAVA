package Parcial;

import java.util.Scanner;

public class CerosConsecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingre el tamaño del arreglo: ");
		int tamanio=dato.nextInt();
		//int arreglo[] = llenarArreglo(tamanio);
		int arreglo[] = llenarArreglo(tamanio);
		boolean verificar = verificar(arreglo);
		
		if (verificar){
			System.out.println("Hay 2 ceros consecutivos");
		}else{
			System.out.println("No hay 2 ceros consecutivos");
		}
		
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
		dato.close();
		return arreglo;
	}
	/**
	 * Función que verifica si en un arreglo hay 2 ceros consecutivos 
	 * @param arreglo
	 * @return
	 */
	public static boolean verificar(int arreglo[]){
		
		boolean verificar=false;
		for (int i=0; i<arreglo.length-1 ;i++){
			if(arreglo[i] == 0 &&  arreglo[i+1] == 0){
				verificar = true;	
			}
		}
		return verificar;
		
	}
	
}
