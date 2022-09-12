package N105;

import java.io.IOException;

/**
 * Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després
 * l’ha de desserialitzar.
 *
 */

public class MainT5N105 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// los argumentos estan indicados en /Run Configurations/ Arguments

		if (args.length != 5) {
			System.out.println("numero invalido de argumentos. Son 5 argumentos");
		} else {
			String nombre = args[0];
			String apellidos = args[1];
			String dNI = args[3];
			String archivoSalida = args[4];
			String archivoEntrada = args[4];
			Persona persona1 = new Persona(nombre, apellidos, dNI);
			Ser s = new Ser();
			s.serializacion(archivoSalida, persona1);
			Persona persona2 = (Persona) s.desSerializacion(archivoEntrada);
			System.out.println(persona2.toString());
		}

	}
}
