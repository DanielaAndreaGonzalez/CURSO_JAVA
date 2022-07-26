package Logica;	

import java.util.Scanner;

public class Cuarto {
	//1 dia = 1440 minutos
	//1 hora= 60 minutos
	//1 minuto = 60 segundos
	
	static double minutosCorrespondientes;
	static double minutos;
	static double dias;
	static double horas;
	
	public static double calcularDias(){
		dias = minutos/1440;
		return dias;
	}
	public static double calcularHoras(){ 
		horas= 24 - calcularDias();
		return horas;
	}
	
	public static double calcularMinutos(){
		minutosCorrespondientes = 60 - calcularHoras();
		return minutosCorrespondientes;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que dado el tiempo en minutos,
		//calcular los días, horas y minutos que le corresponden.
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el tiempo en minutos: ");
		minutos = dato.nextInt();
	
		System.out.println("Los días: "+calcularDias()+" días"+"\nHoras "+calcularHoras()+"\n Los minutos son: "+calcularMinutos());
		
		
		
		
		
	}

}
