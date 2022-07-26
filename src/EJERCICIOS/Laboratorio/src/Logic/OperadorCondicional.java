package Logic;

import java.util.Scanner;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores (&&) y el or || 
		
		//Operador and (&&) 
		int a = 5;
		int valorMaximo = 10;
		int valorMinimo = 0;
		
		boolean resultado = (a >=valorMinimo && a<= valorMaximo);
		
		if (resultado == true){
			System.out.println("El valor está dentro del rango");
		}else{
			System.out.println("El valor NO se encuentra en el rango");	
		}
		
		//Operador or (||)
		//Escenario: el padre puede ir a ver el partido de su hijo
		
		Scanner dato=new Scanner(System.in);
		String disponibilidad;
		System.out.println("Tiene disponibilidad");
		disponibilidad = dato.nextLine();
		
		String dinero;
		System.out.println("Tiene dinero");
		dinero = dato.nextLine();
		
		boolean asistencia = (disponibilidad.equals("Si") || dinero.equals("Si") );
		
		if (asistencia == true ){
			System.out.println("El padre puede ir");
		}else{
			System.out.println("El padre no podrá ir");
		}
		
		
		
		
	}

}
