package N104;

import java.io.IOException;

/**
 * Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu
 * contingut per consola.
 *
 */

public class MainT5N104 {

	public static void main(String[] args) throws IOException {

		// el argumento [0]  está indicado en /Run Configurations/ Arguments

		if (args.length != 1) {
			System.out.println("numero invalido de argumentos. Es 1 argumento");
		} else {
			String pathTxt = args[0];
			String resultado = GestionArchivos.leerTxt(pathTxt);
			System.out.println(resultado);
		}
	}
}
