package ejercicio2.vista;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5106649682216086133L;
	private Container contenedor;
	private GridLayout gestor;
	private String nombres[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1",
			"2", "3", "-", "0", ".", "=", "+" };
	private JButton botones[];

	public Frame() {
		super("Ejercicio 2 - Alvaro Santillana Cernuda");
		this.setSize(400, 400);
		contenedor = getContentPane();
		gestor = new GridLayout(4, 4, 4, 4);
		contenedor.setLayout(gestor);

		botones = new JButton[nombres.length];
		for (int i = 0; i < nombres.length; i++) {
			botones[i] = new JButton(nombres[i]);
			contenedor.add(botones[i]);

		}
	}
}
