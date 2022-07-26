package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class Punto3 {

	
	//Realice una función que llene un arreglo de enteros con los números del -10 al 10
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llenarArregloNumeros();
	}
	
	
	public static void llenarArregloNumeros(){
	
		int arreglo[] = new int[20];
		Scanner dato=new Scanner(System.in);
		
		for(int i=0; i <arreglo.length; i++ ){
			System.out.println("Ingrese los valores: ");
			arreglo[i] = dato.nextInt();	
			
		}
		for (int i=0; i <arreglo.length;i++){
			System.out.println("El valor ["+i+"]"+arreglo[i]);
		}
		
		
		
	}

}
