package ejercicio6bisbis.vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelInicio extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1883808369306684505L;
	private ImageIcon imagen;
	private Image imagenFondo;
	
	public PanelInicio(){
		imagen = new ImageIcon("src/imagenes/bibliotecaNacional+.jpg");
		imagenFondo = imagen.getImage();
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imagenFondo, 0, 0, this.getWidth(), this.getHeight(),
				this);
	}
}

