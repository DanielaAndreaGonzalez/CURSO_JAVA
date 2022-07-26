package Logica;

public class PromedioMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res=0;
		double [][] matriz = {{1,4,6},{8,4,2},{5,3,7}};
		res=promedioMatriz(matriz);
		System.out.println("El resultado es: "+res);
	}
	
	
	/**
	 * La función permite calcular el promedio de una matriz
	 * @param matriz
	 * @return
	 */
	public static double promedioMatriz(double[][] matriz){
		double acumulador=0;
		
		for(int i=0; i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				acumulador+=matriz[i][j];
			}
		}
	   acumulador/=(matriz.length*matriz.length);
		
		
	  return acumulador;
		
		
	}

}
