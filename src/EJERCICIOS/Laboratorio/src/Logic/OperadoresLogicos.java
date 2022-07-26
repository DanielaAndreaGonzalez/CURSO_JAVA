package Logic;

import java.util.Scanner;

public class OperadoresLogicos {
	static int EDAD =18; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 2;
		
		//operador de igualdad (==)
		boolean c = (a == b);
		System.out.println("Los operadores son iguales: "+c);
		
		//Operador de diferencia (!=)
		boolean d = (a != b);
		System.out.println("Los operadores son diferentes:  "+d);
		
		String mensaje1 = "Hola"; //6bits
		String mensaje2 = "Chao"; //3bits
		boolean cadena = mensaje1 == mensaje2;
		System.out.println("Cadena es igual: "+cadena);
		
		//Forma correcta para comparar cadenas
		cadena = mensaje1.equals(mensaje2);
		System.out.println("Cadena es igual: "+cadena);
		
		if (a %2 == 0){
			System.out.println("El número es par");
		}else{
			System.out.println("El número es impar");
		}
		
		//Ejercicio : realizar un algoritmo que determine qué persona es mayor de edad
		
		Scanner dato = new Scanner(System.in);
		 
		System.out.println("Ingrese la edad de la persona: ");
		EDAD = dato.nextInt();
		String mensaje="";
		if (EDAD >=18){
			mensaje = "Es mayor de edad";
		}else{
			mensaje ="no es mayor de edad";
		}
		System.out.println(mensaje);
		
		
		
	}

}
