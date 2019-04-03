package ejemplo2.vista;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame2 extends JFrame {
	/**
*
*/
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel etiqueta, etiqueta2;
	

	public Frame2() {
		contenedor = this.getContentPane();
		// Creo la etiqueta
		
		etiqueta = new JLabel("MI PRIMERA ETIQUETA");
		etiqueta2 = new JLabel("Mi segunda etiqueta");
		// Pongo la etiqueta en el contenedor
		contenedor.add(etiqueta);
		contenedor.add(etiqueta2);
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}