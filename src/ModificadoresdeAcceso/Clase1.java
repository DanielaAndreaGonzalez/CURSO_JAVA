package ModificadoresdeAcceso;

class Clase1 {
	
	
	//public String aributoPublico = "Valor atributo p�blico";
    
	//protected String atributoProtected= "Valor atributo protected";
	
	//String atributoDefault = "Valor atributo default";
	
	private String atributoPrivado = "Valor atributo privado";
	
	/**public Clase1() {
		System.out.println("Constructor P�blico");	
	}
	public void metodoPublico() {
		System.out.println("M�todo p�blico");
	}
	
	protected Clase1() {
		System.out.println("Constructor Protected");
	}
	
	protected void metodoProtected() {
		System.out.println("M�todo protected");
	}
	
	public Clase1(String arg) {
		System.out.println("Constructor P�blico");	
	}*/
	
	private Clase1() {
		System.out.println("Constructor vac�o privado");
	}
	public Clase1(String argumento) {
		this();
		System.out.println("Constructor p�blico");
	}
	
	private void metodoPrivado() {
		System.out.println("M�todo privado");
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
