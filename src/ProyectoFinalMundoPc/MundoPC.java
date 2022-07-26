package ProyectoFinalMundoPc;

public class MundoPC {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		Monitor monitorHP = new Monitor("HP",13);
		Teclado tecladoHP = new Teclado("bluetooth","HP");
		Raton ratonHP = new Raton("bluetoot", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP ",monitorHP,tecladoHP,ratonHP);
		
		Monitor monitorGamer = new Monitor("Gamer",13);
		Teclado tecladoGamer = new Teclado("bluetooth","Gamer");
		Raton ratonGamer = new Raton("bluetooth", "Gamer");
		Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		
		orden1.mostrarOrden();
		
		
		
		
		
	}

}
