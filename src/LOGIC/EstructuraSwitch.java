package LOGIC;

public class EstructuraSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=2;
		String numeroTexto = "Número desconocido";
		
		switch(numero){
		case 1:
			numeroTexto = "Número uno";
			break;
		case 2:
			numeroTexto = "Número dos";
			break;
		case 3:
			numeroTexto = "Número tres";
			break;
		case 4:
			numeroTexto = "Número cuatro";
			break;
		case 5:
			numeroTexto = "Número cinco";
			break;
		default :
			numeroTexto = "Caso no encontrado";
		}
		System.out.println("Número texto: "+numeroTexto);
		
		int mes=4;
		String estacion = "Estación desconocida";
		 switch(mes){
		 case 1: case 2: case 12:
			 estacion = "Inverno";
			 break;
		 case 3: case 4: case 5:
			 estacion = "Primavera";
			 break;
		 case 6: case 7: case 8:
			 estacion = "Verano";
			 break;
		 case 9: case 10: case 11:
			 estacion = "Otonio";
			 break;
			
		 }
		
	}

}
