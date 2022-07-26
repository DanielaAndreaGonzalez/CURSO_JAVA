package Taller5;

import java.util.Scanner;

public class ElementosEncimapotenciaDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] matriz = new double[4][4];
		imprimirMatrices(leerNumeros(matriz));
		HacerCeros(HacerDiagonal(matriz));
		determinarPotenciaDosMatrices(HacerDiagonal(matriz));
	}
	
	public static double[][] leerNumeros(double [][] matriz){
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
	public static void imprimirMatrices(double [][] matriz){
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+" \t");
			}
			System.out.println();
		}
	}
	public static double[][] HacerDiagonal(double [][] matriz){		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(i==j){
					matriz[i][j] =1;
				}
			}
		}
		return matriz;
	}
	public static double[][] HacerCeros(double [][] matriz){
		
		int k=matriz.length-1;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				
				while (matriz[i][k]>1){
					matriz[k][j]=0;
					k--;
				}
				
			}
			
		}	
		
		System.out.println();
		imprimirMatrices(matriz);
		return matriz;
	}
	
	public static double[][] determinarPotenciaDosMatrices(double [][] matriz){
		double potencia=0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(matriz[i][j] !=1 && matriz[i][j] != 0){
					matriz[i][j] = Math.pow(2, potencia);
					potencia++;		
				}
			}
			
		}
		System.out.println();
		imprimirMatrices(matriz);
		
		return matriz;
	}
	

}
