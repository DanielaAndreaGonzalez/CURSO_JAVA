package ProyectoFinalMundoPc;

public class DispositivoEntrada {

	private String tipoEntrada;
	private String marca;
	
	public DispositivoEntrada(String tipoEntrada,String marca) {
		
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
		
		
		
	}

	/**
	 * @return el tipoEntrada
	 */
	public String getTipoEntrada() {
		return this.tipoEntrada;
	}

	/**
	 * @param tipoEntrada el tipoEntrada a establecer
	 */
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	/**
	 * @return el Marca
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
