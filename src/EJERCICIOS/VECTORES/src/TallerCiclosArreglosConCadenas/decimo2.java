package TallerCiclosArreglosConCadenas;

public class decimo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirCadenaInversa();
	}
	
public static String imprimirCadenaInversa(){
		
		String cadenaInversa="";
		String cadenaInversa2="";
		String arreglo[] = {"clau","juan","kevin","ramo"};
		String caracteres[] = new String[arreglo.length];
		
		for(int i=arreglo.length-1;i>=0;i--){
			
			cadenaInversa = arreglo[i];
			                
			for (int j=cadenaInversa.length()-1; j>=0; j--){		
				cadenaInversa2 = cadenaInversa2 +cadenaInversa.charAt(j);	
			}
			caracteres[i] = cadenaInversa2 ;
			cadenaInversa2 = ""; 
			System.out.println(caracteres[i]);
			
		}
		return "";
	}
	

}
