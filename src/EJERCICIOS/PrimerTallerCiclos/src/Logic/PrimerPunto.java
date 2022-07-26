package Logic;

public class PrimerPunto {

	//Programa que visualiza por pantalla todos
	//los caracteres correspondientes a letras minúsculas.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String rango ="abcdefghijklmnñopqrstuvwxyz";
		
		imprimirLetras(rango);
	}
	
	public static void imprimirLetras(String cadena){
		
		for (int i=0;i<cadena.length(); i++){
			System.out.println(cadena.charAt(i));
		}
		
	}

}
