package Taller5;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizSimetrica {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
		
		imprimirMatrices(leerNumeros(matriz));
		if(esSimetrica(matriz)){
			System.out.println("La matriz es simétrica");
		}else{
			System.out.println("La matriz no es simétrica");
		}
		
		
	}
	public static void imprimirMatrices(int [][] matriz){
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
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
	
	public static boolean esSimetrica(int [][] matriz){
		boolean esSimetrica=false;
		
		int matrizSimetrica [][]  = new int[matriz.length][matriz[0].length];
		if( matriz.length == matriz[0].length){
			
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[0].length;j++){
					matrizSimetrica[i][j] = matriz[j][i];
				}
			}
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[0].length;j++){
					if(Arrays.deepEquals(matriz,matrizSimetrica)){		
						   esSimetrica = true;
						}else{
							esSimetrica=false;
						}
				}
			}
			
			System.out.println();
			imprimirMatrices(matrizSimetrica);
			System.out.println();
			
		}	
		else{
			System.out.println("Error no se puede calcular");
		}
		return esSimetrica;
	}
	
	
}
