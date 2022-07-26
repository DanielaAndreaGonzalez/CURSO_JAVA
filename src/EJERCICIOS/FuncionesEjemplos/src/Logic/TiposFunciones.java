package Logic;

import java.util.Scanner;

public class TiposFunciones {

		static int a;
		static int b;
	
	//funcion sin argumentos y sin retorno
		
	public static void suma(){
		int res = a+b;
		System.out.println("El resultado de la suma SIN ARGUMENTOS y SIN RETORNOS es: "+res);
	}
		
		
	//Funcion con Argumentos y sin Retornos
	public static void sumaArgumentos(int arg1,int arg2){
		int resultado = arg1+arg2;
		System.out.println("El resultado de la suma con argementos retornos es: "+resultado);
	
	}
	
	public static int sumaArgumentosRetorno(int arg1,int arg2){
		int resultado = arg1+arg2;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = dato.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		b= dato.nextInt();
		
		//funcion para sumar
		suma();
		
		//Suma con argumentos sin retorno
		sumaArgumentosRetorno(a, b);
		
		//Suma con Argumentos
		sumaArgumentos(a, b);
		
		
		
		
		
	}

}
