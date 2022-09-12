package N301;

/**
 * Crea una utilitat que encripti i desencripti els fitxers resultants dels
 * nivells anteriors.
 * 
 * Fes servir l'algorisme AES en manera de treball ECB o CBC amb mètode
 * d'ompliment PKCS5Padding. Es pot emprar javax.crypto o bé
 * org.apache.commons.crypto.
 *
 */

public class MainT5N301 {

	public static void main(String[] args) throws Exception {

		// los argumentos estan indicados en /Run Configurations/ Arguments

		if (args.length != 4) {
			System.out.println("numero invalido de argumentos. Son 4 argumentos");
		} else {
			String pathArchivo = args[0];
			String pathArchivoEncriptado = args[1];
			String pathArchivoDesencriptado = args[2];
			String key = args[3];
			Seguridad2.encriptar(pathArchivo, pathArchivoEncriptado, key);
			Seguridad2.desencriptar(pathArchivoEncriptado, pathArchivoDesencriptado, key);
		}
	}
}
