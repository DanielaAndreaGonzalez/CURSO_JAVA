package Logica;

import java.util.Scanner;

public class MenuConAreas {

	
	static double PI = 3.141592654;
	
	public static double calcularAreaCirculo(int radio){
		double areaCirculo = PI * Math.pow(radio, 2);
		return areaCirculo;
	}
	
	public static double calcularAreaTriangulo(int base, int altura){
		int areaTriangulo = base * altura /2;		
		return areaTriangulo;
	}
	
	public static double calcularAreaCuadrado(int lado){	 
		double areaCuadrado = Math.pow(lado, 2);
		return areaCuadrado;
	}
	
	public static void calcularAreas(int opcion){
		if (opcion == 1){
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese el radio: ");
			int radio = dato.nextInt();
			double resultado = calcularAreaCirculo(radio);
			System.out.println("El área del circulo es: "+resultado+"(m2)");
		}
		else if( opcion ==2){
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese la base: ");
			int base = dato.nextInt();
			System.out.println("Ingrese la altura: ");
			int altura = dato.nextInt();
			double areaTriangulo = calcularAreaTriangulo(base, altura);
			System.out.println("El área del triángulo es: "+areaTriangulo+"(m2)");	
		}
		else if ( opcion == 3){
			Scanner dato = new Scanner (System.in);
			System.out.println("Ingrese el lado del cuadrado: ");
			int lado = dato.nextInt();
			double areaCuadrado = calcularAreaCuadrado(lado);
			System.out.println("El área del cuadrado es: "+areaCuadrado+"(m2)");
		}
		else{
			System.out.println("¡Gracias!");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner dato = new Scanner (System.in);
		System.out.println("¿Qué área desea calcular? ");
		System.out.println("1.Circulo"+ "\n2. Triángulo"+"\n3.Cuadrado"+"\n4.Ninguna");
		int opcion = dato.nextInt();
		calcularAreas(opcion);	
	}
}
