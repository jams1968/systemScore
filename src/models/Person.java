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
	private String identification;
	private String firstName;
	private String lastName;
	private char gender;
	private String birthDate;
	private String telephone;
	private String email;
	private char status;
	// para validar rango de numeros y letras
	private Pattern patronLetras,patronCorreo;
	private Matcher validarLetras,validarCorreo;
	private Funciones funcion;
	
	//-------------------> constructor<---------------------
	public Person() {
		super();
		patronLetras = Pattern.compile("[^A-Za-z. ]");
		patronCorreo = Pattern.compile("[A-Za-z0isEmpty-9]+@[a-z]+\\.[a-z]+");
		funcion = new Funciones();
	}
	
	
	public Person(int id, String identification, String firstName, String lastName, char gender, String birthDate,
			String telephone, String email, char status) {
		//super();
		
		funcion = new Funciones();
		this.id = id;
		this.identification = identification;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.telephone = telephone;
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

	public boolean setIdentification(String identification) {
		
		if(identification.isEmpty()){
			return false;
		}
		else{
			this.identification=identification;
			return true;
		}
		
	}

	public boolean setFirstName(String firstName) {
		
		validarLetras = patronLetras.matcher(firstName.trim());	
		if(firstName.isEmpty())
			return false;
		else if(!validarLetras.find()){
			this.firstName = firstName.toUpperCase();
			return true;
		}
		else
			return false;
	}

	public boolean setLastName(String lastName) {
		validarLetras = patronLetras.matcher(lastName.trim());	
		if(lastName.isEmpty())
			return false;
		else if(!validarLetras.find()){
			this.lastName = lastName.toUpperCase();
			return true;
		}
		else
			return false;
	}

	public boolean setGender(String value) {
		char xGender = value.toUpperCase().charAt(0);
		if(xGender == ' ')
			return false;
		else{
			this.gender = xGender;
			return true;
		}
	}

	public boolean setBirthDate(String birthDate) {
		if(birthDate.isEmpty())
			return false;
		else{
			this.birthDate=birthDate;
			return true;
		}
	}

	public boolean setTelephone(String telephone) {
	
		if(telephone.isEmpty())
			return false;
		else{
			this.telephone = telephone;
			return true;
		}
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

	//-------->getter<----------------------
	public int getId() {
		return id;
	}
	//-------->getter<----------------------
	public String getIdentification() {
		return identification;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		if(this.gender == 'F')
			return "Femenino";
		else
			return "Masculino";
	}

	public String getBirthDate() {
		String xFecha = funcion.changeDateVen(birthDate);
		return xFecha;
	}

	public String getTelephone(){
		return telephone;
	}

	public String getEmail() {
		return email;
	}

	public char getStatus() {
		return status;
	}
	public int getAge(){
		return (funcion.getAge(funcion.changeDateVen(birthDate)));
	}

	@Override
	public String toString() {
		return "Persona :"
				+ "\nid= " + getId()
				+ "\nCedula= " + getIdentification()
				+ "\nNombres=" + getFirstName()
				+ "\nApellidos= " + getLastName()
				+ "\nSexo= "+ getGender()
				+"\nFecha Nacimiento= "+ getBirthDate()
				+"\nEdad= "+ getAge()
				+"\nTelefono= "+ getTelephone()
				+"\nCorreo= " + getEmail() 
				+"\nStatus= "+ getStatus();
		
	}

	
	
}
