package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import services.ProgressBar;


public class CircleController implements ActionListener {
	private ProgressBar vista;
	
	public CircleController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent accion) {
		if(accion.getSource().equals(vista.getBtnIniciar())){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<=100;i++){
						try {
							vista.getJpanelProgress().ActualizarProgress(i);
							vista.getJpanelProgress().repaint();
							Thread.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
			}).start();
			
		}
		
	}
	
	

}
