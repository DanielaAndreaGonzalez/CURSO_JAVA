package Logica;

import java.util.Scanner;

public class Tercero {

	
	static double segundos;
	static double llegarMinuto;
	static double restarSegundos;
	
	public static double calcularMinutos(){
		
		llegarMinuto = segundos / 60;
		return llegarMinuto;
	}
	
public static double calcularSegundosRestantes(){
		
		restarSegundos = 60 -llegarMinuto;
		return restarSegundos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que dado el tiempo en segundos e ingresado por teclado, 
		//calcular los segundos restantes para convertirse exactamente en minutos.
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese los segundos: ");
		segundos = dato.nextDouble();
		calcularMinutos();
		calcularSegundosRestantes();
		System.out.println(segundos+" equivale a : "+calcularMinutos()+ " Minutos y "+calcularSegundosRestantes()+" Segundos");
		

	}

}
