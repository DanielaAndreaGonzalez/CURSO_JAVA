package DISEÑOCLASES;

public class Orden {
	
	private int idOrden;
	private Productos productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes; //Se agrega un pre incremento para que desde el inicio tenga 1
		this.productos = new Productos[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Productos producto) {
		if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
			productos[contadorProductos++] = producto; //Un pos incremento, cuando se agregue el producto sube esta variable 
		}else {
			System.out.println("Se ha superado el máximo de productos");
		}	
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i=0;i<this.contadorProductos; i++) {
			Productos producto = this.productos[i]; // Se obtiene el producto que estamos iterando en el momento
			total += producto.getPrecio(); 
			//total += this.productos[i].getPrecio(); //Con esta línea se usan las dos anteriores
		}
		return total;
	}
	public void  mostrarOrden() {
		System.out.println("Id Orden: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("Total de la Orden: $" + totalOrden);
		System.out.println("Productos de la Orden: ");
		
		for(int i =0; i<this.contadorProductos; i++) {
			 System.out.println(this.productos[i]);
		}
		
		
		
	}

}
