package TallerCiclosNumeros;

import java.util.Scanner;

public class septimo {

	/*
	 * Cree una funci�n que, dado un n�mero entero positivo, permita determinar si
	el n�mero es o no primo.

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el n�mero entero: ");
		int numero = dato.nextInt();
		
		boolean salida=determinarNumeroPrimo(numero);
		if (salida){
			System.out.println("El n�mero "+numero+" es primo");
		}else{
			System.out.println("El n�mero "+numero+" no es primo");
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
