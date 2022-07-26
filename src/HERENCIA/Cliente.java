package HERENCIA;

import java.util.Date;

public class Cliente extends Persona{
	
	private int idCliente;
	private Date fechaRegistro;
	private boolean Vip;
	private static int contadorCliente;
	
	
	public Cliente(Date fechaRegistro, boolean vip,String nombre, char genero, int edad, String direccion) {
		//Estamos llamando al constructor de la clase padre
		super(nombre, genero, edad, direccion);
		//nombre de la clase para saber que es estático
		this.idCliente = ++Cliente.contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.Vip = vip;	
	}


	/**
	 * @return el idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @return el fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	/**
	 * @param fechaRegistro el fechaRegistro a establecer
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	/**
	 * @return el vip
	 */
	public boolean isVip() {
		return Vip;
	}


	/**
	 * @param vip el vip a establecer
	 */
	public void setVip(boolean vip) {
		Vip = vip;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", Vip=");
		builder.append(Vip);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	

}
