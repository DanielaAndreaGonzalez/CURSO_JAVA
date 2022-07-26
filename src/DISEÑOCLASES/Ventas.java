package DISEÑOCLASES;

public class Ventas {

	public static void main(String [] args) {
		Productos producto = new Productos("Camisa",50.00);
		Productos producto2 = new Productos("Pantalon",100.00);
		Productos producto3 = new Productos("Pantalon",100.00);
		
		Orden orden = new Orden();
		orden.agregarProducto(producto);
		orden.agregarProducto(producto2);
		orden.agregarProducto(producto3);
		orden.mostrarOrden();
	
	
	}
	
	
	
	
}
