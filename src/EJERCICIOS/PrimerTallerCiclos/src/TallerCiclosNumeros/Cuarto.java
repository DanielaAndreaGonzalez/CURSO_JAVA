package TallerCiclosNumeros;

import java.util.Scanner;

public class Cuarto {

	/*
	 * Escriba una funci�n que reciba una cantidad de n�meros enteros y retorne
	una cadena, con los n�meros m�ltiplos de 3 que fueron ingresados.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de n�meros enteros");
		int cantidad = dato.nextInt();
		System.out.println("Cadena con los n�meros m�ltiplos de 3: "+imprimirMultiplos(cantidad));
		
	}
	
	public static String imprimirMultiplos(int cantidadNumeros){
		String multiplosTres=""; 
		
		for (int i=1; i <=cantidadNumeros; i++){
			if (i%3==0){
				multiplosTres=multiplosTres+i;
			}
		}		
		return multiplosTres;
	}

}
