package TallerCiclosYArreglosSinCadenas;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirSerie();
	}
	
	
	public static String imprimirSerie(){
		
		String cadena="";
		int res=0;
		
		int tamanio[] = new int[10];
		int j=1;
		int aux=0;
		
		for(int i=0;i<tamanio.length; i++){	
			res=aux+j;
			aux=j;
			j=res;
			//System.out.println(res);	
		}
		int i=0;
		while (i<tamanio.length){
			res=aux+j;
			aux=j;
			j=res;
			i++;
			System.out.println(res);	
		}

		return cadena;
		
	}

}
