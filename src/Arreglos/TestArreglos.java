package Arreglos;

import java.util.Arrays;
import java.util.Iterator;

public class TestArreglos {

	public static void main(String [] args) {
		
		int edades[] = new int[3];
		System.out.println("edades = "+edades );


		edades[0] = 10;
		System.out.println(edades[0]);
		
	for(int i = 0; i <edades.length; i++) {
	
		System.out.println(i+" edades "+edades[i]);
		
	}
	
	Personas persona[] = new Personas[2];
	
	persona [0] = new Personas("Daniela"); 
	persona [1] = new Personas("Andrea");
	
	System.out.println("Persona 0 "+ persona[0].toString());
	System.out.println("Persona 1 "+persona[1]);
	
	
	for(int i=0;i<persona.length; i++) {
		System.out.println("Personas = "+persona[i]);
	}
	
		
	String frutas [] = {"Naranja","Plátano","Uva"};
	for (int i =0; i<frutas.length; i++) {
		System.out.println("Frutas " + frutas[i]);
	}
	
	
	
	}
	
	
	
	
	
	
}
