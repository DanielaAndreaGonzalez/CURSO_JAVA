package Logic;

import java.util.Scanner;

public class PrecioArticulo {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		Scanner entrada;
		entrada = new Scanner(System.in);
		double precioArticulo;
		System.out.println("Ingrese el precio del artículo: ");
		precioArticulo = entrada.nextInt();
		
		double nuevoPrecio = precioArticulo + (precioArticulo*0.15);
		System.out.println("El nuevo precio es: "+nuevoPrecio);
		
		
		
		
		

	}

}
