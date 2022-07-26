package Taller5;

import java.util.Scanner;

public class LlenarMatrizCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato=new Scanner(System.in);
		int numero=0;
		
		boolean siga=false;
		do{
			System.out.println("Ingrese el número de filas");
			numero = dato.nextInt();
			if(numero%2==1){
				siga=true;
			}else{
				System.out.println("Error! debe ingresar un número impar");
			}
			System.out.println();
			
		}while(!siga);
		char matriz[][] = new char[numero][numero];
		//llenarMatriz(matriz);
		System.out.println();
		
		//llenarMatriz2(matriz);
		System.out.println();
		llenarMatriz3(matriz);
		
	}
	public static void imprimirMatrices(char [][] matriz){
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	/**
	 * Función que muestra una pirámide 
	 * @param matriz
	 * @return
	 */
	public static char[][] llenarMatriz(char [][] matriz){
			
		 int mitad = matriz[0].length/2;
		 
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[i].length;j++){
					if ((i+j)>=mitad && (j-i) <= mitad){
						matriz[i][j] = '1';
						
					}else{
						matriz[i][j] = ' ';
					}
					System.out.print(matriz[i][j] +" ");
				}
				System.out.println();
				
		 }
		
		return matriz;
	}
	public static char[][] llenarMatriz2(char [][] matriz){
		
		 double mitad = matriz[0].length/2;
		 
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[0].length;j++){
					if ((i+j)>=matriz.length){
						matriz[i][j] = '1';
						
					}else
					{
						matriz[j][i] = ' ';
					}
					
					System.out.print(matriz[i][j] +" ");
				}
				System.out.println();
				
		 }
		
		return matriz;
	}
	public static char[][] llenarMatriz3(char [][] matriz){
		
		 
		 
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[0].length;j++){
					if(i>0){
						if(i==j){
							matriz[i][j]='*';
							
						}
						if(j>i){
							matriz[i][j]='*';
						}
					}else{
						matriz[i][j]='*';
					}
					System.out.print(matriz[i][j] +" ");
				}
				System.out.println();
				
		 }
		
		return matriz;
	}
	
	public static char[][] llenarMatriz4(char [][] matriz){
		
		 
		 
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				if(i>0){
					if(i==j){
						matriz[i][j]='*';
						
					}
					if(j>i){
						matriz[i][j]='*';
					}
				}else{
					matriz[i][j]='*';
				}
				System.out.print(matriz[i][j] +" ");
			}
			System.out.println();
			
	 }
	
	return matriz;
}

	public static char[][] llenarMatriz5(char [][] matriz){
		
		 
		 
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				
				System.out.print(matriz[i][j] +" ");
			}
			System.out.println();
			
	 }
	
	return matriz;
}
	
	
	
	
}
