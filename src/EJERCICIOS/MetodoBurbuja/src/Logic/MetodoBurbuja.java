package Logic;

import java.util.Scanner;



public class MetodoBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arreglo2[] = {5,10,8,3,7};
		int arreglo[]=llenarArreglo(5);
		System.out.println("Resultado: ");
		ordenamientoMetodoBurbuja(arreglo);
		System.out.println("De forma descendente: ");
		ordenamientoMetodoBurbuja2(arreglo);
		
		
	}
	public static int[] llenarArreglo(int cantidad){
		int arreglo[] = new int[cantidad];
		int numero=0;
		for(int i=0;i<arreglo.length;i++){
			Scanner dato= new Scanner(System.in);
			System.out.println("Ingrese el número: ");
			numero = dato.nextInt();
			arreglo[i] = numero;
		}
		
		return arreglo;
	}
	/**
	 * Función que ordena los elementos de un arreglo, de forma ascendente
	 * @param arreglo ingresa por parámetro el arreglo con los elementos en distinto orden 
	 * @return retorna el arreglo ordenado 
	 */
	public static int[] ordenamientoMetodoBurbuja(int [] arreglo){
		int auxiliar =0;
		/// Creo el primer apuntador, que se parará en la posición i
		for(int i=0; i<arreglo.length-1;i++){
			///Creo el segundo apuntador que se parará en la posición que quede i
			for(int j=i;j<arreglo.length;j++){
				/***Hago la condición si lo que se tiene en la posición i es mayor a lo que se 
				tiene en la posición j ***/
				if(arreglo[i] > arreglo[j]){
					// En la variable auxiliar voy a almacenar lo que tiene la posición i
					auxiliar = arreglo[i];
					// En la posición i, hago un intercambio por lo que tiene la posición j
					arreglo[i] = arreglo[j];
					// En la posición j almaceno lo que se tiene en la variable auxiliar
					arreglo[j] = auxiliar;
				}	
			}
		}
		imprimirElementos(arreglo);
		return arreglo;
	}
	/**
	 * Función que ordena los elementos de un arreglo de forma descendente
	 * @param arreglo
	 * @return el arreglo ordenador
	 */
	public static int[] ordenamientoMetodoBurbuja2(int [] arreglo){
		int auxiliar =0;
		/// Creo el primer apuntador, que se parará en la posición i
		for(int i=0; i<arreglo.length-1;i++){
			///Creo el segundo apuntador que se parará en la posición que quede i
			for(int j=i;j<arreglo.length;j++){
				/***Hago la condición si lo que se tiene en la posición i es menor a lo que se 
				tiene en la posición j ***/
				if(arreglo[i] < arreglo[j]){
					// En la variable auxiliar voy a almacenar lo que tiene la posición i
					auxiliar = arreglo[i];
					// En la posición i, hago un intercambio por lo que tiene la posición j
					arreglo[i] = arreglo[j];
					// En la posición j almaceno lo que se tiene en la variable auxiliar
					arreglo[j] = auxiliar;
				}
				
			}
		}
		imprimirElementos(arreglo);
		return arreglo;
	}
	/**
	 * Función que imprime lo elementos de un arreglo
	 * @param arreglo
	 */
	public static void imprimirElementos(int [] arreglo){
		for(int i=0;i<arreglo.length;i++){
			System.out.print( "["+arreglo[i]+"]" );
		}
		System.out.println();
	}
	
}
