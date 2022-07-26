package Logica;

public class SumaNumerosDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numeros = {{1,3,5},{7,9,11},{13,15,17}};
		int sumaDiagonal = sumarNumerosDiagonal(numeros);
		imprimirMatriz(numeros);
		System.out.println(sumaDiagonal);
	}
	
	public static void imprimirMatriz (int [][] numeros){
		
		for (int i=0;i<numeros.length;i++){
			for(int j=0;j<numeros[0].length;j++){
				System.out.print(numeros[i][j]+"\t ");
			}
			System.out.println();
		}
		
	}
	public static int sumarNumerosDiagonal(int[][]matriz){
		int suma=0;
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if (i==j){
					suma+=matriz[i][j];
				}
			}
		}
		//Obtener diagonal secundaria
		for(int i=matriz.length-1;i>=0;i--){
			for(int j=0; j<matriz.length;j++){
				if(matriz.length-1-i == j){
					System.out.println(matriz[i][j] +" ");
				}
			}
		}
		
		return suma;
	}
	
	
	

}
