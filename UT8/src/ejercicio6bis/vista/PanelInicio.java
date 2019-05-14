package ejercicio6bis.vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelInicio extends JPanel {

	private static final long serialVersionUID = 1L;

	ImageIcon imagen;
	Image imagenFondo;

	//Constructor
	public PanelInicio() {
		setBorder(null);
		imagen = new ImageIcon("src/imagenes/biblioteca.jpg");
		imagenFondo = imagen.getImage();
	}

	//Pone la imagen en el panel, ajustando su tamaño al del panel.
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imagenFondo, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
