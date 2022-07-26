package Logic;

import java.util.Scanner;

public class novenoBisiesto {
	
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el año: ");
		int anio = dato.nextInt();
		mirarAnio(anio);

	}
	

	public static void mirarAnio(int anio){
		
		if((anio%4==0) || ( anio % 100 !=0 && anio %400 ==0)){
			System.out.println("El año es bisiesto");
		}else{
			System.out.println("El año no es bisiesto");
		}
		
	}

}
