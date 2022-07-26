package Enumeraciones;

public enum Continentes {
	//AFRICA(53 ," 1.2 billones"),
	AFRICA(53),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANÍA(14);
	
	
	
	private final int paises;
	//POr cada elemento de la numeración debe tener como argumento el constructor
	Continentes(int paises){
		this.paises = paises;	
	}
	
	public int getPaises() {
		return this.paises;
	}
	
	
	
}
