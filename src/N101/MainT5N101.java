 package N101;

/**
 * Crea una classe que llisti alfabèticament el contingut d'un directori rebut
 * per paràmetre.
 * 
 */

public class MainT5N101 {

	public static void main(String[] args) {

		// el argumento está indicado en /Run Configurations/ Arguments
		// está establecido por tag (en readme se debe indicar que el argumento de ruta se indica con ip:)
		
		String argumento = null;
		String tag = null;
		String inputPath = null;
		
		for(int i = 0; i < args.length; i++) {
			argumento = args[i];
			tag =  argumento.substring(0,3);
			if (tag.equals( "ip:")) {
				inputPath = argumento.substring(3,argumento.length());
			}
		}
		/////// ----->
		System.out.println(inputPath);
		// chequear que realmente hayan enviado los argumentos, y si no fuera el caso, solicitar que los introduzcan
		if (inputPath == null) {
			// pdte.
		}
		GestionarArchivos.ListarDirectorioConsola(inputPath);
		/////// <-----
		
	}
}

// ------------------- APUNTES ------------------------
// argumentos por posición:
//
//		if (args.length != 1) {
//			System.out.println("numero invalido de argumentos. Es 1 argumento");
//		} else {
//			String inputPath = args[0];
//			GestionArchivos.ListarDirectorioConsola(inputPath);
//			

