package Logic;

import java.util.Scanner;

public class terceroNumMenorv2 {

	/**
	 * Realizar un programa que solicite al usuario ingresar dos n�meros y mostrar
cu�l de los dos es menor. Considerar el caso en que ambos n�meros son
iguales.

	 * @param args
	 */
	public static int mostrarNumero(int numero1,int numero2){
		int menor=0;
		if (numero1 > numero2){
			menor = numero2;
		}else if(numero2>numero1){
			menor = numero1;
		}		
		else{
			menor=0;
		}
		return menor;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el n�mero 1: ");
		int numero1 = dato.nextInt();
		System.out.println("Ingrese el n�mero 2: ");
		int numero2 = dato.nextInt();
		if (numero1==numero2){
			System.out.println("Son iguales");
		}else{
		System.out.println("N�mero menor: "+mostrarNumero(numero1, numero2));
	}}

}
