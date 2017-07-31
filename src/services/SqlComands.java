package services;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlComands extends DataBaseConection{

	public SqlComands() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//-----------------------------------> consultas de registro<--------------------------
	public ResultSet sqlRecordQuery(String codigoSql){
		this.resultadoConsulta=null;
		try {
			stm = con.createStatement();
			resultadoConsulta=stm.executeQuery(codigoSql);        
				
		} catch (Exception e) {

		}
			
		return resultadoConsulta;
		
	}//fin consulta
	//----------------> agregar Registro<-------------
	public boolean sqlExecute(String codigoSql){
			
		try{
			stm =  con.createStatement();
			stm.executeUpdate(codigoSql);
			return true;
		}catch (SQLException e) {
				System.out.println(e);
		}
			
			return false;

	}
	

}//fin clase
