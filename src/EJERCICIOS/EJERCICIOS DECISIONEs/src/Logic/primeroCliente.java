package Logic;

import java.util.Scanner;



public class primeroCliente {

	
	/**
	 *  Realizar un programa que solicite al usuario un n�mero de cliente. Si el
n�mero es el 1000, imprimir "Ganaste un premio".
	 * @param numero
	 */
	
	public static void imprimirMensaje(double numero){
		if  (numero == 1000){
			System.out.println("Ganaste un premio");
		}else{
			System.out.println("No ganaste un premio");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese el n�mero de cliente ");
			double numero = dato.nextDouble();
			imprimirMensaje(numero);
			
	}

}
