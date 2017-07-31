/*************************************************************
 * Program: Funciones.java
 * Objet: libreria de funciones de utilerias
 * Version: 1.0
 * Author: Jairo Molina
 * Email: jairounerg@gmail.com
 * Phone: 58+ (0416) 942-12-12
 ************************************************************/

package services;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Funciones {
	
	//----------> calculo de edad <-------------------
	public int getAge(String fecha){
		int tiempo;
		Calendar fechaActual = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		String  hoy = formato.format(fechaActual.getTime());
		String[]datos= hoy.split("/");
		int yearHoy = Integer.parseInt(datos[2]);
		int mesHoy = Integer.parseInt(datos[1])-1;
		int diaHoy = Integer.parseInt(datos[0]);
		
		datos= fecha.split("/");
		int yearNac = Integer.parseInt(datos[2]);
		int mesNac = Integer.parseInt(datos[1])-1;
		int diaNac = Integer.parseInt(datos[0]);
		
		tiempo=yearHoy-yearNac;
		if(mesNac > mesHoy)
			tiempo--;
		else if((mesNac==mesHoy)&&(diaNac>diaHoy))
			tiempo--;
		
		
		return tiempo;
	}//fin funcion
	
	//--------------->cambiar fecha a USA<-------------------
	public String changeDateUSA(String xFecha){
		String[] dat1= xFecha.split("/");
		String dia,mes,year;
		mes=dat1[1];
		dia=dat1[0];
		year=dat1[2];
		String fecha2=year+"-"+mes+"-"+dia;
		
		return fecha2;
		
	}
	//--------------->cambiar fecha a Ven<-------------------
	public String changeDateVen(String xFecha){
		
		String[] dat1= xFecha.split("-");
		String dia,mes,anno;
		mes=dat1[1];
		dia=dat1[2];
		anno=dat1[0];
		String fecha2=dia+"/"+mes+"/"+anno;
		
		
		return fecha2;
		
	}
	
	//---------> chequear directorio y crea <-----------------------
	public boolean checkFolder(String carpeta){
		String path = getPath()+"/";
		
		File folder = new File(path+carpeta);
	
		if (!folder.isDirectory()){
			folder.mkdir();
			return false;
		}
		else 
			return true;
	}
	//---------> chequear base datos <-----------------------
	public boolean checkFile(String carpeta, String bd){
		String path = (getPath()+"/"+carpeta+"/"+bd);
		
		
		File file = new File(path);
		
		if (!file.isFile()){
			
			return false;
		}
		else
			return true;
	}
	//----------------->obtener ruta del path<---------------------
	public String getPath(){
		
		String[] elems = System.getProperty("java.class.path").split(File.pathSeparator);
		//JOptionPane.showMessageDialog(null, elems);
		//File location = new File(".").getAbsoluteFile();
		File executable = null;
		for (String s : elems) {
		  if (s.endsWith("salida.jar")) {
			  executable = new File(s);
		    break;
		  }
		}
		
		
		return executable.getParent();
	}
	//-----------------> nombre sistema operativo <--------------
	
	public String getOperatingSystem(){
		return System.getProperty("os.name");
	}
//--------------_>metodo para encriptar<-----------
	public String encrypt(String xCadena){
		String salida;
		xCadena=xCadena.trim();
		int[] valor=new int[xCadena.length()+1];
		int aleatorio=(int) (Math.random()*9)+1; // Generación de número aleatorio
		char devolverCadena;
		
		//Convertir a ASCII
		
		valor[0]=aleatorio;
		for(int i=0;i<xCadena.length();i++){
			valor[i+1]=(xCadena.charAt(i))+aleatorio;
			
		}
		valor[xCadena.length()]=(xCadena.charAt(xCadena.length()-1))+aleatorio;
		
	
		salida=String.valueOf(valor[0]);
		
		for(int i=1;i<valor.length;i++){
			devolverCadena=(char)valor[i];
			salida+=devolverCadena;
		}
		salida=salida.trim();
		return salida;
		
	}
	//-------------_> desencriptar<--------------
	public String decrypt(String xCadena){
		String salida=null;
		xCadena=xCadena.trim();
		int[] valor=new int[xCadena.length()-1];
		int aleatorio=Integer.parseInt(xCadena.substring(0,1));//aleatorio
		char devolverCadena;
		
		//Convertir en ASCII"
	
		for(int i=1;i<xCadena.length();i++){
			valor[i-1]=(xCadena.charAt(i))-aleatorio;
		}
		
		
		for(int i=0;i<valor.length;i++){
			if(i==0) salida=String.valueOf((char)valor[i]);
			else{
				salida+=(char)valor[i];
			}
			
		}
		salida=salida.trim();
		return salida;
		
	}	
		


}//fin clase
