package ejercicio6bis;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class AcercaDe extends JDialog {

	private static final long serialVersionUID = 1L;

	JDialog mensaje;
	ImageIcon imagen;
	Image imagenFondo;

	public AcercaDe() {
		setTitle("Acerca de Gesti\u00F3n de Biblioteca");
		
		mensaje = new JDialog();
		mensaje.setSize(400, 250);
		mensaje.setVisible(true);
		mensaje.setLocationRelativeTo(null);
		
		imagen = new ImageIcon("src/imagenes/libros.jpg");
		imagenFondo = imagen.getImage();
		
		
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imagenFondo, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	public static void main(String[] args) {
		new AcercaDe();
	}
}
