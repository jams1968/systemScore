package models;

import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.table.DefaultTableModel;

import services.Funciones;
import services.SqlComands;

public class Professor extends Person {
	private int id;
	private String username;
	private String password;
	private char status;
	private int people_id;
	private Pattern patronLetras,patronCorreo;
	private Matcher validarLetras,validarCorreo;
	private Funciones funcion;
	private DefaultTableModel modeloTablaProfesor;
	
	public Professor() {
		super();
		patronLetras = Pattern.compile("[^A-Za-z. ]");
		patronCorreo=Pattern.compile("[A-Za-z0-9]+@[a-z]+\\.[a-z]+");
		funcion = new Funciones();
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public char getStatus() {
		return status;
	}
	
	public int getPeopleid(){
		return people_id;
	}

	
	public DefaultTableModel getModeloTablaProfesor() {
		return modeloTablaProfesor;
	}

	public void setModeloTablaProfesor(DefaultTableModel modeloTablaProfesor) {
		this.modeloTablaProfesor = modeloTablaProfesor;
	}

	//----------------------> 
	public void setId(int id) {
		this.id = id;
	}

	public boolean setUsername(String username) {
		
		if(username.isEmpty())
			return false;
		else {
			this.username = username;
			return true;
		}
		
		
	}

	public boolean setPassword(String password) {
		if(password.isEmpty())
			return false;
		else {
			this.password = funcion.encrypt(password);
			return true;
		}
	}

	
	public void setStatus(char status) {
		this.status = status;
	}
	public void setPeopleId(int people_id){
		this.people_id = people_id;
	}

	

	//---------->read cedula<-------------
	public boolean readCedula(){
				
		String sentenciaSql = "select * from professors A join people B on A.people_id = B.id where identification ='"+ 
				this.getCedula()+"'";
		
		SqlComands command = new SqlComands();
		command.conection("notas","data.db");
		
		ResultSet consulta = command.sqlRecordQuery(sentenciaSql);
		

		try {
		
			while(consulta.next()){
				this.setId(consulta.getInt(1));
				this.setUsername(consulta.getString(2).trim());
				this.setPassword(funcion.decrypt(consulta.getString(3).trim()));
				this.setPeopleId(consulta.getInt(4));
				this.setStatus(consulta.getString(5).trim().charAt(0));
				this.setPeopleId(consulta.getInt(6));
				this.setCedula(consulta.getString(7).trim());
				this.setNombres(consulta.getString(8).trim());
				this.setApellidos(consulta.getString(9).trim());
				this.setGenero(consulta.getString(10).trim());
				this.setTelefono(consulta.getString(11).trim());
				this.setEmail(consulta.getString(12).trim());
				this.setStatus(consulta.getString(13).trim().charAt(0));
				
				
				
			}
		} catch (Exception e) {
			
		}
		
		command.disconnect();
		
		if(this.getId()==0)
			return false;
		else 
			return true;
		
	}
	//---------->read username<--DefaultTableModel model-----------
	public boolean readUsername(){
				
		String sentenciaSql = "select * from professors A join people B on A.people_id = B.id where identification ='"+ 
				this.getUsername()+"'";
		
		SqlComands command = new SqlComands();
		command.conection("notas","data.db");
		
		ResultSet consulta = command.sqlRecordQuery(sentenciaSql);
		

		try {
		
			while(consulta.next()){
				this.setId(consulta.getInt(1));
				this.setUsername(consulta.getString(2).trim());
				this.setPassword(funcion.decrypt(consulta.getString(3).trim()));
				this.setPeopleId(consulta.getInt(4));
				this.setStatus(consulta.getString(5).trim().charAt(0));
				this.setPeopleId(consulta.getInt(6));
				this.setCedula(consulta.getString(7).trim());
				this.setNombres(consulta.getString(8).trim());
				this.setApellidos(consulta.getString(9).trim());
				this.setGenero(consulta.getString(10).trim());
				this.setTelefono(consulta.getString(11).trim());
				this.setEmail(consulta.getString(12).trim());
				this.setStatus(consulta.getString(13).trim().charAt(0));
				
				
				
			}
		} catch (Exception e) {
			
		}
		
		command.disconnect();
		
		if(this.getId()==0)
			return false;
		else 
			return true;
		
	}
	//---------->read tabla profesores<-------------
	public void readTable(DefaultTableModel model){
		
	
				
		String sentenciaSql = "select * from professors A join people B on A.people_id = B.id ";
		
		SqlComands command = new SqlComands();
		command.conection("notas","data.db");
		
		ResultSet consulta = command.sqlRecordQuery(sentenciaSql);
		
		int ncolumnas=model.getColumnCount();
		
		int c=0;

		try {
		
			while(consulta.next()){
				this.setId(consulta.getInt(1));
				this.setUsername(consulta.getString(2).trim());
				this.setPassword(funcion.decrypt(consulta.getString(3).trim()));
				this.setPeopleId(consulta.getInt(4));
				this.setStatus(consulta.getString(5).trim().charAt(0));
				this.setPeopleId(consulta.getInt(6));
				this.setCedula(consulta.getString(7).trim());
				this.setNombres(consulta.getString(8).trim());
				this.setApellidos(consulta.getString(9).trim());
				this.setGenero(consulta.getString(10).trim());
				this.setTelefono(consulta.getString(11).trim());
				this.setEmail(consulta.getString(12).trim());
				this.setStatus(consulta.getString(13).trim().charAt(0));
				
				c++;
				Object[] fila = new Object[ncolumnas];
				//fila = new Object[6];
				fila[0] = c;
				fila[1] = this.getCedula(); 
				fila[2] = this.getNombres(); 
				fila[3] = this.getApellidos(); 
				
				
				// es para cargar los datos en filas a la tabla modelo
				model.addRow(fila);
				
				
			}
		} catch (Exception e) {
			
		}
		
		command.disconnect();
		
	
		
	}
		
	
	@Override
	public String toString() {
		return "\nUsuario:"
				+"\nUser Id" + getId()
				+"\nUsername:"+ getUsername()
				+"\nClave: "+getPassword()
				+"\nPeople Id:" + getPeopleid()
				+ "\nPersona :"
				+ "\nid= " + getId()
				+ "\nCedula= " +getCedula()
				+ "\nNombres=" +getNombres()
				+ "\nApellidos= " + getApellidos()
				+ "\nSexo= "+ getGenero()
				+"\nTelefono= "+ getTelefono()
				+"\nCorreo= " + getEmail() 
				+"\nStatus= "+ getStatus();
	}
	
	
	

}
