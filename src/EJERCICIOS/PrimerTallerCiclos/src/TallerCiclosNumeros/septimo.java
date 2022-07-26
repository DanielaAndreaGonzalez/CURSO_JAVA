package TallerCiclosNumeros;

import java.util.Scanner;

public class septimo {

	/*
	 * Cree una función que, dado un número entero positivo, permita determinar si
	el número es o no primo.

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el número entero: ");
		int numero = dato.nextInt();
		
		boolean salida=determinarNumeroPrimo(numero);
		if (salida){
			System.out.println("El número "+numero+" es primo");
		}else{
			System.out.println("El número "+numero+" no es primo");
		}
			
	}
	
	public static boolean determinarNumeroPrimo(int numero){
		
		boolean esPrimo = false;
		int contador=0;
		
		for (int i=1; i<=numero;i++){
			
			if (numero%i==0){
				contador +=1;
			}	
		}
		if (contador==2){
			esPrimo=true;
		}
		
		return esPrimo;
		
		
	}

}
