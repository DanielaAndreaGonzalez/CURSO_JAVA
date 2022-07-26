package Taller5;

import java.util.Scanner;

public class MultiplicacionEntreMatrices {

	public static void main(String[] args) {
		int matrizI [][] = new int[2][2];
		int matrizII [][] = new int[2][2];
		int matrizLlena1[][] = llenarMatrices(matrizI);
		int matrizLlena2[][] = llenarMatrices(matrizII);
		imprimirMatrices(matrizI);
		System.out.println("Segunda matriz");
		imprimirMatrices(matrizII);
		System.out.println("Multiplicación");
		imprimirMatrices(multiplarMatrices(matrizLlena1, matrizLlena2));
	}
	
	public static int[][] llenarMatrices(int matriz[][]){
		int numero=0;
		Scanner dato=new Scanner(System.in);
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				System.out.println("Ingrese el valor de la posicion: "+(i)+(j));	
				matriz[i][j] = dato.nextInt();
			}
		}
		return matriz;
	}
	
	public static void imprimirMatrices(int matriz [][]){
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0; j<matriz[0].length;j++){
				System.out.print("["+i+"]"+"["+j+"]"+matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] multiplarMatrices(int matrizI[][],int matriz2[][]){
		
		int resultado [][] = new int[matrizI.length][matriz2[0].length];
		
		for(int i=0;i<matrizI.length;i++){
			for(int j=0;j<matriz2.length;j++){
				for(int k=0;k<matrizI[0].length;k++){	
					resultado[i][j] = resultado[i][j] + (matrizI[i][k] * matriz2[k][j]);
				}
			}
		}
		return resultado;
	}

}
