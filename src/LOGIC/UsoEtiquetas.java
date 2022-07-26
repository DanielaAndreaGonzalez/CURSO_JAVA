package LOGIC;

public class UsoEtiquetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicio:
			for (int contador1 = 0; contador1 < 3 ; contador1++){
				if ( contador1 % 2 != 0){
					continue inicio; // es bueno estas etiquetas pero con ciclos anidados lo mismo para el break
					//break;
				}
				System.out.println("Contador: "+ contador1);
			}
			
	}

}
