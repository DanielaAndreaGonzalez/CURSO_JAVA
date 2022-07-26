package Enumeraciones;

public class TestEnumeraciones {

		public static void main(String []args ) {
			
			//System.out.println("D�a 1: "+Enumeraciones.LUNES);
			System.out.println("Continente no. 4: "+Continentes.AMERICA);
			System.out.println("No. Pa�ses en el 4to continente: "+Continentes.AMERICA.getPaises());
			
			System.out.println("Continente no. 1: "+Continentes.AFRICA);
			System.out.println("No. Pa�ses en el 4to continente: "+Continentes.AFRICA.getPaises());
			
		
		
		}
		
		private static void indicarDiaSemana(Enumeraciones dias) {
	   // Con el argumento ya se pueden entrar
			switch(dias) {
			case LUNES: 
				System.out.println("Primer d�a de la semana");
				break;
			case MARTES:
				System.out.println("Segundo d�a de la semana");
				break;
			case MIERCOLES:
				System.out.println("Tercer d�a de la semana");
				break;
			case JUEVES:
				System.out.println("Cuarto d�a de la semana");
				break;
			case VIERNES:
				System.out.println("Quinto d�a de la semana");
				break;
			case SABADO:
				System.out.println("Sexto d�a de la semana");
				break;
			case DOMINGO:
				System.out.println("S�ptimo d�a de la semana");
				break;
			}
			
		}
	
}
