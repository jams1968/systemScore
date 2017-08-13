package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.ProfesorView;

public class ProfessorController implements ActionListener {

	private ProfesorView vista;
	
	public ProfessorController(ProfesorView vista) {
		this.vista = vista;
	}
	public void actionPerformed(ActionEvent accion) {
		if(accion.getSource().equals(vista.getBtnRetornar()))
			vista.dispose();
		
	}

}
