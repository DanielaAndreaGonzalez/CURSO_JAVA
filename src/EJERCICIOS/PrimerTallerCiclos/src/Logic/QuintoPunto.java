package Logic;

import java.util.Scanner;

public class QuintoPunto {

	
	/*
	 * Realizar un programa que registre n productos dónde se solicite:
	 *  la descripción y el precio de venta.
	 *  Si el total de la compra es mayor que 500 soles dar 
	 *  un descuento de 20% de lo contrario de 5%,
	 *   mostrar una lista de todos los registros y su respectivo descuento.
	 *  El programa termina cuando se formule la pregunta SI desea continuar o NO registrando productos.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el número de productos a registrar: ");
		int cantidadProductos = dato.nextInt();	
		double totalCompra = calcularCompra(cantidadProductos);
		System.out.println("Total: "+totalCompra+" Descuento: "+calcularDescuento(totalCompra));	
	}
	
	public static double calcularCompra(int cantidadProductos){
		String desProducto="";
		double precioProducto = 0;
		double totalCompra = 0;
		String lista ="";
		for (int i=1; i<=cantidadProductos;i ++){
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese la descripción del producto: "+i);
			desProducto = dato.nextLine();
			System.out.println("\nIngrese el precio de venta: "+i);
			precioProducto = dato.nextDouble();
			totalCompra+=precioProducto;	
			lista = lista+"\n "+desProducto+" Precio: "+precioProducto;
		}
		System.out.println(lista);
	return totalCompra;	
	}
	
	public static double calcularDescuento(double totalCompra){
		
		double descuento=0;
		double compraDescuento=0;

		if (totalCompra > 500){
			descuento = totalCompra * 0.20;
			compraDescuento = totalCompra - descuento;
		}else if(totalCompra <500){
			descuento = totalCompra * 0.05;
			compraDescuento = totalCompra- descuento;
		}
		System.out.println("\n total a pagar: "+compraDescuento);
		return descuento;
		
	}
	

}
