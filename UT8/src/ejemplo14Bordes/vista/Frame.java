package ejemplo14Bordes.vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	private static final long serialVersionUID = 9204859364885580116L;
	private JLabel etiqueta;
	private Container contenedor;
	private FlowLayout gestor;

	public Frame() {
		super("Ejemplo de Border - Alvaro Santillana Cernuda");
		contenedor = this.getContentPane();
		gestor = new FlowLayout();
		etiqueta = new JLabel("Etiqueta con borde");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jInit();
	}

	public void jInit() {
		contenedor.setLayout(gestor);
		// añadir el borde a la etiqueta
		etiqueta.setBorder(BorderFactory.createLineBorder(Color.GREEN, 10));

		// etiqueta.setBorder(BorderFactory.createRaisedBevelBorder());

		contenedor.add(etiqueta);
	}
}
