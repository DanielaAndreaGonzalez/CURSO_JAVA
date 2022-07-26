package TallerCiclosNumeros;

public class Primero {
 
	/*
	 * . Cree una función que sume los números del -10 al 20
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(sumarNumeros());
	}
	
	public static int sumarNumeros(){
		int acu=0;
		for (int i=-10; i<=20;i++){
			acu=acu+i;	
		}
		return acu;
	}

}
