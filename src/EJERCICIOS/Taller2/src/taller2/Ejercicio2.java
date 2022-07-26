package taller2;

import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * Funci�n que verifica si el n�mero que se ingresa por el par�metro es
	 * m�ltiplo de 10
	 * @param numero
	 * @return true si es m�ltiplo y false si no es m�ltiplo
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
 //Realizar un programa que lea un n�mero entero y muestre si el n�mero es
		//m�ltiplo de 10
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese un n�mero: ");
		int numero = dato.nextInt();
		if (calcularMultiplo(numero)){
			System.out.println("El n�mero ingresado es m�ltiplo de 10");
		}else{
			System.out.println("El n�mero no es m�ltiplo de 10 ");
		}
		
		
	}

}
