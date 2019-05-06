package ejercicio6bisbis.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelImagen extends JPanel {
	// Atributos
	private static final long serialVersionUID = -7690134353630097011L;
	private ImageIcon fondo;
	//private ImageIcon icono;
	//private Image imagenIcono;
	private Image imagenFondo;
	
	public PanelImagen() {
		super();
		fondo = new ImageIcon("src/imagenes/3libros.jpg");
		imagenFondo = fondo.getImage();
		//PanelImagen panelImagen = new PanelImagen();
		//this.getContentPane().add(panelImagen);

		// // Para el icono de la ventana
		// icono = new ImageIcon("src/imagenes/icono.gif");
		// imagenIcono = icono.getImage();
		// this.setIconImage(imagenIcono);

		// this.add(etiqueta,BorderLayout.SOUTH);
	}

	// Clase interna para crear el panel
	class MiPanel extends JPanel {
	// Sobreescribir el método paint(Graphics g)
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imagenFondo, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
}




