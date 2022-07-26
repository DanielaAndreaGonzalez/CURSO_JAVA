package TallerCiclosYArreglosSinCadenas;

import java.util.Scanner;

public class CertamenCorredor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de jugadores: ");
		int cantidadJugadores=dato.nextInt();
		System.out.println(determinarGanador(cantidadJugadores));
	}
	
	public static String determinarGanador(int cantidadJugadores){
		int tiempos[] = new int[cantidadJugadores];
		int tiempo=0;
		int menorTiempo=9999;
		int ganador=0;
		String cadena="";
		for (int i=0; i<tiempos.length;i++)
		{
			Scanner dato=new Scanner(System.in);
			System.out.println("Ingrese el tiempo del jugador: "+(i+1));
			tiempo=dato.nextInt();
			tiempos[i]=tiempo;
		}
		for(int i=0;i<tiempos.length;i++){
			if(tiempos[i]<menorTiempo){
				 menorTiempo= tiempos[i];
				 ganador=(i+1);
			}
		}
		cadena+= "Ganador: Jugador: "+ganador+" con menor tiempo de: "+menorTiempo;
		
		
		return cadena;
	}

}
