package TallerCiclosNumeros;

import java.util.Scanner;

public class Tercero {

	/*
	 *  Sume los números pares dentro de un rango numérico [a, b].

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bandera= true;
		int inicio=0;
		int finalRango=0;
		int suma=0;
		while(bandera){
			Scanner dato= new Scanner(System.in);
			System.out.println("Ingrese el inicio del rango: ");
			 inicio = dato.nextInt();
			System.out.println("Ingrese el final del rango");
			 finalRango = dato.nextInt();
			if (finalRango<inicio ){
				System.out.println("Error! el final debe ser mayor al inicio");
	
			}else{
				suma=sumarNumero(inicio, finalRango);
				bandera=false;
			}
				
		}
		suma=sumarNumero(inicio, finalRango);
		System.out.println(imprimir(suma));
		
		
		
		
	}
	
	/**
	 * Función que suma los números pares dado un rango que da el usuario
	 * @param inicio
	 * @param finalRango
	 * @return
	 */
	
	
	public static int sumarNumero(int inicio,int finalRango){
		int acumulado=0;
		for(int indice=inicio; indice <=finalRango; indice++){
			 if(indice %2==0){
				 acumulado +=indice;
			 }
			
		}
		return acumulado;
		
	}
	
	public static String imprimir(int suma){
		String cadena="";
		
		cadena=cadena+"La suma de los números pares del rango es: "+suma;
		
		
		return cadena;
		
	}

}
