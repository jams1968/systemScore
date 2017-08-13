package crearBaseDatos;

import services.DataBaseConection;

public class CrearBasesDatos {

	public static void main(String[] args) {
		
		DataBaseConection conectar = new DataBaseConection();
		
		ProgressBar ventana=new ProgressBar();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		  
	}

}
