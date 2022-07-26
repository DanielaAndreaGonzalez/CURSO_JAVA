package Taller5;

import java.util.Scanner;

public class CerosConsecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][3];
		imprimirMatrices(leerNumeros(matriz));
		if (!cerosConsecutivos(matriz)){
			System.out.println("No Hay dos ceros consecutivos");
		}
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
	
public static boolean cerosConsecutivos(int [][] matriz){
		
		boolean verificarCeros=false;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]==0){
					// se comprueba si en la siguiente fila hay ceros
					int siguienteFila= i+1;
					if(siguienteFila < matriz.length && matriz[i][j] ==0){
						System.out.println("Hay dos ceros consecutivos en la fila: Posiciones");
						System.out.printf("[%d %d]",i,j);
						System.out.printf("[%d %d]",siguienteFila,j);
						verificarCeros =true;
					}
				}
				else{
					int siguienteColumna =j+1;
					if(siguienteColumna < matriz[i].length && matriz[i][j] == 0){
						System.out.println("Hay dos ceros consecutivos en la columna: Posiciones");
						System.out.printf("[%d %d]",i,j);
						System.out.printf("[%d %d]",i ,siguienteColumna);
					}
				}
			}
		}
		
		return verificarCeros;
	}
	
	

}
