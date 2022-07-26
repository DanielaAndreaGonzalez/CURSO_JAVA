package TallerCiclosNumeros;

import java.util.Scanner;

public class Octavo {

	/*
	 *  Cree una función que dado un número N permita calcular la suma de los
	números primos entre 0 y N, no olvide realizar el llamado a la función anterior
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el número");
		int n = dato.nextInt();
		System.out.println("La suma de los números primos de 0 a "+n+" es : "+calcularSuma(n));
			
	}
	public static int calcularSuma(int n){
		
		int suma=0;
		for (int i=0; i<=n;i++){
			
			if(determinarNumeroPrimo(i)==true){
				suma+=i;
			}	
		}
		return suma;
	}
	public static boolean determinarNumeroPrimo(int numero){
		boolean esPrimo = false;
		int contador=0;
		
		for (int i=1; i<=numero;i++){
			
			if (numero%i==0){
				contador +=1;
			}	
		}
		if (contador==2){
			esPrimo=true;
		}
		return esPrimo;	
	}

}
