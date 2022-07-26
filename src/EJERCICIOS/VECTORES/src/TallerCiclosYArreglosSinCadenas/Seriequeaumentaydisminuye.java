package TallerCiclosYArreglosSinCadenas;

public class Seriequeaumentaydisminuye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirSerie();
	}
	
	
	public static String imprimirSerie(){
		
		int numeros[]=new int[10];
		int j=5;
		String cadena="";
		for(int i=1;i<numeros.length;i+=2){
			System.out.print(i);
			System.out.print("-"+j+"-");
			j+=1;
			
		}
		System.out.println(cadena);
		return cadena;
	}

}
