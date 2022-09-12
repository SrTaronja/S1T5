package N101;

/**
 * Crea una classe que llisti alfabèticament el contingut d'un directori rebut
 * per paràmetre.
 * 
 */

public class MainT5N101 {

	public static void main(String[] args) {

		// el argumento [0] (ruta) está indicado en /Run Configurations/ Arguments

		if (args.length != 1) {
			System.out.println("numero invalido de argumentos. Es 1 argumento");
		} else {
			String inputPath = args[0];
			GestionArchivos.ListarDirectorioConsola(inputPath);
		}
	}
}
