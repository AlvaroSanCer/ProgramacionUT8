package ejemplo16Evento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ejemplo16Evento.vista.Frame;

public class App {
	// Atributos
	private Frame ventana;

	App() {
		ventana = new Frame();
		jInit();
	}

	public void jInit() {
		ventana.setLocationRelativeTo(ventana);
		;
		ventana.setVisible(true);
		// Crear un objeto oyente
		OyenteEvento oyente = new OyenteEvento();
		// Registrar el oyente en el fuente
		ventana.getBoton1().addActionListener(oyente);
	}

	public static void main(String[] args) {
		new App();
	}

	// Clase interna que define objetos oyente del tipo que nos interesa
	private class OyenteEvento implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(ventana.getBoton1())) {
				JOptionPane
						.showMessageDialog(ventana, "Has pulsado el botón 1");
			}
		}
	}
}