package Logica;

public class MatrizInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = {{1,2,3},{4,6,7},{3,5,8},{7,9,10}};
		System.out.println("Matríz n*m");
		imprimirMatriz(matriz);
		System.out.println("Matriz m*n: ");
		OrdeninversoMatriz(matriz);
	}
	
	public static void imprimirMatriz(int[][] matriz){
		for(int i=0;i<matriz.length;i++){	
			for(int j=0;j<matriz[0].length;j++){
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public static void OrdeninversoMatriz(int[][] matriz){
	
		for(int i=0;i<matriz.length-1;i++){	
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[j][i] +"  ");
			}
			System.out.println();
		}
		
	}
	
	
	

}
