package Logic;	

import java.util.Scanner;

public class Prueba {

	
	public static String evaluarCondicion(int numero){
		String resultado ="";
		
		if(numero%3==0 && numero%5==0){
			resultado = "FizzBuzz";
		}
		else if (numero%3==0){
			resultado = "Fizz";
		}
		else if(numero %5==0){
			resultado = "Buzz";
		}
		else{
			resultado = ""+numero;
		}
		return resultado;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int numero = dato.nextInt();
		System.out.println(evaluarCondicion(numero));
		
		
	}

}
