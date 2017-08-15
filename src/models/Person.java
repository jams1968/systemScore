/*************************************************************
 * Program: Person.java
 * Objet: modelo y crud de la clase person
 * Version: 1.0
 * Author: Jairo Molina
 * Email: jairounerg@gmail.com
 * Phone: 58+ (0416) 942-12-12
 ************************************************************/

package models;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import services.Funciones;

import java.util.regex.Pattern;

public class Person {
	private int id;
	private String cedula;
	private String nombres;
	private String apellidos;
	private char genero;
	private String telefono;
	private String email;
	private char status;
	private int userId;
	// para validar rango de numeros y letras
	private Pattern patronLetras,patronCorreo,patronNumeros,patronTelefono;
	private Matcher validarLetras,validarCorreo,validarNumeros,validarTelefono;
	private Funciones funcion;
	
	//-------------------> constructor<---------------------
	public Person() {
		super();
		patronLetras = Pattern.compile("[^A-Za-z. ]");
		patronCorreo=Pattern.compile("[A-Za-z0-9]+@[a-z]+\\.[a-z]+");
		patronNumeros= Pattern.compile("[^0-9]");
		patronTelefono=Pattern.compile("");
		funcion = new Funciones();
	}
	
	
	public Person(int id, String cedula, String nombres, String apellidos, char genero, String fechaNacimiento,
			String telefono, String email, char status) {
		//super();
		
		funcion = new Funciones();
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
		this.telefono = telefono;
		this.email = email;
		this.status = status;
		this.patronLetras = patronLetras;
		this.patronCorreo = patronCorreo;
		this.validarLetras = validarLetras;
		this.validarCorreo = validarCorreo;
		this.funcion = funcion;
		
		
	}


	//------------------>setter<-------------------
	
	public void setId(int id) {
		this.id = id;
	}

	public boolean setCedula(String cedula) {
		validarNumeros = patronNumeros.matcher(cedula.trim());
		if(cedula.isEmpty()){
			return false;
		}
		else if(!validarNumeros.find()){
			this.cedula=cedula;
			return true;
		}
		else
			return false;
		
	}

	public boolean setNombres(String nombres) {
		
		validarLetras = patronLetras.matcher(nombres.trim());	
		if(nombres.isEmpty())
			return false;
		else if(!validarLetras.find()){
			this.nombres = nombres.toUpperCase();
			return true;
		}
		else
			return false;
	}

	public boolean setApellidos(String apellidos) {
		validarLetras = patronLetras.matcher(apellidos.trim());	
		if(apellidos.isEmpty())
			return false;
		else if(!validarLetras.find()){
			this.apellidos = apellidos.toUpperCase();
			return true;
		}
		else
			return false;
	}

	public boolean setGenero(String value) {
		char xgenero = value.toUpperCase().charAt(0);
		if(xgenero == ' ')
			return false;
		else{
			this.genero = xgenero;
			return true;
		}
	}

	
	public boolean setTelefono(String telefono) {
		validarNumeros = patronNumeros.matcher(telefono.trim());
		if(telefono.isEmpty())
			return false;
		else if(validarNumeros.find()){
			this.telefono=telefono;
			return true;
		}else
			return false;
	}

	public boolean setEmail(String email) {
		
		validarCorreo = patronCorreo.matcher(email.trim());
		if(email.isEmpty())
			return false;
		else if(validarCorreo.find()){
			this.email=email;
			return true;
		}else
			return false;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	
	public void setUserId(int userId){
		this.userId = userId;
	}

	//-------->getter<----------------------
	public int getId() {
		return id;
	}
	//-------->getter<----------------------
	public String getCedula() {
		return cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getGenero() {
		if(this.genero == 'F')
			return "Femenino";
		else
			return "Masculino";
	}

	public String getTelefono(){
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public char getStatus() {
		return status;
	}
	
	public int getUserId(){
		return this.userId;
	}

	@Override
	public String toString() {
		return "Persona :"
				+ "\nid= " + getId()
				+ "\nCedula= " + getCedula()
				+ "\nNombres=" + getNombres()
				+ "\nApellidos= " + getApellidos()
				+ "\nSexo= "+ getGenero()
				+"\nTelefono= "+ getTelefono()
				+"\nCorreo= " + getEmail() 
				+"\nStatus= "+ getStatus();
		
	}

	
	
}
