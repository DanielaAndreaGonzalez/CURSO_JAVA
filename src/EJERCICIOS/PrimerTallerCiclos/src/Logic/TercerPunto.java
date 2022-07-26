package Logic;

import java.util.Scanner;

public class TercerPunto {

	/*Dado N notas, calcular el promedio de las notas aprobadas y el promedio
	de las notas desaprobadas.
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el número de notas ");
		int numeroNotas = dato.nextInt();
		calcularPromedioNotas(numeroNotas);
		
	}
	
	public static void calcularPromedioNotas(int numeroNotas){
		
		double promedioNotasAprobadas=0;
		double promedioNotasNoAprobadas=0;
		int acumuladoAprobadas=0;
		int acumuladoNoAprobadas=0;
		Scanner dato = new Scanner(System.in);
		double notas=0;
		int contador1=0;
		int contador2=0;
		
		for (int i=0;i<numeroNotas;i++){
			System.out.println("Ingrese la nota "+i);
			notas = dato.nextDouble();
			if ( notas >=3.0){
				acumuladoAprobadas +=notas;
				contador1++;
			}else if(notas < 3.0){
				acumuladoNoAprobadas+=notas;
				contador2++;
			}else{
				System.out.println("Error");
			}
			
		}
		promedioNotasAprobadas = acumuladoAprobadas/contador1;
		promedioNotasNoAprobadas = acumuladoNoAprobadas/contador2;
		
		System.out.println("Promedio notas aprobadas: "+promedioNotasAprobadas);
		System.out.println("Promedio notas desaprobadas: "+promedioNotasNoAprobadas);
		
	}

}
