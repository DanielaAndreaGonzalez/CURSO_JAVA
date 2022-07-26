package ProyectoFinalMundoPc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
		
	}
	
	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}

	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return el tamanio
	 */
	public double getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio el tamanio a establecer
	 */
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	/**
	 * @return el contadorMonitores
	 */
	public static int getContadorMonitores() {
		return contadorMonitores;
	}

	/**
	 * @param contadorMonitores el contadorMonitores a establecer
	 */
	public static void setContadorMonitores(int contadorMonitores) {
		Monitor.contadorMonitores = contadorMonitores;
	}

	/**
	 * @return el idMonitor
	 */
	public int getIdMonitor() {
		return idMonitor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [idMonitor=");
		builder.append(idMonitor);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", tamanio=");
		builder.append(tamanio);
		builder.append("]"+super.toString());
		return builder.toString();
	}
	
	
	
}
