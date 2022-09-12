package N101;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GestionArchivos {

	public static void ListarDirectorioConsola(String path) {

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("La ruta" + file.getAbsolutePath() + " no existe");
		} else {
			if (file.isDirectory()) {
				String[] directorios = file.list();
				List<String> directoriosOrd= new LinkedList<String>();
				for (String d : directorios) {
					directoriosOrd.add(d);
					Collections.sort(directoriosOrd);
				}
				for (String dirOrd : directoriosOrd) {
					System.out.println(dirOrd);
				}
			} else {
				System.out.println(file.getName() + "no es un directorio");
			}
		}
	}
}
