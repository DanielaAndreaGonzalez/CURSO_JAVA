package Logic;

import java.util.Scanner;

public class Aritmetica {

	
	static int a;
	static int b;
	
	public static void suma(){
		int resultado = a + b;
		System.out.println("El resultado de la suma sin retorno es: "+resultado);	
	}
	
	public static int sumaRetorno(){
		int resultado = a + b;
		return resultado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		a = dato.nextInt();
		System.out.println("Ingrese el segundo número: ");
		b = dato.nextInt();
		suma();
		int sumaRes = sumaRetorno();
		System.out.println("Resultado 2: "+sumaRes);
		
		
		
	}

}
