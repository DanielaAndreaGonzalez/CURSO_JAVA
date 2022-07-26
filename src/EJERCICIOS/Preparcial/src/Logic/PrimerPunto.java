package Logic;

import java.util.Scanner;

public class PrimerPunto {

	
	
	
	public static String calcularDatos(double nota1,double nota2, double nota3){
		
		String valoracion ="";
		String mensaje = "";
		
		double sumaTotal = nota1+nota2+nota3;
		double promedio = sumaTotal / 3;
		int cantidadNotasGanadas = 0;
		
		if (nota1 >= 3.0 ){
			cantidadNotasGanadas +=1;
			if (nota2 >= 3.0){
				cantidadNotasGanadas+=1;
			}
			if(nota3 >= 3.0){
				cantidadNotasGanadas+=1;
				}}
		else if(nota2 >=3.0){
			cantidadNotasGanadas +=1;
			if(nota3 >=3.0){
				cantidadNotasGanadas+=1;
			}}
		else if(nota3 >=3.0){
			cantidadNotasGanadas+=1;
			}
		else{
			cantidadNotasGanadas=0;
		}
		if (promedio >= 0 && promedio <3){
			valoracion = "DEFICIENTE";
		}
		else if(promedio >= 3 && promedio <4){
			valoracion = "ACEPTABLE";
			}
		else if (promedio >= 4 && promedio <4.5){
			valoracion = "BUENO";
		}
		else if (promedio >= 4.5 && promedio <5.0){
			valoracion = "EXCELENTE";
		}
		else{
			valoracion = "Datos erroneos";
		}
		mensaje = "Promedio definitiva = "+promedio + " Valoración: "+valoracion +" Cantidad parciales ganados = "+cantidadNotasGanadas;
		
		return mensaje;
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la nota 1: ");
		double nota1 = dato.nextDouble();
		System.out.println("Ingrese la nota 2: ");
		double nota2 = dato.nextDouble();
		System.out.println("Ingrese la nota 3: ");
		double nota3 = dato.nextDouble();
		
		System.out.println(calcularDatos(nota1, nota2, nota3));
		
		
		
	}

}
