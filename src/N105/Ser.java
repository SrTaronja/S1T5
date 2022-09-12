package N105;

/**
 * Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després
 * l’ha de desserialitzar.
 *
 */

import java.io.*;

public class Ser {

	public Ser() {
		
	}

	public void serializacion(String archivoSalida, Object objectSal) throws IOException {

		//flujo de salida
		//Objeto archivo para enviar stream a archivo
		FileOutputStream fileSalida;
		//Objeto salida stream para serializar objetos
		ObjectOutputStream objectSalida; 
		// creacion de archivo stream salida con path de archivo a crear.
		fileSalida = new FileOutputStream(archivoSalida); 
		// creacion objeto stream salida en el archivo stream salida
		objectSalida = new ObjectOutputStream(fileSalida); 
		//Escritura de objetos serializables en objeto stream salida.
		objectSalida.writeObject(objectSal);
		//Cerrar flujos
		objectSalida.close();
		fileSalida.close();
	}

	public Object desSerializacion(String archivoEntrada) throws IOException, ClassNotFoundException {
		
		//flujo de entrada
		//Objeto archivo para leer stream de archivo
		FileInputStream fileEntrada;
		//Objeto entrada stream para deserializar objetos
		ObjectInputStream objectEntrada;
		// creacion de archivo stream entrada con path del archivo existente
		fileEntrada = new FileInputStream(archivoEntrada);
		//creacion de objeto stream entrada en el archivo stream entrada
		objectEntrada = new ObjectInputStream(fileEntrada);
		//Lectura de objetos serializados en objeto stream entrada
		Object objectEnt = objectEntrada.readObject();
		//Cerrar flujos
		fileEntrada.close();
		objectEntrada.close();
		return objectEnt;
	}
}