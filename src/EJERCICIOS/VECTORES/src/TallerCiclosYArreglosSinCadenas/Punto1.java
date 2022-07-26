package TallerCiclosYArreglosSinCadenas;

public class Punto1 {

	//Realice una función que llene un arreglo en donde el valor de cada posición 
	//del arreglo, sea el cuadrado de su posición 
	
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
