package Logica;

import java.util.Scanner;

public class Ejercicio1 {

	
	
	
	public static void main(String[] args) {

		
		// TODO Auto-generated method stu
		System.out.println(sacarNumerosMenores());
	/*	
	System.out.println(mostrarProductos());	
	System.out.println(imprimirDatos());
	System.out.println("El promedio de los tres cursos es: "+mostrarPromedio());
	System.out.println(mostrarNumerosPares());
	System.out.println(imprimirCaracteres());
	
	*/
	}
	/**
	 * Primer ejercicio
	 * @return
	 */
	public static String mostrarProductos(){
		
		String cadena="";
		String producto[] = {"Arroz","Papa","Yuca","Plátano"};
		double precio [] ={2300,500,350,700};
		
		for(int i=0; i<producto.length;i++){
			cadena +=producto[i]+" Y su precio es "+precio[i];
		
		}
		
		return cadena;
	}
	
	
	/**
	 * Mostrar datos usuario
	 * @return
	 */
	public static String imprimirDatos(){	
		String cadena="";
			String datos[] = {"Carlos","Maria","Juano"};
			int edad[] = {44,33,15};
			String sexo [] ={"Masculino","Femenino,","Masculino"};
			
			for (int i=0;i<datos.length;i++){
				
				cadena+= "Nombre: "+datos[i]+" Edad: "+edad[i]+" Sexo: "+sexo[i];
			}
		return cadena;
	}
	
	
	/**
	 * Mostrar promedio
	 * @return
	 */
	public static double mostrarPromedio(){
		
		double curso1[]={3.0,4.5,5.0};
		double curso2[]={2.5,3.5,5.0};
		double curso3[]={5.0,5.5,4.0};
		
		double promedio=0;
		double suma=0;
		for(int i=0; i<curso1.length;i++){
			
			suma+=curso1[i]+curso2[i]+curso3[i];
		}
		promedio=suma/curso1.length;
		return promedio;
	}

	/**
	 * Ejercicio cinco
	 * @return
	 */
	public static String mostrarNumerosPares(){
		String cadena="";
		
		int numeros[] = new int[10];
		
		for(int i=0; i<numeros.length;i++){
			
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese número: ");
			numeros[i] = dato.nextInt();
			
			if(numeros[i] %2==0){
				cadena = cadena + "Pares - "+numeros[i];
			}
		}
		return cadena;
	}
	/**
	 * Imprimir caracteres de palabra y la suma de estas
	 * @return
	 */
	public static String imprimirCaracteres(){
		String cadena="";
		int sumaCaracteres =0;
		
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra = dato.nextLine();
		int tamano = palabra.length();
		char arreglo[] = new char[tamano];
		
		for(int i=0;i <tamano;i++){
			arreglo[i] = palabra.charAt(i);
			System.out.println(arreglo[i]);
			sumaCaracteres = sumaCaracteres + 1;

		}
		cadena = cadena + "La suma de los caracteres es = "+sumaCaracteres;
	
		return cadena;
		
	}
	
	
	public static String sacarNumerosMenores(){
		
		String cadena="";
		int arreglo[] = new int[10];
		int auxMenor=9999;
		int auxMayor=0;
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el número");
		
		
		for (int i=0; i<arreglo.length;i++){
			int numero = dato.nextInt();
			arreglo[i] = numero;
			
			if (arreglo[i] <auxMenor){
				auxMenor=arreglo[i];
			}
			// 5-6-7
			if(arreglo[i]>auxMayor){
				auxMayor = arreglo[i];
			}
			cadena = cadena + arreglo[i]+"-";
		}
		
		cadena = cadena + " número menor es: " +auxMenor+" Y número mayor es: "+auxMayor;
		
		return cadena;
	}
	
	
	
}
