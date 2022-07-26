/**
 * 
 */
package ApiCollections;

import java.util.*;

/**
 * @author DanielaAGonzalezH
 *
 */
public class TestCollectiones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		List miLista = new ArrayList<>();
		//La lista guarda el orden cuando lo estamos agregando
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Mi�rcoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		
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
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Mi�rcoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		//imprimir(miSet);
		
		/*public static void imprimir(Collection coleccion) {
			
			for(Object elemento: coleccion) {
				System.out.println("Elemento = " + elemento);
			}
			
		}*/
		
		Map miMapa = new HashMap();
		miMapa.put("Valor1", "Dani");
		miMapa.put("Valor2", "Andrea");
		miMapa.put("Valor3", "Rosario");
		
		String elemento =(String) miMapa.get("Valor1");
		System.out.println(elemento);
		
		//Los set no garantizan el orden
		System.out.println(miMapa.keySet());
		System.out.println(miMapa.values());
				
		
	}

}
