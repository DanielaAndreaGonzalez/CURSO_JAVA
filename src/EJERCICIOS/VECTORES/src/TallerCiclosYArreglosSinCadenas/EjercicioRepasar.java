package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class EjercicioRepasar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		int tamanio= dato.nextInt();
		String arreglo[]=llenarArreglo(tamanio);
		
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);	
			
		}
		
		System.out.println("Las palabras palindromas son: "+contarPalindromas(arreglo));
		 System.out.println("Vocales en total de todo el arreglo "+contarVocales(arreglo));
	}
	
	
	
	public static String[] llenarArreglo(int tamanio){
		
		String arreglo[]= new String[tamanio];
		
		for(int i=0;i<arreglo.length;i++){
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese la palabra");
			String palabra=dato.nextLine();
			arreglo[i]=palabra;
		}
		return arreglo;
	}
	public static int contarPalindromas(String arreglo[]){
		int contador=0;
		String cadenas="";
		String inversa="";
		for(int i =0;i<arreglo.length;i++){
			cadenas = arreglo[i];
			for(int j=cadenas.length()-1;j>=0;j--){
				inversa = inversa+ cadenas.charAt(j);	
			}
			if(cadenas.equals(inversa)){
				contador+=1;
			}
			inversa="";
		}
		
		return contador;
	}
	public static int contarVocales(String arreglo[]){
		int contador=0;
		String cadena="";
		String nombre="";
		for(int i=0;i<arreglo.length;i++){
			cadena=arreglo[i];
			for(int j=0; j<cadena.length();j++){
				
				if(cadena.charAt(j)=='a'|| cadena.charAt(j)=='e' || cadena.charAt(j)== 'i'||
						cadena.charAt(j)=='o' || cadena.charAt(j)=='u'){
					contador+=1;
				}
				if(cadena.charAt(j) =='r' && cadena.charAt(j+1) =='r'){
					nombre=cadena;
					System.out.println(nombre+" trae rr");
				}
				else if(cadena.charAt(j) == 'l' && cadena.charAt(j+1)=='l'){
					nombre=cadena;
					System.out.println(nombre+" trae ll");
				}
				else{
					System.out.println("error");
				}
			}
			
		}
		
		
		return contador;
	}
	
	
	
}
