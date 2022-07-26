package taller2;

import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * Función que verifica si el número que se ingresa por el parámetro es
	 * múltiplo de 10
	 * @param numero
	 * @return true si es múltiplo y false si no es múltiplo
	 */
	
	public static boolean calcularMultiplo(int numero){
		boolean resultado;
		if (numero %10==0){
			resultado = true;
		}else{
			resultado = false;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Realizar un programa que lea un número entero y muestre si el número es
		//múltiplo de 10
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int numero = dato.nextInt();
		if (calcularMultiplo(numero)){
			System.out.println("El número ingresado es múltiplo de 10");
		}else{
			System.out.println("El número no es múltiplo de 10 ");
		}
		
		
	}

}
