/**
 * 
 */
package POLIMORFISMO;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Gerente extends Empleado {
	private String departamento;
	
	public Gerente(String nombre, double sueldo,String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
	}
	
	
	/**
	 * Sobreescritura de  la clase padre y se agrega
	 * la notación override 
		La notación cambia 
		El compilador sabe que estamos sobreescibiendo
		un método de la clase padre
	 * 
	 */
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles() + " , departamento: "+this.departamento;
	}

}
