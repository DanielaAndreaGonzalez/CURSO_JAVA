package LOGIC;
import java.util.Scanner;
public class CalcularAreasEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Proporciona el alto: ");
		int alto = dato.nextInt();
		System.out.println("Proporciona el ancho: ");
		int ancho = dato.nextInt();
		//OPERAMOS
		int area = alto * ancho;
		int perimetro = (alto + ancho) * 2;
		
		System.out.println("Area: " +"<" + area +">");
		System.out.println("Perimetro: "+ "<"+perimetro+">");	
	
		Scanner dato1 = new Scanner(System.in);
		System.out.println("Proporciona el número1: ");
		int numero1 = dato1.nextInt();
		System.out.println("Proporciona el número2: ");
		int numero2 = dato1.nextInt();
		
		if ( numero1>numero2)
			System.out.println("número 1 es mayor");
		else 
			System.out.println("Número 2 es mayor ");
		
		System.out.println(numero1 > numero2 ? numero1 : numero2);
	
	}

}
