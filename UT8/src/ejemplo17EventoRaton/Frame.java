package ejemplo17EventoRaton;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel etiqueta;

	public Frame() {
		// Crear la ventana con un título
		super("Eventos de ratón");
		// Obtener el contenedor
		contenedor = this.getContentPane();
		// Crear la etiqueta
		etiqueta = new JLabel();
		jInit();
	}

	private void jInit() {
		// Colocar el etiqueta en la zona sur
		contenedor.add(etiqueta, BorderLayout.SOUTH);
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Método para obtener el contenedor
	public Container getContenedor() {
		return contenedor;
	}

	// Método para devolver la etiqueta
	public JLabel getEtiqueta() {
		return etiqueta;
	}
}