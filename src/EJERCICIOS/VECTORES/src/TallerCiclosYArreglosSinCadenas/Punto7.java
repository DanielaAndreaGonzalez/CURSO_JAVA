package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class Punto7 {

	//Realice una funci�n que dado un arreglo de enteros, retornar el arreglo
	// con los elementos en orden inverso
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el tama�o del vector");
		int tamanio = dato.nextInt();
		System.out.println(devolerArreglo(tamanio));
	}
	
	public static String devolerArreglo(int tamanio){
		String cadena="";
		String arregloNormal="";
		int arreglo[] = new int[tamanio];
		for(int i=0; i<arreglo.length;i++){
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese n�mero: ");
		int numero = dato.nextInt();
		arreglo[i] = numero;
		arregloNormal = arregloNormal+arreglo[i]+"-";
		cadena = arreglo[i] +"-"+cadena ;
		}
		
		cadena = "Arreglo inverso: {"+cadena+"}"+" Arreglo normal: {"+arregloNormal+"}" ;
		return cadena;
	}
	


}
