package views;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import java.awt.Insets;
import java.text.ParseException;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controllers.ProfessorController;
import models.Professor;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import java.awt.GridLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;

public class ProfessorView extends JDialog {
	private JTextField textCedula;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JFormattedTextField textTelefono;
	private JTextField textEmail;
	private JTextField textUsuario;
	private JPasswordField textClave;
	private JScrollPane scrollPane;
	private JScrollPane scrollPaneTabla;
	private DefaultTableModel modeloTabla;
	private JTable tablaProfesores;
	private Professor registro;
	
	private JButton btnRetornar;
	private JButton btnVaciar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnAgregar;
	private JButton btnCambioClave;
	private JPanel panelMensajes;
	private JLabel lblMensajes;
	private JRadioButton rdbtnF;
	private JRadioButton rdbtnM;
	private JLabel lblG;
	private JLabel lblClave;
	private JLabel lblConfirmar;
	private JPasswordField txtClave2;

	
	public ProfessorView() {
		this.setUndecorated(true);
		this.tablaProfesores=new JTable();
		this.setSize(700,500);
		getContentPane().setLayout(new MigLayout("", "[693px,grow]", "[24px][100px:105px,top][68px][100px:240.00px,top][::120px,grow,center][][bottom]"));
		
		JLabel lblTitulo = new JLabel("MODULO PROFESOR");
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		getContentPane().add(lblTitulo, "cell 0 0,alignx center,aligny top");
		
		JPanel panelPerson = new JPanel();
		panelPerson.setBorder(new TitledBorder(null, "Datos del Profesor", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLUE));
		getContentPane().add(panelPerson, "cell 0 1,growx,aligny top");
		panelPerson.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panelLinea1 = new JPanel();
		panelLinea1.setAlignmentY(Component.TOP_ALIGNMENT);
		FlowLayout flowLayout = (FlowLayout) panelLinea1.getLayout();
		flowLayout.setVgap(1);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelPerson.add(panelLinea1);
		
		JLabel lblCedula = new JLabel("Cédula");
		panelLinea1.add(lblCedula);
		lblCedula.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		
		textCedula = new JTextField();
		panelLinea1.add(textCedula);
		textCedula.setColumns(8);
		
		JLabel lblNombres = new JLabel("Nombres:");
		panelLinea1.add(lblNombres);
		lblNombres.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		
		textNombres = new JTextField();
		textNombres.setEditable(false);
		panelLinea1.add(textNombres);
		textNombres.setColumns(12);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		panelLinea1.add(lblApellidos);
		lblApellidos.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		panelLinea1.add(textApellidos);
		textApellidos.setColumns(12);
		
		JPanel panelLinea2 = new JPanel();
		panelLinea2.setAlignmentY(Component.TOP_ALIGNMENT);
		FlowLayout flowLayout_1 = (FlowLayout) panelLinea2.getLayout();
		flowLayout_1.setVgap(1);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelPerson.add(panelLinea2);
		
		lblG = new JLabel("Género:");
		lblG.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		panelLinea2.add(lblG);
		
		rdbtnF = new JRadioButton("F");
		panelLinea2.add(rdbtnF);
		rdbtnF.setEnabled(false);
		rdbtnF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		rdbtnM = new JRadioButton("M");
		panelLinea2.add(rdbtnM);
		rdbtnM.setEnabled(false);
		rdbtnM.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		ButtonGroup grupoGenero= new ButtonGroup();
		grupoGenero.add(rdbtnF);
		grupoGenero.add(rdbtnM);
		

		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		panelLinea2.add(lblTelefono);
		
		
		MaskFormatter mascara;
		textTelefono= new JFormattedTextField();
		try {
			mascara = new MaskFormatter("(####)-###-##-##");
			mascara.setPlaceholderCharacter('_');
			textTelefono= new JFormattedTextField(mascara);
			textTelefono.setEditable(false);
			textTelefono.setBounds(76, 83, 115, 26);
			
			textTelefono.setColumns(10);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panelLinea2.add(textTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		panelLinea2.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		panelLinea2.add(textEmail);
		textEmail.setColumns(20);
		
		JPanel panelUser = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelUser.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panelUser.setBorder(new TitledBorder(null, "Datos del Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		getContentPane().add(panelUser, "cell 0 2,grow");
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		panelUser.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setEditable(false);
		panelUser.add(textUsuario);
		textUsuario.setColumns(8);
		
		lblClave = new JLabel("Contraseña:");
		lblClave.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		panelUser.add(lblClave);
	
		
		textClave = new JPasswordField();
		textClave.setEditable(false);
		textClave.setColumns(8);
		panelUser.add(textClave);
		
		lblClave.setEnabled(false);
		textClave.setEnabled(false);
		
		lblConfirmar = new JLabel("Confirmar Contraseña:");
		lblConfirmar.setEnabled(false);
		lblConfirmar.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		panelUser.add(lblConfirmar);
		
		txtClave2 = new JPasswordField();
		txtClave2.setEnabled(false);
		txtClave2.setColumns(8);
		panelUser.add(txtClave2);
		
		JPanel panelTabla = new JPanel();
		panelTabla.setBorder(new TitledBorder(null, "Profesores Registrados", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLUE));
		
		
		
		scrollPaneTabla = new JScrollPane();
		scrollPaneTabla.setViewportBorder(null);
		
		//scrollPaneTabla.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTabla.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//scrollPaneTabla.setSize(550,100);
		
		//scrollPaneTabla.setBounds(98, 25, 556, 100);
		//panelTabla.setPreferredSize(new Dimension(550,100));
		panelTabla.add(scrollPaneTabla);
		
		this.getContentPane().add(panelTabla, "cell 0 3,growx");
		
		panelMensajes = new JPanel();
		panelMensajes.setBorder(new TitledBorder(null, "Mensaje del sistema", TitledBorder.RIGHT, TitledBorder.TOP, null, Color.BLUE));
		getContentPane().add(panelMensajes, "cell 0 4,grow");
		
		lblMensajes = new JLabel("");
		lblMensajes.setForeground(Color.RED);
		lblMensajes.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		panelMensajes.add(lblMensajes);
		
		JPanel panelBotones = new JPanel();
		FlowLayout fl_panelBotones = (FlowLayout) panelBotones.getLayout();
		panelBotones.setBackground(Color.GRAY);
		getContentPane().add(panelBotones, "cell 0 6,growx,aligny top");
		
		btnAgregar = new JButton("");
		btnAgregar.setIcon(new ImageIcon(ProfessorView.class.getResource("/iconos/iconos_32x32/plus.png")));
		btnAgregar.setToolTipText("Registrar Nuevo Profesor");
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotones.add(btnAgregar);
		
		btnModificar = new JButton("");
		btnModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificar.setIcon(new ImageIcon(ProfessorView.class.getResource("/iconos/iconos_32x32/edit.png")));
		btnModificar.setToolTipText("Modifcar Datos del Profesor");
		panelBotones.add(btnModificar);
		
		btnEliminar = new JButton("");
		btnEliminar.setToolTipText("Eliminar Profesor");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setIcon(new ImageIcon(ProfessorView.class.getResource("/iconos/iconos_32x32/busy.png")));
		panelBotones.add(btnEliminar);
		
		btnCambioClave = new JButton("");
		btnCambioClave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCambioClave.setToolTipText("Cambio de contrase\u00F1a");
		btnCambioClave.setIcon(new ImageIcon(ProfessorView.class.getResource("/iconos/iconos_32x32/cambioPassword.png")));
		panelBotones.add(btnCambioClave);
		
		btnVaciar = new JButton("");
		btnVaciar.setToolTipText("Vaciar campos del formulario");
		btnVaciar.setIcon(new ImageIcon(ProfessorView.class.getResource("/iconos/iconos_32x32/arrow_refresh.png")));
		btnVaciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotones.add(btnVaciar);
		
		btnRetornar = new JButton("");
		btnRetornar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRetornar.setToolTipText("Retornar a Pantalla Principal");
		btnRetornar.setIcon(new ImageIcon(ProfessorView.class.getResource("/iconos/iconos_32x32/arrow_turn_left.png")));
		panelBotones.add(btnRetornar);
		
		llenarTabla();
		
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		
		this.setVisible(true);
		
		//--------->enlaces<------------
		ProfessorController eco = new ProfessorController(this);
		btnRetornar.addActionListener(eco);
		rdbtnF.addActionListener(eco);
		rdbtnM.addActionListener(eco);
		
		textCedula.addKeyListener(eco);
		textNombres.addKeyListener(eco);
		textApellidos.addKeyListener(eco);
		textTelefono.addKeyListener(eco);
		textEmail.addKeyListener(eco);
		textUsuario.addKeyListener(eco);
		textClave.addKeyListener(eco);
		txtClave2.addKeyListener(eco);
		
		textCedula.addFocusListener(eco);
		textNombres.addFocusListener(eco);
		textApellidos.addFocusListener(eco);
		rdbtnF.addFocusListener(eco);
		rdbtnM.addFocusListener(eco);
		textTelefono.addFocusListener(eco);
		textEmail.addFocusListener(eco);
		textUsuario.addFocusListener(eco);


	}//fin constructor
	
	//----------------->llenar tabla <----------------------
	public void llenarTabla(){
		registro = new Professor();
		
		modeloTabla = new DefaultTableModel(new Object[][] {},
				new String[] {"Nro.", "CEDULA", "NOMBRES", "APELLIDOS"}){
				private static final long serialVersionUID = 1L;
				public boolean isCellEditable(int rowIndex, int columnIndex) {
				    return false;  //
			}
		};
		
		registro.readTable(modeloTabla);
		tablaProfesores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tablaProfesores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		tablaProfesores.setModel(modeloTabla);
		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);
	
		
		tablaProfesores.setSelectionBackground(Color.LIGHT_GRAY);
		tablaProfesores.setSelectionForeground(Color.red);
		
		//tablaProfesores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tablaProfesores.getColumnModel().getColumn(0).setPreferredWidth(50);
		tablaProfesores.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaProfesores.getColumnModel().getColumn(2).setPreferredWidth(150);
		tablaProfesores.getColumnModel().getColumn(3).setPreferredWidth(150);
		
		
		tablaProfesores.getColumnModel().getColumn(0).setCellRenderer(Alinear);
		
		
		
		scrollPaneTabla.setViewportView(tablaProfesores);
		
		//scrollPaneTabla.setViewportBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	
		
		
		
		
	}//fin llenar tabla

	public JTextField getTextCedula() {
		return textCedula;
	}

	public JTextField getTextNombres() {
		return textNombres;
	}

	public JTextField getTextApellidos() {
		return textApellidos;
	}

	

	public JTextField getTextEmail() {
		return textEmail;
	}

	public JTextField getTextUsuario() {
		return textUsuario;
	}

	public JPasswordField getTextClave() {
		return textClave;
	}

	public JScrollPane getScrollPane() {
		return scrollPaneTabla;
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public JTable getTablaProfesores() {
		return tablaProfesores;
	}

	public Professor getRegistro() {
		return registro;
	}

	public JButton getBtnRetornar() {
		return btnRetornar;
	}

	public JButton getBtnVaciar() {
		return btnVaciar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnCambioClave() {
		return btnCambioClave;
	}

	
	public JScrollPane getScrollPaneTabla() {
		return scrollPaneTabla;
	}

	public JPanel getPanelMensajes() {
		return panelMensajes;
	}

	public JLabel getLblMensajes() {
		return lblMensajes;
	}

	public JRadioButton getRdbtnF() {
		return rdbtnF;
	}

	public JRadioButton getRdbtnM() {
		return rdbtnM;
	}

	public JFormattedTextField getTextTelefono() {
		return textTelefono;
	}

	public JLabel getLblClave() {
		return lblClave;
	}

	public JLabel getLblConfirmar() {
		return lblConfirmar;
	}

	public JPasswordField getTxtClave2() {
		return txtClave2;
	}
	
	
	

}//fin clase
