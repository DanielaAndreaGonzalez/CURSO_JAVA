package TallerCiclosNumeros;

import java.util.Scanner;

public class Sexto {

	/*
	 * Cree una funci�n que permita calcular el n�mero factorial de un n�mero
entero positivo.

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el n�mero");
		int numero =dato.nextInt();
		int suma = calcularFactorial(numero);
		System.out.println("El factorial de un n�mero es: "+suma);
			
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
