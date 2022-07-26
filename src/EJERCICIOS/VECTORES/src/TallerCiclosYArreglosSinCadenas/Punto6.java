package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class Punto6 {

	
	// Realice una función que dado un arreglo retornar la suma de los elementos
	//pares de dicho arreglo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		int tamanio = dato.nextInt();
		int suma=sumarElementosPares(tamanio);
		System.out.println("La suma de los elementos pares es: "+suma);	
	}
	
	
	public static int sumarElementosPares(int tamanio){
		int suma=0;
		int arreglo[] = new int[tamanio];
		for(int i=0; i<arreglo.length;i++){
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese número: ");
			int numero = dato.nextInt();
			arreglo[i] = numero;
			
			if(arreglo[i]%2==0){
				suma+=arreglo[i];	
			}
		
		}
	return suma;	
	}
	

}
