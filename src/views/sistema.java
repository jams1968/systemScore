package views;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import services.DataBaseConection;

public class sistema {

	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		DataBaseConection conectar = new DataBaseConection();
		conectar.ejecutar();
		PantallaPrincipalView vista= new PantallaPrincipalView();
		
	}

}
