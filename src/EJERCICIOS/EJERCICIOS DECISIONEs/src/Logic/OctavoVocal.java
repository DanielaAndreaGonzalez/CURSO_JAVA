package Logic;

import java.util.Scanner;

public class OctavoVocal {

	
	
	
	public static void validar(String letra){
		
		if (letra.length()==1){
		
			if (letra.equals("a")|| letra.equals("e")|| letra.equals("i")|| letra.equals("o") || letra.equals("u")){
			System.out.println("Es vocal");
			}
			else {
			System.out.println("No es vocal");
			}
		}else{
			System.out.println("Error , solo una letra");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese una letra: ");
		String letra = dato.next();
		
		validar(letra.toLowerCase());
		
		
	}

}
