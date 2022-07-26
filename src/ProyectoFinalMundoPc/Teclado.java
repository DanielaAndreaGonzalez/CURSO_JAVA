package ProyectoFinalMundoPc;

public class Teclado extends DispositivoEntrada{
	
	private final int idTeclado;
	private static int contadorTeclados;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada,marca);
		this.idTeclado =++Teclado.contadorTeclados;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton [idRaton=");
		builder.append(idTeclado);
		builder.append("]" + super.toString());
		return builder.toString();
	}

	
	
	
}
