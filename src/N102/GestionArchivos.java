package N102;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un
 * arbre de directoris amb el contingut de tots els seus nivells (recursivament)
 * de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada
 * nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva
 * última data de modificació.
 *
 */

public class GestionArchivos {

	// EJERCICIO N01
	public static void ListarDirectorioConsola(String path) {

		File file = new File(path);
		String[] directorios = file.list();
		if (!file.exists()) {
			System.out.println("La ruta" + file.getAbsolutePath() + "no existe");
		} else {
			if (file.isDirectory()) {
				for (String d : directorios) {
					System.out.println(d);
				}
			} else {
				System.out.println(file.getName() + "no es un directorio");
			}
		}
	}

	// EJERCICIO N02
	public static void ListarArbolDirectorioConsola(String path) {

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("La ruta" + file.getAbsolutePath() + "no existe");
		} else {
			if (!file.isDirectory()) {
				String lastModified = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(file.lastModified()));
				System.out.println("Fichero F: " + file.getName() + ". Ultima modificacion: " + lastModified);
			} else {
				recorrerD(file);
			}
		}
	}

	public static void recorrerD(File file) {

		String lastModified = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(file.lastModified()));
		System.out.println("Fichero D: " + file.getName() + ". Ultima modificacion: " + lastModified);
		File[] subfiles = file.listFiles();
		for (File s : subfiles) {
			if (s.isFile()) {
				String lastModified2 = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(s.lastModified()));
				System.out.println("Fichero F: " + s.getName() + ". Ultima modificacion: " + lastModified2);
			}
		}
		for (File s : subfiles) {
			if (s.isDirectory()) {
				recorrerD(s);
			}
		}
	}
}
