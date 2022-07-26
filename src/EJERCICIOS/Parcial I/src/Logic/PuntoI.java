package Logic;

import java.util.Scanner;

public class PuntoI {

	
	public static String darObsequio(int edad,String tarjeta,int duracion,int acumulado,int comprasAnuales,String mesNacimiento,double promedioComprasAnuales){
		
		String obsequio="";
		if (tarjeta.equals("Platinum") && acumulado >20000 && comprasAnuales < 4500000 && duracion >=2){
			obsequio = "Bolso";
		}else if(tarjeta.equals("PLatinum") && acumulado <=20000){
			obsequio = "Cosmetiquera";
		}else if(tarjeta.equals("Gold") && duracion >= 2 && edad >45 && acumulado >10000000){
			obsequio = "Pulsera";
		}else if(tarjeta.equals("Gold") && (edad>18 && edad <45) && mesNacimiento.equals("Octubre")){
			obsequio="Brazalete";
		}else if(tarjeta.equals("platinum") || tarjeta.equals("Gold") && promedioComprasAnuales >6000000){
			obsequio = "Cosmetiquera";
		}else{
			if (promedioComprasAnuales >15000000){
			obsequio = "Iphone 6s";
			}else{
				obsequio = "";
			}
		}
		return obsequio;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese su nombre ");
		String nombre = dato.nextLine();
		
		System.out.println("Ingrese su edad ");
		int edad = dato.nextInt();
		
		System.out.println("Ingrese el nombre de su tarjeta de crédito: ");
		String tarjetaCredito = dato.next();
		
		System.out.println("Duración de su tarjeta: ");
		int duracionTarjeta = dato.nextInt();
		
		System.out.println("Ingrese su acumulado de puntos: ");
		int acumuladoPuntos = dato.nextInt();
		
		System.out.println("Ingrese valor de compras anuales: ");
		int comprasAnuales = dato.nextInt();
		
		System.out.println("Ingrese su fecha de nacimiento: ");
		String mesNacimiento = dato.next();
		
		System.out.println("Ingrese valor promedio comprasAnuales");
		double promedioComprasAnuales = dato.nextDouble();
		
		System.out.println("Su obsequio será de :"+darObsequio(edad, tarjetaCredito, duracionTarjeta, acumuladoPuntos, comprasAnuales, mesNacimiento, promedioComprasAnuales));
		
	}

}
