package TallerCiclosYArreglosSinCadenas;

public class Punto1 {

	//Realice una funci�n que llene un arreglo en donde el valor de cada posici�n 
	//del arreglo, sea el cuadrado de su posici�n 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
	llenarArreglo();
		
		
	}
	
	
	public static void llenarArreglo(){
		
		double arreglo[] = new double[10];
		
		for(int i=0; i<arreglo.length;i++){
			
			arreglo[i] = Math.pow(i, 2);
			
			System.out.println(arreglo[i]);
		}
		
		
		
		
	}
	
	

}
