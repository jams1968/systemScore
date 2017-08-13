package crearBaseDatos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import services.DataBaseConection;
import services.Migrations;
import services.Seeds;


public class ControladorProgressBar implements ActionListener  {
	private ProgressBar vista;
	
	public ControladorProgressBar(ProgressBar vista){
		this.vista=vista;
	}

	@Override
	public void actionPerformed(ActionEvent accion) {
		if(accion.getSource().equals(vista.getBtnIniciar())){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					DataBaseConection datos= new DataBaseConection();
				//datos.conection("notas","data.db");
				Migrations tablas = new Migrations();
				String texto = "Creando Base de Datos: data.db";
				vista.getTextInformacion().setText(texto);
				Seeds seeds = new Seeds();
				
				
					//for(int i=0;i<=100;i++){
						try {
							vista.getJpanelProgress().ActualizarProgress(4);
							tablas.tablePeople();
							texto+="\nPeople";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(8);
							tablas.tableUniversitys();
							texto+="\nUniversitys";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(12);
							tablas.tableCareers();
							texto+="\nCareers";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							
							vista.getJpanelProgress().ActualizarProgress(16);
							tablas.tableDirections();
							texto+="\nDirections";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(20);
							tablas.tableDepartaments();
							texto+="\nDepartaments";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
						
							vista.getJpanelProgress().ActualizarProgress(24);
							tablas.tableLevels();
							texto+="\nLevels";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(28);
							tablas.tableSubjects();
							texto+="\nSubjects";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(32);
							tablas.tableStudents();
							texto+="\nStudents";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
						
							vista.getJpanelProgress().ActualizarProgress(36);
							tablas.tableTeachingPeriods();
							texto+="\nTeachingPeriods";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
						
							vista.getJpanelProgress().ActualizarProgress(40);
							tablas.tableProfessors();
							texto+="\nProfessors";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
						
							vista.getJpanelProgress().ActualizarProgress(44);
							tablas.tableEvaluationTypes();
							texto+="\nEvaluationTypes";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(48);
							tablas.tableCourses();
							texto+="\nCourses";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(52);
							tablas.tablePlannings();
							texto+="\nPlannings";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(56);
							tablas.tableCourseStudent();
							texto+="\nCourseStudent";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(60);
							tablas.tableScores();
							texto+="\nScores";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							texto+="\n\nAlmacenando informacion precargada:";
							Thread.sleep(100);
							vista.getJpanelProgress().ActualizarProgress(64);
							seeds.PeopleSeeder();
							texto+="\nPersonas";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							
							vista.getJpanelProgress().ActualizarProgress(68);
							seeds.UniversitysSeeder();
							texto+="\nUniversidad";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							
							vista.getJpanelProgress().ActualizarProgress(72);
							seeds.CareersSeeder();
							texto+="\nCarreras";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(76);
							seeds.DirectionsSeeder();
							texto+="\nDirecciones";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(80);
							seeds.DepartamentsSeeder();
							texto+="\nDepartamentos";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(84);
							seeds.LevelsSeeder();
							texto+="\nNiveles";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(90);
							seeds.SubjectsSeeder();
							texto+="\nAsignaturas";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
							vista.getJpanelProgress().ActualizarProgress(100);
							seeds.ProfessorsSeeder();
							texto+="\nProfesores";
							vista.getTextInformacion().setText(texto);
							Thread.sleep(50);
							vista.getJpanelProgress().repaint();
							
						
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					//}
					
				}
			}).start();
			
		}
		
	}

}
