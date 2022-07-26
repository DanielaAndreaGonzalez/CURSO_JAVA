package Logic;

import domain.Persona;
import java.util.List;

import Datos.PersonaDAO;

public class TestManejoPersonas {
	
	public static void main(String[] args) {
		
		PersonaDAO personaDao = new PersonaDAO();
		/*List<Persona> personas = personaDao.seleccionar();
		
		for(Persona persona: personas) {
			System.out.println("Persona "+ persona);
		}
		
		//Funci�n lambda 
		personas.forEach(persona ->{
			System.out.println("persona = "+persona);
		});
		
		
		//Insertando un nuevo objeto de tipo persona
		
		Persona personaNew = new Persona("Carlos", "Esparza", "esparza@gmail.com", "1234098");
		personaDao.insertar(personaNew);
		
		List<Persona> personas = personaDao.seleccionar();
		for(Persona persona: personas) {
			System.out.println("Persona "+ persona);
		}
		*/
		System.out.println("�xito");
		
		//Modificar un objeto de persona existente
		/*
		Persona personaModificar = new Persona(4, "Juan Carlos", "Gom�z", "jcesparza@gmail.com", "1234098");
		personaDao.actualizar(personaModificar);
		
		List<Persona> personas = personaDao.seleccionar();
		for(Persona persona: personas) {
			System.out.println("Persona "+ persona);
		}
		*/
		
		//Eliminar un registro 
		Persona personaEliminar = new Persona(4);
		personaDao.eliminar(personaEliminar);
		
		List<Persona> personas = personaDao.seleccionar();
		for(Persona persona: personas) {
			System.out.println("Persona "+ persona);
		}
		
		
	}

}
