package ejemplo2.vista;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame2 extends JFrame {
	/**
*
*/
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel etiqueta;

	public Frame2() {
		contenedor = this.getContentPane();
		// Creo la etiqueta
		etiqueta = new JLabel("MI PRIMERA ETIQUETA");
		// Pongo la etiqueta en el contenedor
		contenedor.add(etiqueta);
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}