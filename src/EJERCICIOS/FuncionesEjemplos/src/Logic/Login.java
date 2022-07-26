package Logic;

import java.util.Scanner;

public class Login {

	static String usuario;
	static String contrasenia;
	
	public static void verificarUsuario(String usuario,String contrasena){
		
		String usuarioValido = "Daniela";
		String contrasenaValido = "Daniela123";
		
		//validar datos
		if (usuarioValido.equals(usuario) && contrasenaValido.equals(contrasena)){
			//Si los valores del usuario y la contrasenia son iguales va a llamar a la función confirmar
			System.out.println(confirmar(usuario));
			return;
		}
		// si el usuario no coincie con la contrasenia va a llamar la funciion usuarioError
		System.out.println(usuarioError(usuario));
		
	}
	
	public static String usuarioError(String nombreUsuario){
		String mensajeError = "El usuario"+ nombreUsuario + "es incorrecto";
		return mensajeError;
	}
	
	public static String confirmar(String nombreUsuario){
		String mensaje = "El usuario "+nombreUsuario + "Ingreso exitosamente";		
		return mensaje;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el usuario: ");
		usuario = dato.nextLine();
		System.out.println("Ingrese la contraseña: ");
		contrasenia = dato.nextLine();
		
		verificarUsuario(usuario, contrasenia);
		
		
	}

}
