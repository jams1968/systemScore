package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.ConfiguracionesView;
import views.PantallaPrincipalView;
import views.ProfesorView;

public class PantallaPrincipalController implements ActionListener{

	private PantallaPrincipalView vista;
	
	public PantallaPrincipalController(PantallaPrincipalView vista) {
		this.vista = vista;
	}
	public void actionPerformed(ActionEvent accion) {
		if((accion.getSource().equals(vista.getBtnSalir())||( 
				accion.getSource().equals(vista.getAyudaSalir()))))
			salirSistema();
		else if(accion.getSource().equals(vista.getMenuProfesor()))
			new ProfesorView();
		
		else if(accion.getSource().equals(vista.getMenuConfiguraciones()))
			new ConfiguracionesView();
		
	}//fin action
	
	public void salirSistema(){
		
		int confirmar=JOptionPane.showConfirmDialog(vista, " ¿Desea Salir del Sistema?",
				"Mensaje del Sistema ", JOptionPane.YES_NO_OPTION,0);
		if(confirmar==0) System.exit(0);
	}
	
	

}//fin
