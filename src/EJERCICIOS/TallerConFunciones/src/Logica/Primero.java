package Logica;

import java.util.Scanner;

public class Primero {

		static double salario;
		static double incremento = 0.10;
		static double nuevoSalario;
	
		public static double incrementarSalario(){
			
		double	salarioIncremento = salario * incremento;	
		return salarioIncremento;
		}
		
		public static double calcularSalario(){
		nuevoSalario = salario + incrementarSalario();
		return nuevoSalario;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que permita incrementar el salario de un empleado en un 10%	    
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese el salario del empleado");
			salario = dato.nextDouble();	
			incrementarSalario();
			double total = calcularSalario();
			System.out.println("El nuevo salario del empleado es: "+total);
		
		
	}

}
