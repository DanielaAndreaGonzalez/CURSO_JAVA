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
	 * Una clase abstracta declara la existencia de m�todos
	 * pero no la implementacion de dichos m�todos
	 * (o sea las llaves {} y las sentencias entre ellas)
	 * 
	 * una clase abstracta puede tener m�todos no abstractos,  
	 * pero al menos uno debe ser abstracto
	 */
	public static void main(String [] args) {
		//SOlo trabajar con objetos con clases hijas
		//No con los padres cuando son abstractas
		
		
		FiguraGeometrica figura = new Rectangulo("Rect�ngulo");
		figura.dibujar();
	}
	
	/**
	 * Diferencia entre una clase abstracta y una constante
	 * es que:
	 * cuando las caracteristicas se relacionan
	 * y se parecen m�s de la padre a la hija
	 * es m�s abstracto, en cambio cuando se relacionan 
	 * m�s por comportamiento, es m�s conveniente
	 * utilizar una interface
	 * 
	 */

}
