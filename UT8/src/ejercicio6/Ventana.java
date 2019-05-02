package ejercicio6;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private Menu menu;
	private ImageIcon fondo;
	private Image imagenFondo;
	
	public Ventana() {
		this.setSize(500, 300);
		menu = new Menu();
		this.setJMenuBar(menu);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 300);
		
		fondo = new ImageIcon("src/imagenes/biblioteca.jpg");
		imagenFondo = fondo.getImage();
		
		this.getContentPane().add(panel);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		 g.drawImage(imagenFondo, 0, 45, this.getWidth(), this.getHeight(), this);
	}
	
	
}
