package CLASES;

public class PruebaPersona {

	public static void main(String[] args){
		
		Persona persona = new Persona("Dani");
		System.out.println(persona);
		Persona persona2  = new Persona("Andrea");
		System.out.println(persona2);	
		
		imprimir(persona);
		imprimir(persona2);
	}
	
	
	/**No se puede declarar este método sin la palabra estático
	ya que se asocia con la clase, y debe ser estático 
	si se va a llamar de otra función 
	y puede ser public static o static public, ambos son válidos
	No se puede usar la palabra this dentro de un contexto estático
	--contexto dinámico tiene: this--
	*/
	public static void imprimir(Persona persona) {
		System.out.println("persona = "+ persona);
		
	}
}

