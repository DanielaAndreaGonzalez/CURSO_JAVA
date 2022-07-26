package ProyectoFinalMundoPc;

public class Computadora {
	
	private final int idComputadora;
	private String nombre;
	private Monitor monitor; // Relación de agregación
	private Teclado teclado;
	private Raton raton;
	private static int contadorcomputadoras;
	
		private Computadora() {
			this.idComputadora = ++Computadora.contadorcomputadoras;
			}
	
		public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
			this();
			this.nombre = nombre;
			this.monitor = monitor;
			this.teclado = teclado ;
			this.raton = raton;
			}

		/**
		 * @return el idComputadora
		 */
		public int getIdComputadora() {
			return idComputadora;
		}

		

		/**
		 * @return el nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre el nombre a establecer
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return el monitor
		 */
		public Monitor getMonitor() {
			return monitor;
		}

		/**
		 * @param monitor el monitor a establecer
		 */
		public void setMonitor(Monitor monitor) {
			this.monitor = monitor;
		}

		/**
		 * @return el teclado
		 */
		public Teclado getTeclado() {
			return teclado;
		}

		/**
		 * @param teclado el teclado a establecer
		 */
		public void setTeclado(Teclado teclado) {
			this.teclado = teclado;
		}

		/**
		 * @return el raton
		 */
		public Raton getRaton() {
			return raton;
		}

		/**
		 * @param raton el raton a establecer
		 */
		public void setRaton(Raton raton) {
			this.raton = raton;
		}

		/**
		 * @return el contadorcomputadoras
		 */
		public static int getContadorcomputadoras() {
			return contadorcomputadoras;
		}

		/**
		 * @param contadorcomputadoras el contadorcomputadoras a establecer
		 */
		public static void setContadorcomputadoras(int contadorcomputadoras) {
			Computadora.contadorcomputadoras = contadorcomputadoras;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Computadora [idComputadora=");
			builder.append(idComputadora);
			builder.append(", nombre=");
			builder.append(nombre);
			builder.append(", monitor=");
			builder.append(monitor);
			builder.append(", teclado=");
			builder.append(teclado);
			builder.append(", raton=");
			builder.append(raton);
			builder.append("]"+super.toString());
			return builder.toString();
		}
		
		
		
	
	
	
}
