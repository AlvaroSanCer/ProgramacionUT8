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

	
	public Frame(String a) {
		super(a);
		// Establecer el tamaño.
		this.setSize(500, 150);
		// Obtenemos el panel raíz de la ventana
		contenedor = this.getContentPane();
		// Creo el gestor de diseño
		gestor = new FlowLayout();
		// Añado el gestor de diseño
		contenedor.setLayout(gestor);
		

		// Crear los botones
		botones = new JButton[nombres.length];
		for (int i = 0; i < nombres.length; i++) {
			botones[i] = new JButton(nombres[i]);
			contenedor.add(botones[i]);
		}

		switch (a) {
		case "Alineacion centro":
			gestor.setAlignment(FlowLayout.CENTER);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			break;
		case "Alineacion izquierda":
			gestor.setAlignment(FlowLayout.LEFT);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			break;
		case "Alineacion derecha":
			gestor.setAlignment(FlowLayout.RIGHT);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			break;
		}

	}

}
