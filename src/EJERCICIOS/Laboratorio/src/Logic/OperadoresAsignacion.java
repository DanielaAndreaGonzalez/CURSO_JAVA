package Logic;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 8;
		
		int c = a +7-b;
		System.out.println("c = "+c);
		
		int f = 10,d=6, e=18;
		int z = 1 + (f+d*d+7)+(e/2)/3/1+2;
		System.out.println(z);
		
		//Incrementar los valores
		a +=1; //a = a+1
		System.out.println("a: "+a);
		
		a+=3; // a = a +3
		System.out.println("a: "+a);
		
		a*=3; // a= a *3
		System.out.println("a = "+a);
		
		
	}

}
