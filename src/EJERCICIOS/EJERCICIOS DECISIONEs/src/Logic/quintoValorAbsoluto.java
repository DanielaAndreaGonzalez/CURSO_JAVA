package Logic;

import java.util.Scanner;

public class quintoValorAbsoluto {

	
	/**
	 * ealizar un programa que, dado un número entero, muestre su valor absoluto. Nota:
para los números positivos su valor absoluto es igual al número (el valor absoluto de
52 es 52), mientras que, para los negativos, su valor absoluto es el número
multiplicado por -1 (el valor absoluto de -52 es 52).
	 * @param args
	 */
	public static int calcularValorAbs(int numero){
		int valorAbsoluto =0;
		if (numero >0){
			valorAbsoluto = numero;
		}else if (numero <0){
			valorAbsoluto = (numero * -1);
		}else{
			valorAbsoluto=0;
		}		
		return valorAbsoluto;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		int numero = dato.nextInt();
		System.out.println("Valor absoluto: "+calcularValorAbs(numero));
	}

}
