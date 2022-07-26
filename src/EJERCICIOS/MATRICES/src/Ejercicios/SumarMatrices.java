package Ejercicios;

import java.util.Scanner;

public class SumarMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas = leerNumeros("Ingrese el número de filas: ");
		int columnas = leerNumeros("Ingrese el número de filas: ");
		int matriz1 [][] = new int[filas][columnas];
		int matriz2 [][] = new int[filas][columnas];
		
		imprimirMatriz(llenarMatriz(matriz1));
		System.out.println("Matriz 2: ");
		imprimirMatriz(llenarMatriz(matriz2));
		System.out.println("La suma de las matrices es de: ");
		imprimirMatriz(sumarMatrices(matriz1, matriz2));
	}
	
	public static void imprimirMatriz(int matriz[][]){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] llenarMatriz(int [][] matriz){
		int numero=0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				numero = leerNumeros("Ingrese el número: ");
				matriz[i][j] = numero;
			}
		}
		return matriz;
	}
	
	public static int[][] sumarMatrices(int matriz1[][], int matriz2[][]){
		int matrizRes[][] = new int[matriz1.length][matriz2.length];
		for(int i=0;i<matriz1.length;i++){
			for(int j=0;j<matriz2.length;j++){
				matrizRes[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return matrizRes;
	}
	
	public static int leerNumeros(String mensaje){
		int numero=0;
		Scanner dato= new Scanner(System.in);
		System.out.println(mensaje);
		numero = dato.nextInt();
		return numero;
	}

}
