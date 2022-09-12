package N102;

/**
 * Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un
 * arbre de directoris amb el contingut de tots els seus nivells (recursivament)
 * de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada
 * nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva
 * última data de modificació.
 *
 */

public class MainT5N102 {

	public static void main(String[] args) {

		// el argumento [0] (ruta) está indicado en /Run Configurations/ Arguments
		
		if (args.length != 1) {
			System.out.println("numero invalido de argumentos. Es 1 argumento");
		} else {
			String inputPath = args[0];
			GestionArchivos.ListarArbolDirectorioConsola(inputPath);
		}
	}
}
