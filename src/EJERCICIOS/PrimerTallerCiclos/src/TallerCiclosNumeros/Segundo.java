package TallerCiclosNumeros;

import java.util.Scanner;

public class Segundo {

	/*
	 * Cree una función que valide si un número está o no dentro de dicho rango.
	En caso de que el número no esté dentro del rango, deberá solicitar su
	ingreso nuevamente al usuario hasta que ingrese un número válido.

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
			System.out.println("Ingrese el número");
			numero = dato.nextInt();
			if(numero >=inicio && numero <= rangoFinal){
				cadena = cadena +"Está dentro del rango";
				i = rangoFinal;
			}else{
				System.out.println("No está dentro del rango");
			}
			
			
		}
		return cadena;
	}
	
			
	

}
