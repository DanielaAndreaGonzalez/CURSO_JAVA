package METODOS;

public class Aritmetica {
	
	int a;
	int b;
	
	//Constructor vacío
	public Aritmetica(){
		System.out.println("Ejecutando constructor ");
		
	}
	public Aritmetica(int a, int b){
		this.a= a; 
		this.b = b;
		System.out.println("ejecutando constructor con argumentos");
	}
	
	
	
	//Metodo
	public void sumar(){
		int resultado = this.a + this.b;
		System.out.println("Resultado = "+resultado);
	}
	public int sumarConRetorno() {
		return this.a + this.b;
	}
	
	public int sumarConArgumentos(int a,int b){
		//El operador this es opcional, el código ya funcionaba sin él
		this.a =  a; //El argumento a se asigna al atributo this.a
		this.b =  b;
		//Return a +b;
		return this.sumarConRetorno();
	}
	
	public void miMetodo(){
		System.out.println("Otro metodo");
	}
	
}
