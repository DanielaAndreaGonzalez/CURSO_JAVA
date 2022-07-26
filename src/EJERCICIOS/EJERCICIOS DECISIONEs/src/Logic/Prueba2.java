package Logic;

import java.util.Scanner;

public class Prueba2 {

	
	
	public static void determinarCursos(int anio,int semestre){
		
		switch(anio){
		case 1:
			System.out.println("Inglés y cálculo");
			break;
		case 2:
			switch(semestre){
			case 1:
				System.out.println("Maching learning y big data");
				break;
			case 2:
				System.out.println("Programación");
				break;
			case 3:
				System.out.println("Ingeniería de software");
				break;
			default:
				System.out.println("Error solo 3");
				break;
			}
		
				
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el año, 1 o 2");
		int anio = dato.nextInt();
		System.out.println("Ingrese el semestre, 1, 2 o 3");
		int semestre=dato.nextInt();
		determinarCursos(anio, semestre);
		
	}

}
