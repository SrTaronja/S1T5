package N201;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en
 * un fitxer de configuració.
 * 
 * Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons
 * Configuration si ho prefereixes.
 * 
 * De l'exercici anterior, parametritza el següent:
 * 
 * Directori a llegir. Nom i directori del fitxer TXT resultant.
 *
 */

public class Configuracion {

	public static Properties crearConfigParam() throws IOException {

		File config = new File("config.properites");
		Properties properties = new Properties();
		
		try {
			FileWriter fwriter = new FileWriter(config);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			properties.setProperty("pathExaminar", "..\\S1T5\\");
			properties.setProperty("pathTxt", "..\\S1T5\\");
			properties.setProperty("nombreTxt", "ListaDirectorio.txt");
			properties.store(bwriter, "Properties guardadas aqui");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}