/**
 * 
 */
package ClasesAbstractas;

/**
 * @author DanielaAGonzalezH
 *
 */
public abstract class FiguraGeometrica {
	
	protected String tipoFigura;
	
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	//Método abstracto
	public abstract void dibujar();
	
	
	public String getTipoFigura() {
		return tipoFigura;
	}
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FiguraGeometrica [tipoFigura=");
		builder.append(tipoFigura);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
