package TallerCiclosConNumeros2;

import java.util.Scanner;

public class Sexto {

	/*
	 * 	Programe un método que reciba como parámetros una cadena y un número,
		valide que el número ingresado es menor al del tamaño de la cadena, retorne
		la cadena desde el número ingresado hasta el final
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la cadena");
		String cadena = dato.nextLine();
		System.out.println("Ingrese un número");
		int numero = dato.nextInt();	
		System.out.println(validarCadena(cadena, numero));
	}
	
	public static String validarCadena(String cadena,int numero){
		String cadenaResto="";
		
		for (int i=0; i<cadena.length();i++){
			
			if (numero<cadena.length()){
				if(i >= numero){
					cadenaResto = cadenaResto +cadena.charAt(i);	
				}
				
			}
				
		}
		return cadenaResto;
	}

}
