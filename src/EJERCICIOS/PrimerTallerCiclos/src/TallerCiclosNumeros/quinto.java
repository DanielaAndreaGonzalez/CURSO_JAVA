package TallerCiclosNumeros;

import java.util.Scanner;

public class quinto {

	/*
	 * scriba un m�todo que le pregunte al usuario (n) n�meros enteros y retorne
	el menor valor ingresado.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Valor minimo es: "+encontrarValorMinimo());
	}
	
	public static int encontrarValorMinimo(){
		
		int valorMinimo=999999;
		boolean bandera=true;
		String respuesta="";
		
		while(bandera){
			Scanner dato = new Scanner(System.in);
			System.out.println("Ingrese el n�mero entero");
			int cantidad = dato.nextInt();	
			
			if(cantidad<valorMinimo){
				valorMinimo=cantidad;
			}
			System.out.println("�Desea seguir agregando m�s n�meros ? S o N");
			respuesta =dato.next();
			if (respuesta.equals("N")){
				bandera=false;
			}	
		}
		return valorMinimo;
	}
	
	

}
