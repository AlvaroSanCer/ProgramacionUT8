package ejercicio6bis.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import ejercicio6.Ventana;

public class Controlador implements ActionListener{
	
	private Ventana ventana;
	private JMenuItem[] opcionesMenu;
	
	
	public Controlador(){
		ventana = new Ventana();
		//opcionesMenus = ventana.getBarra().getItemMenu();
		//asociarOyenteOPcionesMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
		
	}

	public Ventana getVentana() {
		// TODO Apéndice de método generado automáticamente
		return ventana;
	}

}
