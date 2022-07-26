/**
 * 
 */
package JavaBeans;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestJavaBeans {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
			PersonaBean persona = new PersonaBean();
			persona.setNombre("Dani");
			persona.setApellido("Henao");
			System.out.println("persona = "+ persona);
			System.out.println("Persona nombre: "+ persona.getNombre());
			System.out.println("Persona Apellido: "+persona.getApellido());
			
			
	}

}
