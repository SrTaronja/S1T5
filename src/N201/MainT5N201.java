package N201;

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

public class MainT5N201 {

	public static void main(String[] args) throws IOException {

		Properties p = Configuracion.crearConfigParam();
		GestionArchivos.ListarDirectorioConsola(p.getProperty("pathExaminar"));
		System.out.println();
		GestionArchivos.ListarArbolDirectorioConsola(p.getProperty("pathExaminar"));
		System.out.println();
		String resultado = GestionArchivos.ListarDirectorioTxt(p.getProperty("pathExaminar"),p.getProperty("pathTxt"), p.getProperty("nombreTxt"));
		System.out.println(resultado);
	}

}
