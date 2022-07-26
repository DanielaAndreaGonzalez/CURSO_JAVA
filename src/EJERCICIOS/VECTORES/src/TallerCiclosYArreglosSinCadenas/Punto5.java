package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		int tamanio = dato.nextInt();
		int suma=sumarElementos(tamanio);
		System.out.println("La suma de los elementos es: "+suma);	
	}
	public static int sumarElementos(int tamanio){
		int suma=0;
		int arreglo[] = new int[tamanio];
		for(int i=0; i<arreglo.length;i++){
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese número: ");
			int numero = dato.nextInt();
			arreglo[i] = numero;
			suma+=arreglo[i];
		}
	return suma;	
	}

}
