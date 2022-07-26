package MATRICESPrueba;

import java.util.Iterator;

import MATRICES.Persona;

public class PruebaMatrices {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int edades[][] = new int [3][2];
		System.out.println("Edades = "+edades);
		
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		
		System.out.println("Edades 0-0" +edades[0][0]);
		
		/*
		 * Iterar
		 */
		 for (int ren =0; ren<edades.length; ren++) {
			 for (int col =0; col <edades[ren].length;col++) {
				 System.out.println("Edades "+ren + "- "+col+ ":" +edades[ren][col]); 
			 }
		 }
		
		// String frutas[][] = new String[3][2];
		  String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora"}};
		  
		 imprimir(frutas);
		 
		  Persona personas[][] = new Persona[2][3];
		  personas[0][0] = new Persona("Juan");
		  personas[0][1] = new Persona ("Karla");
		  
		  imprimir(personas);
		
		
	}
	
	public static void imprimir(Object matriz[][] ) {
		
	for(int ren =0; ren<matriz.length;ren++) {
			  for(int col =0; col < matriz[ren].length;col++) {
				  System.out.println("Fruta N°"+ren + "-"+col+":"+ matriz[ren][col]);
			  }
		  }
		 
	}

}
