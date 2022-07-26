package LOGIC;
import java.util.Scanner;
public class SistemaCalificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		System.out.println("Proporciona un valor entre 0 y 10: ");
		int valor = dato.nextInt();
		String resultado = "Valor desconocido";
		
		if(valor >=0 && valor <=10){
			if (valor >= 9 && valor <= 10){
				resultado = "A";
			}else if(valor >=8 && valor <9){
				resultado = "B";
			}else if( valor >= 7 && valor < 8){
				resultado = "C";
			}else if(valor>= 6 && valor < 6 ){
				resultado = "D";
			}else if(valor >= 0 && valor <6){
				resultado = "F";
			}
		}else{
			System.out.println("Resultado: "+resultado);
		}
		System.out.println("Resultado: "+resultado);
		
	}

}
