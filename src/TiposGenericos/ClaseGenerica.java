/**
 * 
 */
package TiposGenericos;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ClaseGenerica<T> {
	
	/**
	 * Los tipos de datos genéricos
	 * 
	 *  Es un tipo generico y se declaran asi: 
	 *  
	 *  con la t se indica cualquier tipo
	 *  
	 */
	public T objeto; 
	
	public ClaseGenerica(T objeto) {
		this.objeto = objeto;
	}
	
	public void obtenerTipo() {
		System.out.println("El tipo T es:"+objeto.getClass().getSimpleName());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
