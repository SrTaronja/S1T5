package N103;

import java.io.IOException;

import N201.GestionArchivos;

/**
 * Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la
 * pantalla, guarda el resultat en un fitxer TXT.
 *
 */

public class MainT5N103 {

	public static void main(String[] args) throws IOException {

		// los argumentos estan indicados en /Run Configurations/ Arguments
		
		if (args.length != 3) {
			System.out.println("numero invalido de argumentos. Son 3 argumentos");
		} else {
			String pathExaminar = args[0];
			String pathTxt = args[1];
			String nombreTxt = args[2];
			String resultado = GestionArchivos.ListarDirectorioTxt(pathExaminar, pathTxt, nombreTxt);
			System.out.println(resultado);
		}
	}
}
