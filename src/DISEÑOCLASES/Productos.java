package DISEÑOCLASES;

public class Productos {
	
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	private Productos() {
		this.idProducto = ++Productos.contadorProductos;
	}
	
	public Productos(String nombre, double precio) {
	     	this();  //ES la llamada al constructor vacío
	     	this.nombre = nombre;
	     	this.precio = precio;
    			
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio el precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return el idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Productos [idProducto=");
		builder.append(idProducto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}
	
	

}
