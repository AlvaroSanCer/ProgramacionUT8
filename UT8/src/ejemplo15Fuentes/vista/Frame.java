package ejemplo15Fuentes.vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	// Atributos
	private static final long serialVersionUID = -8976249923737944846L;
	private Container contenedor;
	private BoxLayout gestor;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private Font fuente1, fuente2, fuente3;
	private Color color1, color2, color3;

	// Constructor
	public Frame() {
		
		contenedor = this.getContentPane();
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gestor = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
		contenedor.setLayout(gestor);
		
		// Trabajo con la etiqueta 1
		etiqueta1 = new JLabel("Serif, negrita, 12");
		fuente1 = new Font("Serif", Font.BOLD, 12);
		color1 = new Color(187, 84, 250);
		etiqueta1.setFont(fuente1);// Fuente utilizada
		etiqueta1.setForeground(color1);// Color de la letra
		contenedor.add(etiqueta1);
		
		// Trabajo con la etiqueta 2
		etiqueta2 = new JLabel("Forte, Cursiva,20");
		fuente2 = new Font("Forte", Font.ITALIC, 20);
		etiqueta2.setFont(fuente2);
		color2 = new Color(164, 77, 19);
		etiqueta2.setForeground(color2);
		contenedor.add(etiqueta2);
		
		// Trabajo con la etiqueta 3
		etiqueta3 = new JLabel("Times New Roman, Negrita y Cursiva, 18");
		fuente3 = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 18);
		etiqueta3.setFont(fuente3);
		color3 = new Color(255, 99, 23);
		etiqueta3.setForeground(color3);
		contenedor.add(etiqueta3);
	}
}