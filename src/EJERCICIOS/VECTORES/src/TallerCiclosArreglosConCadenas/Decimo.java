package TallerCiclosArreglosConCadenas;

public class Decimo {

	//Realice una función que dado un arreglo de cadenas,mostrar en orden inverso
	//cada uno de los elementos
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(imprimirCadenaInversa());
	}

	public static String imprimirCadenaInversa(){
		
		String cadenaInversa="";
		String arreglo[] = {"clau","juan","kevin","ramo"};
		String caracteres = "";
		
		for(int i=0; i<arreglo.length;i++){	
			cadenaInversa = cadenaInversa +"- "+arreglo[i];
		}
		for (int i=cadenaInversa.length()-1;i>0;i--){
			caracteres = caracteres + cadenaInversa.charAt(i);		
		}
		System.out.println("{"+caracteres+"}");
		return cadenaInversa;
		
	}
	
	
}
