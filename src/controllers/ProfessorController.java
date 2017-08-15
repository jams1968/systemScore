package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import models.Professor;
import services.Funciones;
import views.ProfessorView;

public class ProfessorController implements ActionListener,KeyListener,FocusListener {

	private ProfessorView vista;
	private Professor registro;
	private boolean bandera;
	private String cadena1,cadena2;
	char[] input1,input2;
	private Funciones funcion;
	
	public ProfessorController(ProfessorView vista) {
		this.vista = vista;
		registro = new Professor();
		bandera = true;
		funcion= new Funciones();
	}
	//------------------->actionListerner<----------------------
	public void actionPerformed(ActionEvent accion) {
		if(accion.getSource().equals(vista.getBtnRetornar()))
			vista.dispose();
		else if(accion.getSource().equals(vista.getRdbtnF())){
			vista.getTextTelefono().setEditable(true);
			vista.getTextTelefono().requestFocus();
		}else if(accion.getSource().equals(vista.getRdbtnM())){
			vista.getTextTelefono().setEditable(true);
			vista.getTextTelefono().requestFocus();
		}
	}
	//---------------->KEyListerner<----------------------
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent accion) {
		if(accion.getSource().equals(vista.getTextCedula())&&
				(accion.getKeyCode()== KeyEvent.VK_ENTER)&&
				!(vista.getTextCedula().getText().trim().isEmpty())){
			
			if(registro.setCedula(vista.getTextCedula().getText().trim())){
				if(registro.readCedula()){
					llenarCampos();
					vista.getLblMensajes().setText("cédula se encuentra registrada");
					desbloquearCampos();
					bandera = false;
				}
				else{
						bandera = true;
						vista.getTextNombres().setEditable(true);
						vista.getTextNombres().requestFocus();
				}
			}else
					vista.getLblMensajes().setText("valor inválido, solo números");
			
		}//fin cedula
		
		else if(accion.getSource().equals(vista.getTextNombres())&& 
			(accion.getKeyCode()== KeyEvent.VK_ENTER)&&
			!(vista.getTextNombres().getText().trim().isEmpty())){
			if(registro.setNombres(vista.getTextNombres().getText().trim())){
				vista.getTextApellidos().setEditable(true);
				vista.getTextApellidos().requestFocus();
			}
			else
				vista.getLblMensajes().setText("valor inválido, solo letras");
		}//fin nombres
		
		else if(accion.getSource().equals(vista.getTextApellidos())&& 
				(accion.getKeyCode()== KeyEvent.VK_ENTER)&&
				!(vista.getTextApellidos().getText().trim().isEmpty())){
				if(registro.setApellidos(vista.getTextApellidos().getText().trim())){
					vista.getRdbtnF().setEnabled(true);
					vista.getRdbtnM().setEnabled(true);
					vista.getRdbtnF().requestFocus();
				}
				else
					vista.getLblMensajes().setText("valor inválido, solo letras");
		}//fin apellidos
		
		else if(accion.getSource().equals(vista.getTextTelefono())&& 
				(accion.getKeyCode()== KeyEvent.VK_ENTER)&&
				!(vista.getTextTelefono().getText().trim().isEmpty())){
					
				if(registro.setTelefono(vista.getTextTelefono().getText().trim())){
					vista.getTextEmail().setEditable(true);
					vista.getTextEmail().requestFocus();	
				}
				else
					vista.getLblMensajes().setText("valor inválido");
		}//fin telefono
		
		else if(accion.getSource().equals(vista.getTextEmail())&& 
				(accion.getKeyCode()== KeyEvent.VK_ENTER)&&
				!(vista.getTextEmail().getText().trim().isEmpty())){
				if(registro.setEmail(vista.getTextEmail().getText().trim())){
					vista.getTextUsuario().setEditable(true);
					vista.getTextUsuario().requestFocus();	
				}
				else
					vista.getLblMensajes().setText("valor inválido");
		}//fin email
		else if(accion.getSource().equals(vista.getTextUsuario())&&
				(accion.getKeyCode()== KeyEvent.VK_ENTER)&&
				!(vista.getTextUsuario().getText().trim().isEmpty())){
			Professor reg =new Professor();
			
			if(reg.setUsername(vista.getTextUsuario().getText().trim())){
				
				if(reg.readUsername()){
					vista.getLblMensajes().setText("usuario se encuentra registrado");
					
				}else{
						
					if(registro.setUsername(vista.getTextEmail().getText().trim())){
						if(bandera){
							vista.getLblConfirmar().setEnabled(true);
							vista.getLblClave().setEnabled(true);
							vista.getTextClave().setEnabled(true);
							vista.getTextClave().setEditable(true);
							vista.getTextClave().requestFocus();
						}
					}else
						vista.getLblMensajes().setText("valor inválido");
				}
			}else
					vista.getLblMensajes().setText("valor inválido");
			
		}//fin usuario
		else if(accion.getSource().equals(vista.getTextClave())&& 
				(accion.getKeyCode()== KeyEvent.VK_ENTER)){
			input1 = vista.getTextClave().getPassword();
			 cadena1 = input1.toString();
			if(!cadena1.isEmpty()){
				
				vista.getLblConfirmar().setEnabled(true);
				vista.getTxtClave2().setEnabled(true);
				vista.getTxtClave2().setEditable(true);
				vista.getTxtClave2().requestFocus();
			
			}
				
		}//fin clave1
		else if(accion.getSource().equals(vista.getTxtClave2())&& 
				(accion.getKeyCode()== KeyEvent.VK_ENTER)){
			input2 = vista.getTxtClave2().getPassword();
			cadena2 = input2.toString();
			System.out.println("cadena1: "+cadena1+" cadena2: "+cadena2);
			if( Arrays.equals (input1, input2)){
				System.out.println("entra");
				registro.setPassword(funcion.encrypt(cadena1));
				if(registro.Create())
					vista.getLblMensajes().setText("Profesor Almacenado con Exito");
			
			}
				
		}//fin clave1
		
		
	}//fin keypressed
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//---------------->focusListerner<-------------------
	@Override
	public void focusGained(FocusEvent accion) {
		 if(accion.getSource().equals(vista.getTextCedula()))
			 vista.getLblMensajes().setText
			 ("luego de ingresar Cédula, presione enter para activar el campo Nombres");
		 else if(accion.getSource().equals(vista.getTextNombres()))
			 vista.getLblMensajes().setText
			 ("luego de ingresar nombres, presione enter para activar el campo Apellidos");
		 else if(accion.getSource().equals(vista.getTextApellidos()))
			 vista.getLblMensajes().setText
			 ("luego de ingresar apellidos, presione enter para activar el campo Género");
		 else if(accion.getSource().equals(vista.getRdbtnF())||(accion.getSource().equals(vista.getRdbtnM())))
				 vista.getLblMensajes().setText
				 ("haga click en Género,  para activar el campo Teléfono");
		 else if(accion.getSource().equals(vista.getTextTelefono()))
			 vista.getLblMensajes().setText
			 ("luego de ingresar teléfono, presione enter para activar el campo Email");
		 else if(accion.getSource().equals(vista.getTextEmail()))
			 vista.getLblMensajes().setText
			 ("luego de ingresar email, presione enter para activar el campo Contraseña");
	}
	@Override
	public void focusLost(FocusEvent accion) {
		 if(accion.getSource().equals(vista.getTextCedula()))
			 vista.getLblMensajes().setText(null);
		 else if(accion.getSource().equals(vista.getTextNombres()))
			 vista.getLblMensajes().setText(null);
		 else if(accion.getSource().equals(vista.getTextTelefono()))
			 vista.getLblMensajes().setText(null);
		 else if(accion.getSource().equals(vista.getRdbtnF())||(accion.getSource().equals(vista.getRdbtnM())))
			 vista.getLblMensajes().setText(null);
		 else if(accion.getSource().equals(vista.getTextEmail()))
			 vista.getLblMensajes().setText(null);
		
	}
	
	//-------------->llenar campos<--------------------
	public void llenarCampos(){
		vista.getTextNombres().setText(registro.getNombres());
		vista.getTextApellidos().setText(registro.getApellidos());
		if(registro.getGenero().compareTo("Femenino")==0)
			vista.getRdbtnF().setSelected(true);
		else
			vista.getRdbtnM().setSelected(true);
		
		vista.getTextTelefono().setText(registro.getTelefono());
		vista.getTextEmail().setText(registro.getEmail());
		vista.getTextUsuario().setText(registro.getUsername());
	}
	//-------->desbloquear campos<---------------
	public void desbloquearCampos(){
		vista.getTextNombres().setEditable(true);
		vista.getTextApellidos().setEditable(true);
		vista.getRdbtnF().setEnabled(true);
		vista.getRdbtnM().setEnabled(true);
		
		vista.getTextTelefono().setEditable(true);
		vista.getTextEmail().setEditable(true);
		vista.getTextUsuario().setEditable(true);
	}

}//fin clase
