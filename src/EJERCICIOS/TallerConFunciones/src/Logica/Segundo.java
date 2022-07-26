package Logica;

import java.util.Scanner;

public class Segundo {
	
	static int horas;
	static double valorHora;
	static double valorTotal;
	
	public static double calcularValorhoras(){
		
		double valorTotal = horas*valorHora;
		return valorTotal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que dado las horas trabajadas de una persona y el valor por hora. Calcular su salario.
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese las horas laboradas: ");
		horas = dato.nextInt();
		System.out.println("Ingrese el valor por cada hora: ");
		valorHora = dato.nextDouble();
		
		System.out.println("El total por "+horas+" horas laboradas es de: "+calcularValorhoras());
		
		
		
		
		
	}

}

