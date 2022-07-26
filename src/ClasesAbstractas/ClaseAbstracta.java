/**
 * 
 */
package ClasesAbstractas;

/**
 * @author DanielaAGonzalezH
 *
 */
public class ClaseAbstracta {
	
	
	/**
	 * Una clase abstracta declara la existencia de métodos
	 * pero no la implementacion de dichos métodos
	 * (o sea las llaves {} y las sentencias entre ellas)
	 * 
	 * una clase abstracta puede tener métodos no abstractos,  
	 * pero al menos uno debe ser abstracto
	 */
	public static void main(String [] args) {
		//SOlo trabajar con objetos con clases hijas
		//No con los padres cuando son abstractas
		
		
		FiguraGeometrica figura = new Rectangulo("Rectángulo");
		figura.dibujar();
	}
	
	/**
	 * Diferencia entre una clase abstracta y una constante
	 * es que:
	 * cuando las caracteristicas se relacionan
	 * y se parecen más de la padre a la hija
	 * es más abstracto, en cambio cuando se relacionan 
	 * más por comportamiento, es más conveniente
	 * utilizar una interface
	 * 
	 */

}
