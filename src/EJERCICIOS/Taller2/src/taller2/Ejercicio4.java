package taller2;

import java.util.Scanner;

public class Ejercicio4 {

	
	/**
	 * Función que verifica si la hora, los minutos y segundos ingresados son correctos
	 * @param horas
	 * @param minutos
	 * @param segundos
	 * @return true si es valido y false si los datos no son válidos
	 */
	
	public static boolean valorarhoras(int horas,int minutos, int segundos){
		boolean horaValida = false;
		if ( (horas >=0 && horas <=24) && (minutos >= 0 && minutos <=60) && (segundos >= 0 && segundos <= 60) ){
			horaValida = true;
		}else{
			horaValida = false;
		}
		
		return horaValida;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un programa que lea por teclado tres números enteros H, M, S
		//correspondientes a hora, minutos y segundos respectivamente, y comprueba
		//si la hora que indican es una hora válida.
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el valor en horas entre 1 y 24: ");
		int horas = dato.nextInt();
		System.out.println("Ingrese el valor en minutos entre 0 y 60: ");
		int minutos = dato.nextInt();
		System.out.println("Ingrese el valor en segundos entre 0 y 60: ");
		int segundos = dato.nextInt();
		
		if (valorarhoras(horas, minutos, segundos)){
			System.out.println("Los valores son validos");
		}else
		{
			System.out.println("Los valores son inválidos");
		}
		
		
		
		
		
	}

}
