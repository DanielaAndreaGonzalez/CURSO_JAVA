package LOGIC;

public class CICLOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**int contador =0;
		while (contador <3){
			System.out.println("Contador : "+contador);
			contador++;
		}**/
		
		/**
		 * CICLO DO-WHILE
		 */
		int contador = 0;
		do{
			System.out.println("Contador: "+ contador);
			contador++;
			
		}while( contador <0 );
		/**
		 * CICLO FOR
		 */
		for (int contador1 = 0; contador1 < 3 ; contador1++){
			if ( contador1 % 2 != 0){
				continue;
				//break;
			}
			System.out.println("Contador: "+ contador1);
		}
	}

}
