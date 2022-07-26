package HERENCIA;

import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/**
		 * La clase hija puede acceder a los atributos de la clase padre con la palabra reservada
		 * SUPER() 	
		 */
		
		/**Empleado empleado = new Empleado("Daniela",500000);
			System.out.println("Empleado "+empleado);
		*/
		Date fecha = new Date();
		
		Cliente cliente = new Cliente(fecha, true, "Carla", 'F', 28, "Saturno 15");
		System.out.println(cliente);
		
		
		/**
		 * NOTA: SOBRECARGA DE CONSTRUCTORES
		 * 
		 * QUIERE DECIR QUE TENEMOS UNO O MÁS CONSTRUCTORES DEFINIDOS DENTRO DE NUESTRA CLASE
		 * PERO CON DIFERENTES ARGUMENTOS 
		 * 
		 * 
		 */
		
		
		
		
		
	}

}
