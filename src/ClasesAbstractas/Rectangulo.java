/**
 * 
 */
package ClasesAbstractas;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Rectangulo extends FiguraGeometrica{
	
	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
		
		//Cuando se implementa un método abstracto ya no se pone abstrac
	}
		@Override
		public void dibujar() {
		   	System.out.println("Se imprime un: "+this.getClass().getSimpleName());
		   	
		   	
		   	
		}
		
	
	

}
