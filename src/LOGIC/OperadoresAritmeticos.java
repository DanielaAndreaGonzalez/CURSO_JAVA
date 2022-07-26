package LOGIC;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * OPERADORES AIRTMETICOS
		 */
		int a=1,b=1;
		int suma=a+b;
		int resta = a-b;
		int multiplicacion = a*b;
		//int division = a/b;
		
		//Modulo, residuo entero 
		int modulo = a%b;
		if(a%2==0)
			//no se colocan llaves porque hay una sola línea
			System.out.println("Par");
		else
			System.out.println("Impar");
		
		/**
		 * OPERADORES DE ASIGNACIÓN 
		 */
		
		int c=3;
		a +=1;
		
		/*
		 * OPERADORES UNARIOS
		 */
		//Operador de cambio de signo 
		int d = 3;
		int e = -d;
		boolean f = true;
		boolean j = !f;
		//INCREMENTo 
		//1. Pre-incremento(lleva simbolo antes de la variable)
		int k = ++d;
		// d=4 y k =4
		//2. posincremento 
		int h =5 ; //Se tiene pendiente un incremento 
		int l = h++; // Primero se utiliza el valor de la variable y luego se incrementa
		System.out.println("l: "+l);
		 //DECREMENTO
		//1.Pre decremento
		int i =2;
		int m=--i;
		System.out.println("i: "+i); //Ya esta decrementada, primero se utiliza el decremento
		
		//2. Pos Decremento
		int x = 4;
		int y = x--; // Primero se usa el valor de la variable y luego queda un decremento pendiente
		System.out.println(k); //tenía oendiente un decremento
		System.out.println(l); // 
		
		
	}

}
