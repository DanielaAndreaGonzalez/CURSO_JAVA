package TallerCiclosNumeros;

import java.util.Scanner;

public class Sexto {

	/*
	 * Cree una función que permita calcular el número factorial de un número
entero positivo.

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el número");
		int numero =dato.nextInt();
		int suma = calcularFactorial(numero);
		System.out.println("El factorial de un número es: "+suma);
			
	}

	public static int calcularFactorial(int numero){
		
		int suma=1;
		while (numero>0){
			
			suma=suma*numero;
			
			numero=numero-1;
			
		}
		
		return suma;
	}
	
}
