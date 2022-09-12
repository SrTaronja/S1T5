package N103;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

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

	// EJERCICIO N103
	public static String ListarDirectorioTxt(String pathExaminar, String pathTxt, String nombreTxt) throws IOException {
		String mensaje = "";
		File fileExamin = new File(pathExaminar);
		File rutafileSalida = new File(pathTxt);
		File fileSalida = new File(rutafileSalida, nombreTxt);
		FileWriter writer = new FileWriter(fileSalida, true);
		BufferedWriter bufferW = new BufferedWriter(writer);
		if (!fileExamin.exists()) {
				mensaje = "La ruta" + fileExamin.getAbsolutePath() + "no existe";
		} else {
			if (!fileExamin.isDirectory()) {
				String lastModified = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss")
						.format(new Date(fileExamin.lastModified()));
				try {
					bufferW.write("Fichero F: " + fileExamin.getName() + ". Ultima modificacion: " + lastModified);
					mensaje = "Resultado guardado en archivo txt: " + fileSalida.getName();
				} catch (IOException e) {
					System.out.println("Error al escribir la linea");
				}
			} else {
				recorrerD(fileExamin, fileSalida, bufferW);
				mensaje = "Resultado guardado en archivo txt: " + fileSalida.getName();
			}
		}
		bufferW.close();
		writer.close();
		return mensaje;
	}

	public static void recorrerD(File fileExamin, File fileSalida, BufferedWriter bufferW) throws IOException {

		String lastModified = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(fileExamin.lastModified()));
		try {
			bufferW.write("Fichero D: " + fileExamin.getName() + ". Ultima modificacion: " + lastModified + "\n");
		} catch (IOException e) {
			System.out.println("Error al escribir linea");
		}
		File[] subfiles = fileExamin.listFiles();
		for (File s : subfiles) {
			if (s.isFile()) {
				String lastModified2 = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(s.lastModified()));
				try {
					bufferW.write("Fichero F: " + s.getName() + ". Ultima modificacion: " + lastModified2 + "\n");
				} catch (IOException e) {
					System.out.println("Error al escribir linea");
				}
			}
		}
		for (File s : subfiles) {
			if (s.isDirectory()) {
				recorrerD(s, fileSalida, bufferW);
			}
		}
	}
}
