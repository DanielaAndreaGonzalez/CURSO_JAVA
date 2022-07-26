package Logica;

import java.util.Scanner;

public class Login {
	
	public static void verificarUsuario(String usuario, String contrasenia){
		
		String usuarioValido = "Raul";
		String contraseniaValido = "raul123";
		
		//validar datos
		if(usuarioValido.equals(usuario) && contraseniaValido.equals(contrasenia)){
			//si los valores del usuario y la contrasenia son iguales va a llamar a la funcion confirmacion
			System.out.println(confirmacion(usuario));
			return;
		}
		// si el usuario no conincide con la contrasenia va a llar a la funcion usuarioError
		System.out.println(usuarioError(usuario));
		
	}
	
	
	public static String confirmacion(String nombreUsurio){
		String mensaje = "El usuario" + " " + nombreUsurio + " " + "ingreso exitosamente"; 
		return mensaje;
	}
	
	
	public static String usuarioError(String nombreUsurio){
		String mensajeError = "El usuario" + " " + nombreUsurio + " " + "es incorrecto"; 
		return mensajeError;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner dato = new Scanner(System.in);
		
		String usuario;
		System.out.println("Nombre de Usuairo");
		usuario = dato.nextLine();
		
		String contrasenia;
		System.out.println("Contraseña");
		contrasenia = dato.nextLine();
		
		//llamar la funcion verificarUsuario
		verificarUsuario(usuario, contrasenia);
	}

}
