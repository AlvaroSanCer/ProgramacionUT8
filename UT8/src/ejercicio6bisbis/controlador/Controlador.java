package ejercicio6bisbis.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import libraries.MetodosSwing;
import ejercicio6bisbis.vista.*;

public class Controlador implements ActionListener {
	// Atributos
	private Ventana ventana;
	//private Modelo modelo;
	private DialogoAcerca dialogoAcerca;
	private JMenuItem[] opcionesMenu; 

	// Constructor
	public Controlador() {
		// Crear la ventana
		ventana = new Ventana();
		//Trabajar con las opciones del Menú
		// Crear el array de menús y los menús
		opcionesMenu = ventana.getBarra().getItemMenu();
		// Asociar el objeto oyente a las opciones del menu
		asociarOyenteOpcionesMenu();
	
		//Trabajar con el dialogo Acerca de
		dialogoAcerca = new DialogoAcerca();
		//dialogoAcerca.getAceptarAcerca().addActionListener(this);
		
		//Trabajar con los paneles
		
		
		// Para iniciar la aplicacion desactivar las opciones del menu Libro
		//Desactivar las opciones del menu libro
		ventana.getBarra.mostrarInicio();
			
	}
	
	// Método para asociar el objeto oyente a las opciones del menu
	public void asociarOyenteOpcionesMenu(){
		for (int i = 0; i < opcionesMenu.length; i++) {
			opcionesMenu[i] = addActionListener(this);
		}		
	}
	
	//Método para obetener la ventana
	public Ventana getVentana(){
		return ventana;
	}
	
	

		
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(opcionesMenu[2])){
			System.exit(0);
		} else if (e.getSource().equals(opcionesMenu[1])){
			// Para centrar
			dialogoAcerca.setLocationRelativeTo(ventana);
			dialogoAcerca.setVisible(true);
		} else if (dialogoAcerca.isVisible()){
			if (e.getSource().equals(dialogoAcerca.getAceptarAcerca())){
				dialogoAcerca.setVisible(false);
			}			
		}
	}
}
