package LOGIC;

public class OperadoresAsignacionYRelacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		int b=2;
		//int nn = (a != b); No funciona
			
		String cadena1 = "Hola";
		String cadena2 = "Adios";
		//String kk = cadena1.equals(cadena2); No funciona
		
		//Operadores relacionales > o <que
		// int resultado = a>= 0 && b<=10; no funciona 
		
		//OPERADOR TERNARIO
		
		 //int resultado = (3 >2 ) ? "Verdad" : "Falso" ; no funciona
		
		/**
		 * PRECEDENCIA DE OPERADORES
		 */
		
		int x=5;
		int y=10;
		int z = ++x + y--;
		//int z = ++x + y++;
		System.out.println(x); //6
		System.out.println(y);//9
		System.out.println(z);//16
		 
	}

}
