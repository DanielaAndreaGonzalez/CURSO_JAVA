package Logica;

import java.util.Scanner;

public class EjercicioFarenheith {


	static double gradosF;
	
	public static double calcularGrados ( double gradosF){
		//gradosF - 32 / 1.8 f
		return (gradosF - 32) * 5/9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese los grados en farenheit: ");
		gradosF = dato.nextInt();
		double respuesta = calcularGrados(gradosF);
		System.out.println(gradosF+"F° = "+respuesta+"C°");
		
		
		
		
	}

}
