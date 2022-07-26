package METODOS;

public class PruebaAritmetica {

	
	public static void main(String[] args) {
		
		//Variables locales
		int a = 10;
		int b = 2;
		miMetodo();
		
		
		Aritmetica aritmetica1 = new Aritmetica();
		System.out.println("Aritmetica1 a: "+aritmetica1.a);
		System.out.println("Aritmetica b: "+aritmetica1.b);
		
		Aritmetica aritmetica2 = new Aritmetica(5,8);
		System.out.println("Aritmetica2 a: "+aritmetica2.a);
		System.out.println("Aritmetica2 b: "+aritmetica2.b);
		
		
		
		
		/**
		aritmetica1.a = 3;
		aritmetica1.b = 5;
		aritmetica1.sumar();
		
		int resultado = aritmetica1.sumarConRetorno();
		System.out.println("Resultado desde la prueba: "+resultado);
	
		resultado = aritmetica1.sumarConArgumentos(5, 8);
		System.out.println("Resultado usando argumentos: "+resultado);
        **/
	}
	
	public static void miMetodo(){	
		System.out.println("Otro metodo");
	}
}
//Hola esto es una prueba