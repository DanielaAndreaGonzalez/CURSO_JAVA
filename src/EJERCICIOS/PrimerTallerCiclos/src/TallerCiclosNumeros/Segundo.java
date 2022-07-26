package TallerCiclosNumeros;

import java.util.Scanner;

public class Segundo {

	/*
	 * Cree una funci�n que valide si un n�mero est� o no dentro de dicho rango.
	En caso de que el n�mero no est� dentro del rango, deber� solicitar su
	ingreso nuevamente al usuario hasta que ingrese un n�mero v�lido.

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inicio=0;
		int rangoFinal = 0;
		boolean bandera=true;
		
		while(bandera){
			Scanner dato= new Scanner(System.in);
			System.out.println("Ingrese el inicio del rango: ");
			 inicio = dato.nextInt();
			System.out.println("Ingrese el final del rango");
			 rangoFinal = dato.nextInt();
			if (rangoFinal<inicio ){
				System.out.println("Error! el final debe ser mayor al inicio");
	
			}else{
				System.out.println(validarNumero(inicio,rangoFinal));
				bandera=false;
			}		
		}	
	}
	public static String validarNumero(int inicio,int rangoFinal){
		int numero=0;
		String cadena="";
		
		for (int i=inicio; i<=rangoFinal;i++){
			Scanner dato= new Scanner(System.in);
			System.out.println("Ingrese el n�mero");
			numero = dato.nextInt();
			if(numero >=inicio && numero <= rangoFinal){
				cadena = cadena +"Est� dentro del rango";
				i = rangoFinal;
			}else{
				System.out.println("No est� dentro del rango");
			}
			
			
		}
		return cadena;
	}
	
			
	

}
