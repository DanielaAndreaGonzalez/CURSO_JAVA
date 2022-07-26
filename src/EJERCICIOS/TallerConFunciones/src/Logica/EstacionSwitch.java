package Logica;

import java.util.Scanner;

public class EstacionSwitch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el mes: ");
		String mes = dato.next();
		
		switch(mes){
		case "marzo": case "abril": case "mayo":
			System.out.println("primavera");
			break;
		case "junio": case "Julio": case "Agosto":
			System.out.println("verano");
			break;
		case "septiembre": case "octubre": case "noviembre":
			System.out.println("otoño");
			break;
		case "diciembre": case "enero": case "febrero":
			System.out.println("invierno");
			break;
		default:
			System.out.println("No existe el mes");
			
		}
			
		
	}

}
