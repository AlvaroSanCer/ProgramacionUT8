package ejercicio1.vista;


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5487601072629392166L;
	private Container contenedor;
	private FlowLayout gestor;
	private JButton botones[];
	private final String nombres[] = { "Izquierda", "Centro", "Derecha" };

	public Frame() {
		super("Ejercicio 1 - Alvaro Santillana");
		// Establecer el tamaño.
		this.setSize(600, 300);
		// Obtenemos el panel raíz de la ventana
		contenedor = getContentPane();
		// Creo el gestor de diseño
		gestor = new FlowLayout();
		// Añado el gestor de diseño
		contenedor.setLayout(gestor);
		
		//Cambiando el parametro por 0,1,2 cambiaria la orientación.
		gestor.setAlignment(1);
		
		// Crear los botones
		botones = new JButton[nombres.length];
		for (int i = 0; i < nombres.length; i++) {
			botones[i] = new JButton(nombres[i]);
			contenedor.add(botones[i]);
		}

		
	}

}
