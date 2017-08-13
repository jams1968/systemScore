package views;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import controllers.ConfiguracionesController;







public class ConfiguracionesView extends JDialog {
	private JButton btnCarrera;
	private JButton btnDirecciones;
	private JButton btnSecciones;
	private JButton btnPeriodoLectivo;
	private JButton btnDepartamentos;
	private JButton btnRetornar;
	private JDesktopPane escritorio;
	private JButton btnAsignaturas;
	private JButton btnTipoDeEvaluaciones;
	//private VistaPrincipal vistaAnterior;

	
	public ConfiguracionesView() {
		setUndecorated(true);
		setAlwaysOnTop(true);
		setSize(900, 600);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelPadre = new JPanel();
		panelPadre.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelPadre.setBackground(Color.GRAY);
		panelPadre.setMaximumSize(new Dimension(800,600));
		getContentPane().add(panelPadre, "name_39797563019802");
		panelPadre.setLayout(null);
		
		JPanel panelLateral = new JPanel();
	//	panelLateral.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panelLateral.setBounds(8, 125, 217, 441);
		panelPadre.add(panelLateral);
		panelLateral.setLayout(new GridLayout(7, 1, 0, 0));
		
		
		JPanel panelTop = new JPanel();
		//panelTop.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panelTop.setBounds(8, 8, 880, 114);
		panelPadre.add(panelTop);
		panelTop.setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setBounds(10, 7, 120, 100);
		lblIcono.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/imagenes/iconos/rueda_dentada1.png")));
		panelTop.add(lblIcono);
		
		btnRetornar = new JButton("");
		btnRetornar.setToolTipText("Ir a la pantalla principal");
		btnRetornar.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/iconos/iconos_32x32/home.png")));
		btnRetornar.setBounds(809, 61, 59, 41);
		panelTop.add(btnRetornar);
		
		btnPeriodoLectivo = new JButton("Per\u00EDodos Lectivo ");
		btnPeriodoLectivo.setBounds(5, 5, 201, 41);
		btnPeriodoLectivo.setToolTipText("Administraci\u00F3n de Per\u00EDodos Lectivos");
		btnPeriodoLectivo.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/iconos/iconos_32x32/calendar.png")));
		
		JPanel panelLinea1 = new JPanel();
		panelLateral.add(panelLinea1);
		panelLinea1.setLayout(null);
		panelLinea1.add(btnPeriodoLectivo);
		
		JPanel panelLinea2 = new JPanel();
		panelLateral.add(panelLinea2);
		panelLinea2.setLayout(null);
		
		btnCarrera = new JButton("Carreras              ");
		btnCarrera.setBounds(5, 5, 201, 41);
		btnCarrera.setToolTipText("Administraci\u00F3n de Carreras");
		btnCarrera.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/iconos/iconos_32x32/library.png")));
		panelLinea2.add(btnCarrera);
		
		JPanel panelLinea3 = new JPanel();
		panelLateral.add(panelLinea3);
		panelLinea3.setLayout(null);
		
		btnDirecciones = new JButton("Direcciones          ");
		
		btnDirecciones.setBounds(5, 5, 201, 41);
		btnDirecciones.setToolTipText("Administraci\u00F3n de Direccion/es");
		btnDirecciones.setIcon(new ImageIcon(ConfiguracionesView.class.getResource("/iconos/iconos_32x32/business-contact.png")));
		panelLinea3.add(btnDirecciones);
		
		JPanel panellinea4 = new JPanel();
		panelLateral.add(panellinea4);
		panellinea4.setLayout(null);
		
		btnDepartamentos = new JButton("Departamentos   ");
		btnDepartamentos.setBounds(5, 5, 201, 41);
		btnDepartamentos.setToolTipText("Administraci\u00F3n de Departamentos");
		btnDepartamentos.setIcon(new ImageIcon
				(ConfiguracionesView.class.getResource("/iconos/iconos_32x32/address.png")));
		panellinea4.add(btnDepartamentos);
		
		JPanel panelLinea5 = new JPanel();
		panelLateral.add(panelLinea5);
		panelLinea5.setLayout(null);
		
		btnAsignaturas = new JButton("Asignaturas         ");
		btnAsignaturas.setBounds(5, 5, 201, 41);
		btnAsignaturas.setToolTipText("Administraci\u00F3n de Asignaturas");
		btnAsignaturas.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/iconos/iconos_32x32/archives.png")));
		panelLinea5.add(btnAsignaturas);
		
		JPanel panelLinea6 = new JPanel();
		panelLateral.add(panelLinea6);
		panelLinea6.setLayout(null);
		
		btnSecciones = new JButton("Secciones             ");
		btnSecciones.setBounds(5, 5, 201, 41);
		btnSecciones.setToolTipText("Administarci\u00F3n de Secciones");
		btnSecciones.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/iconos/iconos_32x32/product-design.png")));
		panelLinea6.add(btnSecciones);
		
		JPanel panelLinea7 = new JPanel();
		panelLinea7.setLayout(null);
		panelLateral.add(panelLinea7);
		btnTipoDeEvaluaciones = new JButton("Tipo Evaluaciones");
		btnTipoDeEvaluaciones.setIcon(new ImageIcon(ConfiguracionesView.class.getResource
				("/iconos/iconos_32x32/table_edit.png")));
		btnTipoDeEvaluaciones.setToolTipText("Administarci\u00F3n de los Tipos de Evalauciones");
		btnTipoDeEvaluaciones.setBounds(5, 5, 202, 41);
		panelLinea7.add(btnTipoDeEvaluaciones);
		
		JLabel lblConfiguraciones = new JLabel("CONFIGURACIONES");
		//lblConfiguraciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiguraciones.setBounds(264, 36, 336, 29);
		lblConfiguraciones.setForeground(Color.BLUE);
		lblConfiguraciones.setFont(new Font("Tahoma", Font.BOLD, 30));
		panelTop.add(lblConfiguraciones);
		
		
		
		
		//cursores
		btnCarrera.setCursor(new Cursor(12));
		btnDirecciones.setCursor(new Cursor(12));
		btnSecciones.setCursor(new Cursor(12));
		btnPeriodoLectivo.setCursor(new Cursor(12));
		btnDepartamentos.setCursor(new Cursor(12));
		btnTipoDeEvaluaciones.setCursor(new Cursor(12));
		btnAsignaturas.setCursor(new Cursor(12));
		btnRetornar.setCursor(new Cursor(12));
		
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		//-------------->enlaces<----------------
		ConfiguracionesController eco = new ConfiguracionesController(this);
		btnRetornar.addActionListener(eco);

	}//fin constructor

	public JButton getBtnCarrera() {
		return btnCarrera;
	}

	public JButton getBtnDirecciones() {
		return btnDirecciones;
	}

	public JButton getBtnSecciones() {
		return btnSecciones;
	}

	public JButton getBtnPeriodoLectivo() {
		return btnPeriodoLectivo;
	}

	public JButton getBtnDepartamentos() {
		return btnDepartamentos;
	}

	public JButton getBtnRetornar() {
		return btnRetornar;
	}

	public JDesktopPane getEscritorio() {
		return escritorio;
	}

	public JButton getBtnAsignaturas() {
		return btnAsignaturas;
	}

	public JButton getBtnTipoDeEvaluaciones() {
		return btnTipoDeEvaluaciones;
	}
	

}//fin clase
