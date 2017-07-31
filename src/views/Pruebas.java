package views;
import services.DataBaseConection;
import services.Migrations;
import services.Seeds;

public class Pruebas {

	public static void main(String[] args) {
		DataBaseConection datos= new DataBaseConection();
		//datos.conection("notas","data.db");
		Migrations tablas = new Migrations();
		Seeds seeds = new Seeds();
		tablas.tablePersons();
		tablas.tableUniversitys();
		tablas.tableCareers();
		tablas.tableDirections();
		tablas.tableDepartaments();
		tablas.tableLevels();
		tablas.tableSubjects();
		tablas.tableSections();
		tablas.tableStudents();
		tablas.tableTeachingPeriods();
		tablas.tableProfessors();
		tablas.tableEvaluationTypes();
		tablas.tableCourses();
		tablas.tablePlannings();
		tablas.tableCourseStudent();
		tablas.tableScores();
		
		seeds.PersonsSeeder();
		seeds.UniversitysSeeder();
		seeds.CareersSeeder();
		seeds.DirectionsSeeder();
		seeds.DepartamentsSeeder();
		seeds.LevelsSeeder();
		seeds.SubjectsSeeder();
		
		
	}

}
