package Logic;

import java.util.Scanner;

public class SegundoPunto {

	/*Programa que calcula el factorial 
	de un valor num�rico introducido como par�metro o argumento en la l�nea de comandos.
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el n�mero para calcularle el factorial");
		int numero = dato.nextInt();
		System.out.println("Factorial = "+calcularFactorial(numero));
		
	}
	public static int calcularFactorial(int numero){
		
		int acumulado =1;
		for (int i=1; i<=numero;i++){
			
			acumulado *=i;
		}
		return acumulado;
	}
	

}
