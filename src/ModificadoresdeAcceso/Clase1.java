package ModificadoresdeAcceso;

class Clase1 {
	
	
	//public String aributoPublico = "Valor atributo público";
    
	//protected String atributoProtected= "Valor atributo protected";
	
	//String atributoDefault = "Valor atributo default";
	
	private String atributoPrivado = "Valor atributo privado";
	
	/**public Clase1() {
		System.out.println("Constructor Público");	
	}
	public void metodoPublico() {
		System.out.println("Método público");
	}
	
	protected Clase1() {
		System.out.println("Constructor Protected");
	}
	
	protected void metodoProtected() {
		System.out.println("Método protected");
	}
	
	public Clase1(String arg) {
		System.out.println("Constructor Público");	
	}*/
	
	private Clase1() {
		System.out.println("Constructor vacío privado");
	}
	public Clase1(String argumento) {
		this();
		System.out.println("Constructor público");
	}
	
	private void metodoPrivado() {
		System.out.println("Método privado");
	}
	/**
	 * @return el atributoPrivado
	 */
	public String getAtributoPrivado() {
		return atributoPrivado;
	}
	/**
	 * @param atributoPrivado el atributoPrivado a establecer
	 */
	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivado = atributoPrivado;
	}
	
	

}
