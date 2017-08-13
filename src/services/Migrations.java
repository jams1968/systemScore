package services;

import javax.swing.JOptionPane;

public class Migrations {
	SqlComands command;
	
	
	public Migrations() {
		super();
		this.command = new SqlComands();
		// TODO Auto-generated constructor stub
	}

	//-----------------> table Persons <-------------------------
	public void tablePeople(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   people("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"identification varchar(20) NOT NULL UNIQUE,"+
					"first_name varchar(60) NOT NULL,"+
					"last_name varchar(60) NOT NULL, "+
					"gender varchar(1) NOT NULL DEFAULT NULL,"+
					"telephone varchar(20),"+
					"email varchar(60) NOT NULL UNIQUE,"+
					"status varchar(1) NOT NULL DEFAULT 'A');";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla persons");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin persons
	
//--------------------_> table Universitys <---------------------------
	public void tableUniversitys(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   universitys("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"code varchar(20) NOT NULL UNIQUE,"+
					"university varchar(255) NOT NULL,"+
					"person_id integer NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(person_id) REFERENCES persons(id));";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla universitys");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin universitys
	
	//-----------------------> table Careers <-------------------------
	public void tableCareers(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   careers("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"code varchar(20) NOT NULL UNIQUE,"+
					"career varchar(255) NOT NULL,"+
					"university_id integer not null,"+
					"person_id integer NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(person_id) REFERENCES persons(id),"+
					"FOREIGN KEY(university_id) REFERENCES universitys(id));";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla Careers");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin careers
	
	//-----------------------> table Directions <-------------------------
		public void tableDirections(){
			String sentenciaSql=
				"CREATE TABLE IF NOT EXISTS   directions("+
						"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
						"code varchar(20) NOT NULL UNIQUE,"+
						"direction varchar(255) NOT NULL,"+
						"career_id integer NOT NULL,"+
						"person_id integer not null,"+
						"status varchar(1) NOT NULL DEFAULT 'A',"+
						"FOREIGN KEY(person_id) REFERENCES persons(id),"+
						"FOREIGN KEY(career_id) REFERENCES careers(id));";
			
			this.command.conection("notas","data.db");
			if(this.command.sqlExecute(sentenciaSql))
				;//JOptionPane.showMessageDialog(null, "creada tabla Directors");
			else
				JOptionPane.showMessageDialog(null, "no se creo tabla");
			
			this.command.disconnect();
		}//fin directors
	
		//-----------------------> table Departaments <-------------------------
		public void tableDepartaments(){
			String sentenciaSql=
				"CREATE TABLE IF NOT EXISTS   departaments("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"code varchar(20) NOT NULL UNIQUE,"+
					"departament varchar(255) NOT NULL,"+
					"direction_id integer not null,"+
					"person_id integer NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(person_id) REFERENCES persons(id),"+
					"FOREIGN KEY(direction_id) REFERENCES directions(id));";
					
			this.command.conection("notas","data.db");
			if(this.command.sqlExecute(sentenciaSql))
				;//JOptionPane.showMessageDialog(null, "creada tabla Departaments");
			else
				JOptionPane.showMessageDialog(null, "no se creo tabla");
					
			this.command.disconnect();
		}//fin departaments
	
		//-----------------------> table levels <-------------------------
		public void tableLevels(){
			String sentenciaSql=
				"CREATE TABLE IF NOT EXISTS   levels("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"level varchar(20) NOT NULL UNIQUE);";
							
			this.command.conection("notas","data.db");
			if(this.command.sqlExecute(sentenciaSql))
				;//JOptionPane.showMessageDialog(null, "creada tabla levels");
			else
				JOptionPane.showMessageDialog(null, "no se creo tabla");
							
			this.command.disconnect();
		}//fin levels
		
	//-----------------------> table subjects <-------------------------
	public void tableSubjects(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   subjects("+
				"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
				"code varchar(20) NOT NULL UNIQUE,"+
				"subjects varchar(255) NOT NULL,"+
				"level_id integer not null,"+
				"credit_units integer not null,"+
				"theory integer not null,"+
				"practice integer not null,"+
				"distance integer not null,"+
				"person_id integer NOT NULL,"+
				"departament_id integer not null,"+
				"status varchar(1) NOT NULL DEFAULT 'A',"+
				"FOREIGN KEY(level_id) REFERENCES levels(id),"+
				"FOREIGN KEY(person_id) REFERENCES persons(id),"+
				"FOREIGN KEY(departament_id) REFERENCES departaments(id));";
						
			this.command.conection("notas","data.db");
			if(this.command.sqlExecute(sentenciaSql))
				;//JOptionPane.showMessageDialog(null, "creada tabla Subjects");
			else
				JOptionPane.showMessageDialog(null, "no se creo tabla");
						
			this.command.disconnect();
		}//fin subjects

	//-----------------------> table sections <-------------------------
	public void tableSections(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   sections("+
				"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
				"section varchar(20) NOT NULL UNIQUE);";
								
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla sections");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
								
		this.command.disconnect();
	}//fin sections

//-----------------------> table students <-------------------------
	public void tableStudents(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   students("+
				"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
				"person_id integer not null,"+
				"FOREIGN KEY(person_id) REFERENCES persons(id));";
										
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla Students");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
										
		this.command.disconnect();
	}//fin students


	//-----------------------> table teaching_periods <-------------------------
	public void tableTeachingPeriods(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   teaching_periods("+
				"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
				"teaching_period integer not null,"+
				"status varchar(1) NOT NULL DEFAULT 'A');";
										
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla teaching_periods");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
										
		this.command.disconnect();
	}//fin teaching_periods

//-----------------------> table professors <-------------------------
	public void tableProfessors(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   professors("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"username varchar(20) NOT NULL UNIQUE,"+
					"password varchar(20) NOT NULL,"+
					"people_id integer NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(people_id) REFERENCES people(id));";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla professors");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin professors
	
//-----------------------> table evaluation_types <-------------------------
	public void tableEvaluationTypes(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   evaluation_types("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"type varchar(60) NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A');";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla evaluation_types");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin evaluation_types

//-----------------------> table courses <-------------------------
	public void tableCourses(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   courses("+
				"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
				"teaching_period_id integer NOT NULL,"+
				"subject_id integer not null,"+
				"section_id integer not null,"+
				"professor_id integer not null,"+
				"status varchar(1) NOT NULL DEFAULT 'A',"+
				"FOREIGN KEY(teaching_period_id) REFERENCES teaching_periods(id),"+
				"FOREIGN KEY(subject_id) REFERENCES subjects(id),"+
				"FOREIGN KEY(section_id) REFERENCES subsections(id),"+
				"FOREIGN KEY(professor_id) REFERENCES professors(id));";
						
			this.command.conection("notas","data.db");
			if(this.command.sqlExecute(sentenciaSql))
				;//JOptionPane.showMessageDialog(null, "creada tabla courses");
			else
				JOptionPane.showMessageDialog(null, "no se creo tabla");
						
			this.command.disconnect();
		}//fin courses
	
//-----------------------> table plannings <-------------------------
	public void tablePlannings(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   plannings("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"evaluation_type_id integer NOT NULL,"+
					"date_evaluation date NOT NULL,"+
					"percent double NOT NULL,"+
					"course_id integer NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(evaluation_type_id) REFERENCES evaluation_types(id),"+
					"FOREIGN KEY(course_id) REFERENCES courses(id));";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla plannings");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin plannings
	
//-----------------------> table course_student <-------------------------
	public void tableCourseStudent(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   course_student("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"student_id integer NOT NULL,"+
					"course_id integer NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(student_id) REFERENCES students(id),"+
					"FOREIGN KEY(course_id) REFERENCES courses(id));";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla course_student");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin course_student

//-----------------------> table scores <-------------------------
	public void tableScores(){
		String sentenciaSql=
			"CREATE TABLE IF NOT EXISTS   scores("+
					"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					"course_student_id integer NOT NULL,"+
					"score double NOT NULL,"+
					"status varchar(1) NOT NULL DEFAULT 'A',"+
					"FOREIGN KEY(course_student_id) REFERENCES course_student(id));";
		
		this.command.conection("notas","data.db");
		if(this.command.sqlExecute(sentenciaSql))
			;//JOptionPane.showMessageDialog(null, "creada tabla scores");
		else
			JOptionPane.showMessageDialog(null, "no se creo tabla");
		
		this.command.disconnect();
	}//fin scores
	
	
	
}//fin clase
