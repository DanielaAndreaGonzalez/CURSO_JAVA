package Enumeraciones;

public class TestEnumeraciones {

		public static void main(String []args ) {
			
			//System.out.println("Día 1: "+Enumeraciones.LUNES);
			System.out.println("Continente no. 4: "+Continentes.AMERICA);
			System.out.println("No. Países en el 4to continente: "+Continentes.AMERICA.getPaises());
			
			System.out.println("Continente no. 1: "+Continentes.AFRICA);
			System.out.println("No. Países en el 4to continente: "+Continentes.AFRICA.getPaises());
			
		
		
		}
		
		private static void indicarDiaSemana(Enumeraciones dias) {
	   // Con el argumento ya se pueden entrar
			switch(dias) {
			case LUNES: 
				System.out.println("Primer día de la semana");
				break;
			case MARTES:
				System.out.println("Segundo día de la semana");
				break;
			case MIERCOLES:
				System.out.println("Tercer día de la semana");
				break;
			case JUEVES:
				System.out.println("Cuarto día de la semana");
				break;
			case VIERNES:
				System.out.println("Quinto día de la semana");
				break;
			case SABADO:
				System.out.println("Sexto día de la semana");
				break;
			case DOMINGO:
				System.out.println("Séptimo día de la semana");
				break;
			}
			
		}
	
}
