package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class EjercicioNatacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese la cantidad de los competidores");
			int cantidad=dato.nextInt();
			System.out.println(sacarGanador(cantidad));
			
	}
	
	public static String sacarGanador(int cantidad){
		int ganador=9999;
		
		String cadena="";
		int tiempo=0;
		String arregloNombre[]=new String[cantidad];
		String nombreGanador="";
		int arregloTiempos[]=new int[cantidad];
		String cadenaGanador="";
		
		for(int i=0; i<arregloTiempos.length;i++){
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese el nombre: : ");
			nombreGanador=dato.nextLine();	
			arregloNombre[i]=nombreGanador;
			
			System.out.println("Ingrese el tiempo:  ");
			tiempo = dato.nextInt();
			arregloTiempos[i] = tiempo;
			
			if(arregloTiempos[i]<ganador){
				
				cadenaGanador = arregloNombre[i];
				ganador = arregloTiempos[i];	
			}
			dato.close();
		}
		
		cadena=cadena +" Ganador con "+ganador+" es: "+cadenaGanador;
		
		return cadena;
		
	}
	
	

}
