package N301;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Seguridad2 {

	public static void encriptar(String ficheroEntrada, String ficheroSalida, String password)  {

		File ficheroE = new File(ficheroEntrada);
		File ficheroS = new File(ficheroSalida);
		


		if (!ficheroE.exists()) {
			System.out.println("El fichero no existe");
		} else {
			try {
				// Crear stream de bytes del archivo a encriptar
				FileInputStream fis = new FileInputStream(ficheroE);
				// Generar clave a partir del password
				byte[] key = password.getBytes("UTF-8");
				MessageDigest sha = MessageDigest.getInstance("SHA-1"); //160 bit digest
				key = sha.digest(key);
				key = Arrays.copyOf(key, 16);  //solo los primeros 128 bits (16 bytes x 8 bits) 
				SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
				// Crear cifrador e introducir la key en él
				Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
				cifrador.init(Cipher.ENCRYPT_MODE, secretKeySpec);
				// Leer el fichero y cifrar el contenido
				byte[] lecturaBytes = fis.readAllBytes();
				byte[] mensajeCifrado = cifrador.doFinal(lecturaBytes);
				fis.close();
				// Guardar el contenido del fichero cifrado en un nuevo fichero
				FileOutputStream fos = new FileOutputStream(ficheroS, false);
				fos.write(mensajeCifrado);
				fos.close();
				System.out.println("Fichero encriptado " + ficheroS.getName() + " creado.");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void desencriptar(String ficheroEntrada, String ficheroSalida, String password)  {

		File ficheroE = new File(ficheroEntrada);
		File ficheroS = new File(ficheroSalida);

		if (!ficheroE.exists()) {
			System.out.println("El fichero no existe");
		} else {
			try {
				// Crear stream de bytes del archivo a encriptar
				FileInputStream fis = new FileInputStream(ficheroE);
				// Generar clave a partir del password
				byte[] key = password.getBytes("UTF-8");
				MessageDigest sha = MessageDigest.getInstance("SHA-1"); //160 bit digest
				key = sha.digest(key);
				key = Arrays.copyOf(key, 16); //solo los primeros 128 bits (16 bytes x 8 bits) 
				SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
				//KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
				//keyGenerator.init(128);
				//Key key = keyGenerator.generateKey();
				// Crear cifrador e introducir la key en él
				Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
				cifrador.init(Cipher.DECRYPT_MODE, secretKeySpec);
				// Leer el fichero y descifrar el contenido
				byte[] lecturaBytes = fis.readAllBytes();
				byte[] mensajeCifrado = cifrador.doFinal(lecturaBytes);
				fis.close();
				// Guardar el contenido del fichero descifrado en un nuevo fichero
				FileOutputStream fos = new FileOutputStream(ficheroS, false);
				fos.write(mensajeCifrado);
				fos.close();
				System.out.println("Fichero desencriptado " + ficheroS.getName() + " creado.");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
