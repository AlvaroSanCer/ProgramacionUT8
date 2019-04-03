package ejemplo3.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;

import javax.swing.JFrame;

public class Frame3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private FlowLayout gestor;
	private JButton[] botones;
	private final String[] etiquetas = { "boton1", "boton2", "boton3",
			"boton4", "boton5", "boton6" };

	public Frame3() {
		// Medida de la ventana
		this.setSize(600, 300);
		// Poner el título a la ventana
		this.setTitle("Ejemplo FlowLayout");
		// Obtener el contenedor
		contenedor = this.getContentPane();
		// Crear el gestor de diseño
		gestor = new FlowLayout();
		// Asociar el gestor de diseño al panel de contenido
		contenedor.setLayout(gestor);
		// Crear el array de botones
		botones = new JButton[etiquetas.length];
		// Crear los botones ya añadirlos al array
		crearBotones();
		// Añadir los botones al panel de contenido
		addBotones();
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void crearBotones() {
		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton(etiquetas[i]);
		}
	}

	public void addBotones() {
		for (int i = 0; i < botones.length; i++) {
			contenedor.add(botones[i]);
		}
	}
}
