package LOGIC;

public class EstructuraSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=2;
		String numeroTexto = "N�mero desconocido";
		
		switch(numero){
		case 1:
			numeroTexto = "N�mero uno";
			break;
		case 2:
			numeroTexto = "N�mero dos";
			break;
		case 3:
			numeroTexto = "N�mero tres";
			break;
		case 4:
			numeroTexto = "N�mero cuatro";
			break;
		case 5:
			numeroTexto = "N�mero cinco";
			break;
		default :
			numeroTexto = "Caso no encontrado";
		}
		System.out.println("N�mero texto: "+numeroTexto);
		
		int mes=4;
		String estacion = "Estaci�n desconocida";
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
