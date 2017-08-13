package crearBaseDatos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;

public class ProgressBar extends JFrame {

	private JPanel contentPane;
	private JButton btnIniciar;
	private PanelProgressBar JpanelProgress;
	private JTextArea textInformacion;
	

	/**
	 * Create the frame.
	 */
	public ProgressBar() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIniciar = new JButton("");
		btnIniciar.setIcon(new ImageIcon(ProgressBar.class.getResource("/imagenes/iconos/iconos_32x32/star.png")));
		btnIniciar.setBounds(0, 0, 65, 41);
		contentPane.add(btnIniciar);
		
		JpanelProgress = new PanelProgressBar();
		JpanelProgress.setBounds(10, 52, 314, 279);
		contentPane.add(JpanelProgress);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(336, 52, 315, 279);
		contentPane.add(scrollPane);
		
		textInformacion = new JTextArea();
		textInformacion.setEditable(false);
		textInformacion.setColumns(9);
		textInformacion.setRows(10);
		scrollPane.setViewportView(textInformacion);
		
		//enlaces
		ControladorProgressBar eco=new ControladorProgressBar(this);
		btnIniciar.addActionListener(eco);
	}



	public JButton getBtnIniciar() {
		return btnIniciar;
	}



	public PanelProgressBar getJpanelProgress() {
		return JpanelProgress;
	}



	public JTextArea getTextInformacion() {
		return textInformacion;
	}



	
}
