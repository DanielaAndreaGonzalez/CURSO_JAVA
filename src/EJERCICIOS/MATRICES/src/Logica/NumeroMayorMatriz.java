package Logica;

public class NumeroMayorMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = {{1,4,7},{2,3,5},{6,8,10}};
		int numMayor=retornarNumeroMayor(matriz);
		int numMenor=retornarNumeroMenor(matriz);
		System.out.println("El número mayor es: "+numMayor);
		System.out.println("El número menor es: "+numMenor);
	}
	/**
	 * Función que permite retornar el número mayor de una matriz dada
	 * @param matriz
	 * @return
	 */
	
	public static int retornarNumeroMayor(int[][] matriz){
		int numMayor=0;
		int aux=0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0; j<matriz.length;j++){
				if(matriz[i][j] >numMayor){
					numMayor = matriz[i][j];
				}
			}
		}
		return numMayor;			
	}
	/**
	 * Función que permite retornar el número menor de una matriz
	 * @param matriz
	 * @return
	 */
	public static int retornarNumeroMenor(int[][] matriz){
		int numMenor=9999;
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz.length;j++){
				if(matriz[i][j]<numMenor){
					numMenor = matriz[i][j];			
				}
			}
		}
		return numMenor;
	}

}
