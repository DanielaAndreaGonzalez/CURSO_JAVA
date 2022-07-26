package taller2;

import java.util.Scanner;

public class Ejercicio5 {

	
	
	
	public static void cambiarValores(String valor1,String valor2){
		
		String nuevoValor2 = valor1;
		String nuevoValor1 = valor2;
		
		System.out.println("El nuevo valor del primer valor es:  "+nuevoValor1);
		System.out.println("El nuevo valor del segundo valor es: "+nuevoValor2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un programa para intercambiar el valor de dos variables. Los valores
		//iniciales se leen por teclado.
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese El primer valor: ");
		String valor1 = dato.nextLine();
		System.out.println("Ingrese el segundo valor: ");
		String valor2 = dato.nextLine();
		System.out.println("Valor 1: "+valor1+"\nValor 2: " +valor2);
		cambiarValores(valor1, valor2);
	}

}
