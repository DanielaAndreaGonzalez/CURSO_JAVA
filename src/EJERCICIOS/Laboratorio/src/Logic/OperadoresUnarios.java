package Logic;

public class OperadoresUnarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. operador de cambio de signo
		
		int a=3, b = -a;
		System.out.println("a: "+a);
		System.out.println("a: "+b);
		
		//2. Operación negación
		boolean c = true;
		boolean d = !c;
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		//3.operador incremento y decremento
		//preincremento (++var)
		
		int e = 3;
		int f = ++e; // primero se incrementa la variable (e) y después se utiliza ese valor incrementado
		System.out.println("e: "+e);
		System.out.println("f: "+f); 
		
		//postcremento (variable++
		int g = 3;
		int h = g++; // primero se incrementa la variable (e) y después se utiliza ese valor incrementado
		System.out.println("g: "+g);
		System.out.println("h: "+h); 
		
		//Predecremento (--var)
		int i = 5;
		int j = --i; // primero se decrementa la variable (e) y después se utiliza ese valor incrementado
		System.out.println("i: "+i);
		System.out.println("j: "+j); 
		
		//Posdecremento (var--)
		int k = 5;
		int l = k--; // primero se utiliza el valor de la variable y queda un decremento pendiente
		System.out.println("k: "+k);
		System.out.println("l: "+l); 
		
		
	}

}
