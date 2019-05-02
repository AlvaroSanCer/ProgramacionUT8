package ejemplo20MVC.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ejemplo20MVC.modelo.Modelo;
import ejemplo20MVC.vista.Vista;
import ejemplo20MVC.vista.Vista2;

public class Controlador implements ActionListener {
	// Atributos
	// private Vista vista;
	private Vista2 vista;
	private Modelo modelo;

	// Constructor
	public Controlador() {
		// vista = new Vista();
		vista = new Vista2();
		JButton miBoton = vista.getBoton();
		miBoton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(vista.getBoton())) {
			// int sumando1=Integer.parseInt((vista.getCampo1()).getText());
			// int sumando2=Integer.parseInt((vista.getCampo2()).getText());
			int sumando1 = (Integer) (vista.getCampo1().getSelectedItem());
			int sumando2 = (Integer) (vista.getCampo2().getSelectedItem());
			modelo = new Modelo(sumando1,sumando2);
			vista.setCampo3(" " + modelo.sumar());
		}
	}
}
