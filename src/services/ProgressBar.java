package services;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ProgressBar extends JFrame {
	private JPanel contentPane;
	private JButton btnIniciar;
	private PanelProgressBar JpanelProgress;
	
	public ProgressBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIniciar = new JButton("");
		btnIniciar.setIcon(new ImageIcon(ProgressBar.class.getResource("/imagenes/iconos/iconos_32x32/star.png")));
		btnIniciar.setBounds(0, 0, 65, 41);
		contentPane.add(btnIniciar);
		
		JpanelProgress = new PanelProgressBar();
		JpanelProgress.setBounds(10, 52, 510, 362);
		contentPane.add(JpanelProgress);
		
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}



	public PanelProgressBar getJpanelProgress() {
		return JpanelProgress;
	}
}//fin
