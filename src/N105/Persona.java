package N105;

import java.sql.Date;
import java.io.Serializable;

/**
 * Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després
 * l’ha de desserialitzar.
 *
 */

public class Persona implements Serializable { //al implementar interfaz serializable, el objecto es serializable

	//Attributes
	private String nombre;
	private String apellidos;
	private String dNI;
	private Date nacimiento;
	private String pais;
	private int edad;
	private static final long serialVersionUID = 1L;
	
	//Constructor
	public Persona(String nombre, String apellidos, String dNI) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dNI = dNI;
	}

	//getters/setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + ". Apellidos: " + this.apellidos + ". DNI: " + this.dNI;
	}
	
	
	
	
	
}
