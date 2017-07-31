package services;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class DataBaseConection {
	
	protected String urlDB = null;
	protected String usuario="root";
	protected String clave = "";
	protected String nombreDB = "data.db";
	
	//variables para la conexion
	protected java.sql.Connection con= null;
	protected java.sql.Statement stm=null;
	//protected PreparedStatement pstm = null;
	protected ResultSet resultadoConsulta = null;
	
	//----------->constructor<------------
		public DataBaseConection(){
			try{
				// carga el driver
			
				Class.forName("org.sqlite.JDBC");
				
				
			}catch(ClassNotFoundException e){
					JOptionPane.showMessageDialog
					(null,"Problemas con el Driver",null,0);
			}
		}//fin del conector
		
	//-------------->conectar Base de Datos <-------------------- 
		public boolean conection(String carpeta,String db){
			nombreDB = db;
			Funciones funcion=new Funciones();
		//	urlDB = "jdbc:sqlite:"+funcion.getPath()+"/"+carpeta+"/"+nombreDB;
		urlDB = "jdbc:sqlite:"+nombreDB;

			
			/*if(!(funcion.checkFolder("notas") && funcion.checkFile("notas", "data.db")))
				JOptionPane.showMessageDialog(null, "No existe la base datos, se creara");*/
			
			

			boolean salida = false;
				try{
					//con = DriverManager.getConnection("jdbc:sqlite:sistemanotas.db");
					con = DriverManager.getConnection(urlDB);
					//JOptionPane.showMessageDialog(null, "conectado");
					salida = true;
				}catch(SQLException e){
					JOptionPane.showMessageDialog(null, "No  conectado");
					
				}
				return salida;
			}//fin contection
		
		//--------------> desconectar Base de Datos <-------------------- 
		public boolean disconnect(){
			boolean salida = false;
			try{
				con.close();
					
				salida = true;
					
			}catch(SQLException e){
					
				
			}
			return salida;
		}
}//fin clase
