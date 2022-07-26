package TallerCiclosYArreglosSinCadenas;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llenarArreglo();
	}
	
	

	public static void llenarArreglo(){
		
		int arreglo[] = new int[20];
		
		for(int i=0; i<arreglo.length;i++){
			
			arreglo[i] = i+5;
			
			System.out.println(arreglo[i]);
		}
	}
}
