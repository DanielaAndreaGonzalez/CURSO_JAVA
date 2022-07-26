package Logica;

import java.util.Scanner;

public class EjercicioEstaciones {

	
	public static String hallarEstacion(String mes){
		String estacion ="";
		if (mes.equals("marzo") || mes.equals("abril") ||mes.equals("mayo") )
		{
			estacion = "primavera";
		}
		else if(mes.equals("junio") || mes.equals("julio") ||mes.equals("agosto") )
		{
			estacion = "verano";
		}
		else if (mes.equals("octubre") || mes.equals("septiembre") ||mes.equals("noviembre") )
		{
			estacion = "otoño";
		}else if (mes.equals("diciembre") || mes.equals("enero") ||mes.equals("febrero") ){
			estacion = "invierno";
		}else{
			System.out.println("No existe mes");
		}
		return estacion;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el mes: ");
		String mes = dato.next();
		String estacion =hallarEstacion(mes);
		System.out.println("La estación es: "+estacion);
		
		
		
		
	}

}
