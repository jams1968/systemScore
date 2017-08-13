package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.ConfiguracionesView;

public class ConfiguracionesController implements ActionListener {
	
	ConfiguracionesView vista;
	
	public ConfiguracionesController(ConfiguracionesView vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent accion) {
		if(accion.getSource().equals(vista.getBtnRetornar()))
			this.vista.dispose();
		
	}

	
}// fin clase
