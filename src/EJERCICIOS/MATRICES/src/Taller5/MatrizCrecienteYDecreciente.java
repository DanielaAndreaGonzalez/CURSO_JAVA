package Taller5;

import java.util.Scanner;

public class MatrizCrecienteYDecreciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int matriz [][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	int matriz[][]= new int[5][5];
	System.out.println();
	imprimirMatrices(recorrerMatriz(matriz));	
		
	}
	
public static void imprimirMatrices(int [][] matriz){
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
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
	
	public static int[][] recorrerMatriz(int [][] matriz){
		 int x=matriz.length*matriz.length;
		 int b = matriz.length -1;
		 int valor=0;
		 int a=0;
		
		 
		for(int i=a; i<matriz.length;i++){
			for(int j=0; j<matriz.length;j++){
				//matriz[j][i] = (i*matriz.length)+(j+1);
				matriz[j][i]=(i*matriz.length)+(j+1);	
			}
			for(int k=matriz[4].length-1; k>=0;k--){
				//matriz[j][i] = (i*matriz.length)+(j+1);
				matriz[k][i]=(i*matriz.length)+(k+1);	
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		return matriz; 
	}

}
