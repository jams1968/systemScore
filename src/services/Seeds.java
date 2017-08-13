package services;

import javax.swing.JOptionPane;

public class Seeds {
	SqlComands command;
	Funciones funcion;
	
	public Seeds(){
		super();
		this.command = new SqlComands();
		this.funcion = new Funciones();
	}
	
	//-----------------------> Datos Persons <-------------------------
	public void PeopleSeeder(){
		String sentenciaSql=
				"INSERT INTO people "
				+	"(identification, first_name,last_name,gender,telephone,email) VALUES"
				+	"(6331034,'JAIRO A.','MOLINA S.','M','0416-9421212','profesor@jairomolina.com.ve'),"
				+ 	"(12345678,'JOSE L.','BERROTERAN N.','M','0416-9421212','jberroteran@unerg.edu.ve'),"
				+ 	"(23456789,'JACKSON','GARCIA','M','0426-8548367','jgarcia@unerg.edu.ve'),"
				+ 	"(78901234,'ERICK','SISSO','M','0426-8548367','esisso@unerg.edu.ve'),"
				+ 	"(34567890,'LUHERIS','SALAS','F','0426-8548367','lsalas@unerg.edu.ve'),"
				+	"(45678901,'WILLIAMS','CORTEZ','M','0416-9840180','wcortez@unerg.edu.ve'),"
				+	"(56789012,'ADRIANA','URBAEZ','F','0416-9840180','aurbaez@unerg.edu.ve'),"
				+	"(67890123,'JHONNY','GABAZUT','M','0416-9840180','jgabazut@unerg.edu.ve')";

		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
	//-----------------------> Datos Universitys <-------------------------
	public void UniversitysSeeder(){
		String sentenciaSql=
				"INSERT INTO universitys "
				+	"(code, university,person_id, status) VALUES"
				+	"('123','UNIVERSIDAD ROMULO GALLEGOS',2,'A');";

		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
	
	//-----------------------> Datos Careers <-------------------------
	public void CareersSeeder(){
		String sentenciaSql=
				"INSERT INTO careers "
				+	"(code, career,university_id,person_id, status) VALUES"
				+	"('601','INGENIERIA EN INFORMATICA',1,3,'A');";
	
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
	
//-----------------------> Datos Directions <-------------------------
	public void DirectionsSeeder(){
		String sentenciaSql=
				"INSERT INTO directions "
				+	"(code, direction,career_id,person_id, status) VALUES"
				+	"('1','DIRECCION ESTUDIOS BASICOS',1,4,'A'),"	
				+	"('2','DIRECCION ING EN INFORMATICA',1,5,'A');";

		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
//-----------------------> Datos Departaments <-------------------------
	public void DepartamentsSeeder(){
		String sentenciaSql=
				"INSERT INTO departaments "
				+	"(code, departament,direction_id,person_id, status) VALUES"
				+	"('1','CIENCIAS BASICAS',1,7,'A'),"	
				+	"('2','ESTUDIOS GENERALES',1,8,'A'),"
				+	"('3','CIENCIAnPersonsS DE LA COMPUTACION',2,1,'A'),"
				+	"('4','FORMACION PROFESIONAL',2,6,'A');";
	
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
//-----------------------> Datos Levels <-------------------------
	public void LevelsSeeder(){
		String sentenciaSql=
				"INSERT INTO levels "
				+	"(level) VALUES"
				+	"('I'),"
				+	"('II'),"
				+	"('III'),"
				+	"('IV'),"
				+	"('V'),"
				+	"('VI'),"
				+	"('VII'),"
				+	"('VIII'),"
				+	"('IX'),"				
				+	"('X');";
	
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
//-----------------------> Datos Levels <-------------------------
	public void SubjectsSeeder(){
		String sentenciaSql=
				"INSERT INTO subjects "
			+	"(code,subjects,level_id,credit_units,theory,practice,distance,person_id,departament_id,status) VALUES"+
			"('AC0001','ARTE Y CULTURA', 1, 2, 2, 0, 0,1, 2, 'A'),"+
			"('DP0001','DEPORTES', 1, 2, 0, 2, 0,2, 2, 'A'),"+
			"('EA','ELECTIVA DE AREA I', 8, 4, 2, 4, 0,3, 4, 'A'),"+
			"('EA0244','ELECTIVA DE AREA III', 10, 4, 2, 4, 0,4, 4, 'A'),"+
			"('EA9244','ELECTIVA DE AREA II', 9, 4, 2, 4, 0,5, 4, 'A'),"+
			"('EA9325', 'ELECTIVA LIBRE I', 9, 3, 3, 2, 0,6, 4, 'A'),"+
			"('EL', 'ELECTIVA LIBRE II', 10, 3, 3, 2, 0,7, 4, 'A'),"+
			"('IB2322', 'FÍSICA I', 2, 4, 3, 2, 0,8, 1, 'A'),"+
			"('IB3322', 'FÍSICA II', 3, 4, 3, 2, 0,1, 1, 'A'),"+
			"('IC1222', 'FUNDAMENTOS DE LA INFORMÁTICA', 1, 3, 2, 0, 0,2, 3, 'A'),"+
			"('IC2323', 'ALGORITMOS I', 2, 3, 3, 2, 0,3, 3, 'A'),"+
			"('IC3244', 'PROGRAMACIÓN I', 3, 4, 3, 3, 0,4, 3, 'A'),"+
			"('IC3323', 'ALGORITMOS II', 3, 3, 2, 2, 0,5, 3, 'A'),"+
			"('IC4244', 'PROGRAMACIÓN II', 4, 4, 3, 3, 0,6, 3, 'A'),"+
			"('IC5244', 'PROGRAMACIÓN III', 5, 4, 3, 3, 0,7, 3, 'A'),"+
			"('IC5422', 'ORGANIZACIÓN DEL COMPUTADOR', 5, 5, 4, 2, 0,8, 3, 'A'),"+
			"('IC6322', 'ARQUITECTURA DEL COMPUTADOR', 6, 4, 2, 3, 0,1, 3, 'A'),"+
			"('IC7322', 'SISTEMAS OPERATIVOS', 7, 4, 3, 2, 0,2, 3, 'A'),"+
			"('ID0221', 'GERENCIA DE PROYECTOS', 10, 3, 4, 2, 2,3, 4, 'A'),"+
			"('ID6124', 'INGENIERÍA ECONÓMICA', 6, 2, 1, 2, 0,4, 4, 'A'),"+
			"('ID6241', 'INVESTIGACIÓN DE OPERACIONES', 6, 4, 2, 4, 0,5, 4, 'A'),"+
			"('ID7322', 'CONTROL DE PROYECTOS', 7, 4, 3, 2, 0,6, 4, 'A'),"+
			"('ID7323', 'ORGANIZACIÓN Y GESTIÓN EMPRESARIAL', 7, 4, 3, 2, 0,7, 4, 'A'),"+
			"('ID8082', 'PASANTÍAS', 8, 4, 0, 0, 0,8, 4, 'A'),"+
			"('IH1124', 'LENGUAJE Y COMUNICACIÓN', 1, 2, 3, 0, 0,1, 2, 'A'),"+
			"('IH1125', 'INGLES I', 1, 2, 4, 0, 0,2, 2, 'A'),"+
			"('IH2124', 'PROBLEMÁTICA CIENTÍFICA Y TECNOLÓGICA', 2, 2, 2, 0, 0,3, 2, 'A'),"+
			"('IH2125', 'INGLES II', 2, 2, 1, 2, 0,4, 2, 'A'),"+
			"('IH3125', 'METODOLOGÍA Y TÉCNICA DE LA INVESTIGACIÓN', 3, 2, 1, 2, 0,5, 2, 'A'),"+
			"('IH9202', 'ÉTICA PROFESIONAL', 9, 2, 2, 0, 0,6, 4, 'A'),"+
			"('IM1223', 'LÓGICA MATEMÁTICA', 1, 3, 2, 3, 0,7, 1, 'A'),"+
			"('IM1421', 'MATEMÁTICA I', 1, 5, 3, 3, 0,8, 1, 'A'),"+
			"('IM2421', 'MATEMÁTICA II', 2, 5, 0, 6, 0,1, 1, 'A'),"+
			"('IM3421', 'MATEMÁTICA III', 3, 5, 2, 4, 0,2, 1, 'A'),"+
			"('IM4323', 'ESTRUCTURAS DISCRETAS I', 4, 4, 3, 2, 0,3, 1, 'A'),"+
			"('IM4421', 'MATEMÁTICA IV', 4, 5, 2, 4, 0,4, 1, 'A'),"+
			"('IM5221', 'ÁLGEBRA BOOLEANA', 5, 3, 2, 2, 0,5, 1, 'A'),"+
			"('IM5323', 'ESTRUCTUnPersonsRAS DISCRETAS II', 5, 4, 3, 2, 0,6, 1, 'A'),"+
			"('IM5421', 'PROBABILIDAD Y ESTADÍSTICA', 4, 3, 2, 2, 0,7, 1, 'A'),"+
			"('IM6243', 'MÉTODOS NUMÉRICOS', 6, 4, 2, 4, 0,8, 1, 'A'),"+
			"('IME320', 'ELECTIVA I', 2, 2, 2, 0, 0,1, 2, 'A'),"+
			"('IME520', 'ELECTIVA II', 3, 2, 0, 2, 0, 2,2, 'A'),"+
			"('IME720', 'ELECTIVA III', 4, 2, 2, 0, 0,3, 3, 'A'),"+
			"('IMEIV', 'ELECTIVA IV', 5, 2, 2, 0, 0,4, 3, 'A'),"+
			"('IMEV', 'ELECTIVA V', 6, 2, 2, 0, 0,5, 3, 'A'),"+
			"('IS0222', 'INFORMÁTICA EDUCATIVA', 10, 3, 2, 2, 0,6, 4, 'A'),"+
			"('IS4225', 'BASE DE DATOS', 4, 3, 2, 2, 0,7, 4, 'A'),"+
			"('IS5205', 'TEORIA GENERAL DE SISTEMAS', 5, 5, 4, 2, 0,8, 4, 'A'),"+
			"('IS6425', 'SISTEMAS DE INFORMACIÓN I', 6, 5, 4, 2, 0,1, 4, 'A'),"+
			"('IS7244', 'TRADUCTORES E INTÉRPRETES', 7, 4, 2, 4, 0, 2,3, 'A'),"+
			"('IS7324S', 'SISTEMAS DE INFORMACIÓN II', 7, 5, 4, 2, 0, 3,4, 'A'),"+
			"('IS8243', 'LENGUAJES DE PROGRAMACIÓN', 8, 4, 2, 4, 0, 4,3, 'A'),"+
			"('IS8424', 'SISTEMAS DE INFORMACIÓN III', 8, 5, 4, 2, 0, 5,4, 'A'),"+
			"('IT8241', 'REDES', 8, 4, 2, 3, 0,6, 4, 'A'),"+
			"('IT9241', 'SISTEMAS DISTRIBUIDOS', 9, 4, 2, 4, 0,7, 4, 'A'),"+
			"('PG0083', 'PROYECTO DE GRADO II', 10, 4, 3, 0, 3,8, 4, 'A'),"+
			"('PG9083', 'PROYECTO DE GRADO I', 9, 4, 3, 0, 3,1, 4, 'A');";
		
		
		
	
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
		
	}//FIN
	//-----------------------> Datos professors <-------------------------
		public void ProfessorsSeeder(){
			String clave ="jams6331034";
			String encriptada= funcion.encrypt(clave);
			
					
			String sentenciaSql=
					"INSERT INTO professors "
					+	"(username,password,people_id,status) VALUES"
					+	"('jams', '"+encriptada+"', 1,'A'),"
					+	"('berro', '"+encriptada+"', 2,'A'),"
					+	"('jackson', '"+encriptada+"', 3,'A');";
		
			
			this.command.conection("notas","data.db");
			if(this.command.sqlExecute(sentenciaSql))
				;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
			else
				JOptionPane.showMessageDialog(null, "no se creo tabla");
			
			this.command.disconnect();
			
		}//FIN
}//fin
