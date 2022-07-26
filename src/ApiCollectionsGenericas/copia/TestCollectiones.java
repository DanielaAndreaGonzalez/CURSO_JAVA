/**
 * 
 */
package ApiCollectionsGenericas.copia;

import java.util.*;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestCollectiones {

	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		List <String> miLista = new ArrayList<>();

		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miércoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		String elemento = miLista.get(0);
		System.out.println("Elemento = "+elemento);
		
		/*
		//For each
		for (Object elemento: miLista) {
			System.out.println("Elemento: "+elemento);
		}
		System.out.println();
		//For each de tipo landa o flecha
		miLista.forEach(elemento -> {
			System.out.println("Elemento: "+elemento);
		});
		
		*/
		Set <String> miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miércoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		//imprimir(miSet);
		
		
		
		
		/*public static void imprimir(Collection coleccion) {
			
			for(Object elemento: coleccion) {
				System.out.println("Elemento = " + elemento);
			}
			
		}*/
		
		Map <String, String> miMapa = new HashMap<>();
		miMapa.put("Valor1", "Dani");
		miMapa.put("Valor2", "Andrea");
		miMapa.put("Valor3", "Rosario");
		miMapa.put("Valor3", "Oscar"); // Modifica el último valor asociado a dicha llave
		
		
		String elementoMapa = miMapa.get("Valor3");
		System.out.println(elementoMapa);
		
		//Los set no garantizan el orden
		System.out.println(miMapa.keySet());
		System.out.println(miMapa.values());
				
		
	}

}
