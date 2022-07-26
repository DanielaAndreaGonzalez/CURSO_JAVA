package Logic;

import java.util.Scanner;

public class SeptimoCandidatos {

	/**
	 * Realizar un programa que permita al usuario elegir un candidato por el cual
votar. Las posibilidades son: candidato A por el partido rojo, candidato B por
el partido verde, candidato C por el partido azul. Seg�n el candidato elegido
(A, B � C) se le debe imprimir el mensaje �Usted ha votado por el partido
[color que corresponda al candidato elegido]�. Si el usuario ingresa una
opci�n que no corresponde a ninguno de los candidatos disponibles, indicar
�Opci�n err�nea�
	 * @param args
	 */
	
	public static void elegirCandidato(char opcion){
		switch(opcion){
		case 'A':
			System.out.println("Usted ha votado por el partido rojo ");
			break;
		case 'B':
			System.out.println("Usted ha votado por el partido verde ");
			break;
		case 'C':
			System.out.println("Usted ha votado por el partido azul ");
			break;
		default:
			System.out.println("Opci�n erron�a");
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato= new Scanner(System.in);
		System.out.println("�Qu� candidato desea elegir? A,B o C ");
		char opcion = dato.next().charAt(0);
		char opcMayuscula=Character.toUpperCase(opcion);
		elegirCandidato(opcMayuscula);
		
	}

}

