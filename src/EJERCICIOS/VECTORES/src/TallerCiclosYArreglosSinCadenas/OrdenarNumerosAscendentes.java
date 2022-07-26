package TallerCiclosYArreglosSinCadenas;

public class OrdenarNumerosAscendentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ordenarNumeros();
	}
	
	public static void ordenarNumeros(){
		int numeros[] = {5,3,6,1,4,2};
		int ordenados[] =new int[numeros.length];
		int aux =0;
		int numeroMenor=0;
		for(int i=0;i<numeros.length;i++){
			aux=numeros[0];
			numeroMenor = numeros[1];
			
			if(aux>numeroMenor){
				aux=numeroMenor;
				
				ordenados[i] = aux;
			}
		}
		for(int i=0;i<ordenados.length;i++){
			System.out.println(ordenados[i]);
		}
	}
	

}
