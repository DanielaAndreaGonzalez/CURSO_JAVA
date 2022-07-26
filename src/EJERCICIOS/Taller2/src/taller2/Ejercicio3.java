package taller2;

import java.util.Scanner;

public class Ejercicio3 {

	/**
	 * Funci�n que determina qu� n�mero es mayor entre tres n�meros
	 * @param numero1
	 * @param numero2
	 * @param numero3
	 * @return el resultado del n�mero mayor
	 */
	
	public static int calcularMayor(int numero1,int numero2,int numero3){
		 int resultado =0;
		if (numero1 > numero2 && numero1 >numero3){
			 resultado = numero1;
		}else if (numero2 > numero1 && numero2 > numero3){
			resultado = numero2;
		}else{
			resultado = numero3;
		}
		return resultado;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un programa que calcule el mayor de tres n�meros enteros.
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el n�mero 1: ");
		int numero1 = dato.nextInt();
		System.out.println("Ingrese el n�mero 2: ");
		int numero2 = dato.nextInt();
		System.out.println("Ingrese el n�mero 3: ");
		int numero3 = dato.nextInt();
		 
		int resultado = calcularMayor(numero1, numero2, numero3);
		System.out.println("El n�mero mayor entre "+numero1+" - "+numero2+" y "+numero3+" es: "+resultado);
		
		
	}

}
