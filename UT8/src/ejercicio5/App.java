package ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;



public class App {

	private Frame ventana;

	App() {
		ventana = new Frame();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}	

	public static void main(String[] args) {
		new App();
	}
	
}
