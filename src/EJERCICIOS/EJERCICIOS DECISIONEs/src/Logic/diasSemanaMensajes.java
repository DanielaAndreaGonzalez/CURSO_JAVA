package Logic;

import java.util.Scanner;

public class diasSemanaMensajes {
 /**
  * guales.
4. Realizar un programa que solicite al usuario que ingrese un día de la semana
e imprimir un mensaje si es lunes, otro mensaje diferente si es viernes, otro
mensaje diferente si es sábado o domingo. Si el día ingresado no es ninguno
de esos, imprimir otro mensaje
  * @param dia
  */
	public static void mostrarMensaje(String dia){
		switch (dia){
		case "lunes":
			System.out.println("Happy day");
			break;
		case "martes":
			System.out.println("Take care");
			break;
		case "miercoles":
			System.out.println("U are pretty");
			break;
		case "jueves":
			System.out.println("U are funny");
			break;
		case "viernes":
			System.out.println("Today is party");
			break;
		case "sabado":
			System.out.println("have fun");
			break;
		case "domingo":
			System.out.println("To Church");
			break;
		default:
			System.out.println("Día no existe");
			break;
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese un día de la semana: ");
		String dia = dato.nextLine();
		mostrarMensaje(dia);
	}

}
