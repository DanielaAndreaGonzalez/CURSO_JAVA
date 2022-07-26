package Ejercicios;

public class LlenarMatriz3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int[3][3];
		imprimirMatriz(LlenarMatriz(matriz));
	}
	
public static int[][] LlenarMatriz(int [][] matriz){
		
		for(int i=0;i<matriz.length ;i++){
			for(int j =0; j<matriz.length;j++){
				matriz[i][j]=(i*matriz.length)+(j+1);
			}
		}
		return matriz;
	}
	
	public static int [][] imprimirMatriz(int [][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		return matriz;
	}

}
