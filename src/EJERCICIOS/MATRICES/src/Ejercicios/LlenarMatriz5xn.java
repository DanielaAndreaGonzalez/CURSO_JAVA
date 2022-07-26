package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class LlenarMatriz5xn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese las columnas: ");
		int n =dato.nextInt();
		//int matriz[][] = new int[5][n];
		//imprimirMatriz(llenarMatriz(n));
		llenarMatriz(n);
	}
	public static int[][] llenarMatriz(int columna){
		int matriz[][] = new int[5][10];
		Random randon = new Random();
		
		for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
            	matriz[i][j] = generaNumAleatorio(0, 9);
			}
		}
		imprimirMatriz(matriz);
		
		return matriz;
	}
	
	public static void imprimirMatriz(int [][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int generaNumAleatorio(int minimo,int maximo){
        
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
         
    }

}
