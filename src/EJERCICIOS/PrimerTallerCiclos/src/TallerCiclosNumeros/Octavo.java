package TallerCiclosNumeros;

import java.util.Scanner;

public class Octavo {

	/*
	 *  Cree una funci�n que dado un n�mero N permita calcular la suma de los
	n�meros primos entre 0 y N, no olvide realizar el llamado a la funci�n anterior
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el n�mero");
		int n = dato.nextInt();
		System.out.println("La suma de los n�meros primos de 0 a "+n+" es : "+calcularSuma(n));
			
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
