package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class Punto4 {

	// Realice una función que llene un arreglo con los números que se encuentren dentro de un intervalo 
	// que ingrese por parámetro (int limInferior,int limSuperior)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		
		int inferior= 0;
		int superior=0;
		boolean bandera=true;
		
		while (bandera){
			System.out.println("Ingrese el límite inferior");
			inferior = dato.nextInt();
			System.out.println("Ingrese el límite superior");
			superior = dato.nextInt();
			if(superior<inferior){
				System.out.println("¡Error! el final debe ser mayor al inicio ");
			}else{
				System.out.println(llenarArreglosLimites(inferior, superior));
				bandera=false;
			}
		}
	}
	
	public static String llenarArreglosLimites(int limInferior, int limSuperior){
		String cadena="";
		Scanner dato = new Scanner(System.in);
		int numero=0;
		boolean bandera = true;
		int arreglo[] = new int[5]; 
		for (int i=0; (i<arreglo.length || bandera) ;i++){
			System.out.println("Ingrese el número que este dentro de ["+limInferior+"-"+limSuperior+"]");
			numero = dato.nextInt();
			if(numero<limInferior || numero > limSuperior){
				System.out.println("¡Error debe estar dentro del rango!");
				i=0;
			}else{
				arreglo[i] = numero;
				cadena +=arreglo[i];
				bandera=false;
			}	
		}
	
		return cadena;
	}

}
