package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import controllers.PantallaPrincipalController;
import services.DataBaseConection;



public class PantallaPrincipalView extends JFrame {

	private JPanel contentPane;
	private JMenuItem ayudaAcerca, ayudaElaborado, ayudaSalir, menuConfiguraciones;

	JButton btnSalir;
	private JMenuItem menuProfesor;
	private JMenuItem menuCursos;

	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public PantallaPrincipalView() {
		DataBaseConection conectar = new DataBaseConection();
		conectar.conection("notas", "data.db");
		setUndecorated(true);
		JPanel contentPane;
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(PantallaPrincipalView.class.getResource("/imagenes/iconos/logojams2.png")));
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		// setBounds(100, 100, 450, 300);

		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

		JMenu menuVarios = new JMenu("Varios");
		menuVarios.setFont(new Font("SansSerif", Font.BOLD, 14));
		menuVarios.setCursor(new Cursor(12));
		barraMenu.add(menuVarios);

		menuConfiguraciones = new JMenuItem("Configuraciones");
		menuConfiguraciones.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuConfiguraciones
				.setIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/iconos/iconos_16x16/gear.png")));
		menuConfiguraciones.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		menuConfiguraciones.setCursor(new Cursor(12));
		menuVarios.add(menuConfiguraciones);
		
		menuProfesor = new JMenuItem("Profesores");
		menuProfesor.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuProfesor.setActionCommand("Profesor");
		menuProfesor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuProfesor.setIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/iconos/iconos_16x16/editar-grupo-icono-3815-16.png")));
		menuVarios.add(menuProfesor);
		
		menuCursos = new JMenuItem("Cursos");
		menuCursos.setIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/imagenes/btnCurso33_33.png")));
		menuVarios.add(menuCursos);

		JMenu menuAyuda = new JMenu("Ayuda");
		menuAyuda.setFont(new Font("SansSerif", Font.BOLD, 14));
		barraMenu.add(menuAyuda);

		ayudaElaborado = new JMenuItem("Dise\u00F1ado por...");
		ayudaElaborado.setCursor(new Cursor(12));
		menuAyuda.add(ayudaElaborado);
		menuAyuda.setCursor(new Cursor(12));

		ayudaAcerca = new JMenuItem("Acerca de  REYCONCA");
		ayudaAcerca.setCursor(new Cursor(12));
		menuAyuda.add(ayudaAcerca);

		JSeparator separator = new JSeparator();
		menuAyuda.add(separator);

		ayudaSalir = new JMenuItem("Salir");
		ayudaSalir.setIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/imagenes/iconos/salirP.png")));
		ayudaSalir.setCursor(new Cursor(12));
		ayudaSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		menuAyuda.add(ayudaSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblFondo = new JLabel("");
		lblFondo.setForeground(Color.BLUE);
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/imagenes/iconos/logos UNERG2.png")));
		contentPane.add(lblFondo, BorderLayout.CENTER);

		JLabel lblTitulo = new JLabel("SISTEMA PARA EL REGISTRO Y CONTROL DE  NOTAS  POR CURSO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		contentPane.add(lblTitulo, BorderLayout.NORTH);

		JPanel panelBoton = new JPanel();
		panelBoton.setBackground(new Color(30, 144, 255));
		FlowLayout flowLayout = (FlowLayout) panelBoton.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panelBoton, BorderLayout.SOUTH);

		btnSalir = new JButton("");
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setToolTipText("Salir del Sistema");
		btnSalir.setIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/iconos/btnsalir1.png")));
		btnSalir.setRolloverIcon(new ImageIcon(PantallaPrincipalView.class.getResource("/iconos/btnSalir2.png")));
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalir.setCursor(new Cursor(12));
		panelBoton.add(btnSalir);
		this.setExtendedState(MAXIMIZED_BOTH);
		// setResizable(false);
		this.setVisible(true);
		
		
		// enlaces
		PantallaPrincipalController eco = new PantallaPrincipalController(this);
		btnSalir.addActionListener(eco);
		ayudaElaborado.addActionListener(eco);
		ayudaAcerca.addActionListener(eco);
		ayudaSalir.addActionListener(eco);
		menuConfiguraciones.addActionListener(eco);
		menuProfesor.addActionListener(eco);
		menuCursos.addActionListener(eco);
			 
				
		}
		
		
		

		
	

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JMenuItem getAyudaAcerca() {
		return ayudaAcerca;
	}

	public JMenuItem getAyudaElaborado() {
		return ayudaElaborado;
	}

	public JMenuItem getAyudaSalir() {
		return ayudaSalir;
	}

	

	public JMenuItem getConfiguraciones() {
		return menuConfiguraciones;
	}

	public JMenuItem getMenuConfiguraciones() {
		return menuConfiguraciones;
	}

	public JMenuItem getMenuProfesor() {
		return menuProfesor;
	}

	public JMenuItem getMenuCursos() {
		return menuCursos;
	}
	

}
