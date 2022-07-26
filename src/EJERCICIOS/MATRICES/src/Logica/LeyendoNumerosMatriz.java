package Logica;

import java.util.Scanner;

public class LeyendoNumerosMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de filas ");
		int filas = dato.nextInt();
		System.out.println("Ingrese la cantidad de columnas: ");
		int columnas = dato.nextInt();
		int [][]matriz  = new int[filas][columnas];
		int matrizLlena[][]=leerNumeros(matriz);
		imprimirMatriz(matrizLlena);
		
	}
	
	public static int[][] leerNumeros(int[][] matriz){
		int numero=0;
		Scanner dato=new Scanner(System.in);
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				System.out.println("Ingrese el valor de la posicion: ");	
				matriz[i][j] = dato.nextInt();
			}
		}
		return matriz;
	}
	
	public static void imprimirMatriz(int [][] matriz){
		for(int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[0].length;j++){
				System.out.print("["+i+"]"+"["+j+"]"+matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
