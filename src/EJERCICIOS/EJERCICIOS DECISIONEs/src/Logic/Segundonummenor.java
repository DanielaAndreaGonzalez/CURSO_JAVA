package Logic;

import java.util.Scanner;

public class Segundonummenor {

	/**
	 * ealizar un programa que solicite al usuario ingresar dos n�meros y mostrar
cu�l de los dos es menor. No considerar el caso en que ambos n�meros son
iguales.
	 * @param numero1
	 * @param numero2
	 * @return
	 */
	
	public static int mostrarNumero(int numero1,int numero2){
		int menor=0;
		if (numero1 > numero2){
			menor = numero2;
		}else if(numero2>numero1){
			menor = numero1;
		}else{
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
		System.out.println("N�mero menor: "+mostrarNumero(numero1, numero2));
	}

}