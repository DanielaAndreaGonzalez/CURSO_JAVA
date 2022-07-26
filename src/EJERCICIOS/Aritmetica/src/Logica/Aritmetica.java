package Logica;

import java.util.Scanner;

public class Aritmetica {
	
	static int a, b;
	
	/*
	 * Funcion sin argumentos y SIN retorno
	 */
	public static void suma(){
		int res = a + b;
		System.out.println("El resultado de la suma sin retorno es: "+res);
	}
	
	/*
	 * Funcion sin argumentos y CON retorno
	 */
	public static int sumaConRetorno(){
		int resultado = a + b;
		System.out.println("El resultado de la suma CON retorno es: "+resultado);
		return resultado;
	}
	
	/*
	 * Funcion CON argumentos y CON retorno
	 */
	public static int sumaConArgumentos(int arg1, int arg2){
		//int resultado = arg1 + arg2;
		//System.out.println("El resultado de la suma CON ARGUMENTOS retorno es: "+resultado);
		return sumaConRetorno();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el primer valor en forma");
		a = dato.nextInt();
		System.out.println("Ingrese el segundo valor en forma");
		b = dato.nextInt();
		
		//funcion para sumar
		suma();
		
		//int sumaRes = sumaConRetorno();
		//System.out.println("Resultado: "+sumaRes);
		sumaConRetorno();
		
		//sumaConArgumentos
		sumaConArgumentos(a,b);
		
	}

}
