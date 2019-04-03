package ejemplo4.vista;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame4 extends JFrame {
	private static final long serialVersionUID = 1L;

	// Atributos de la clase Frame, que coincide con los elementos que consta
	// nuestra aplicacion.

	private Container contenedor; // Contenedor
	private BoxLayout gestor; // Gestor o Layout, elegimos de que tipo lo queremos.
	private JButton[] botones; // Conjunto de botones
	private final String[] etiquetas = { "boton1", "boton2", "boton3",
			"boton4", "boton5", "boton6" }; // Conjunto de etiquetas.

	public Frame4() {
		// Medida de la ventana
		this.setSize(600, 300);
		// Poner el título a la ventana
		this.setTitle("Ejemplo FlowLayout");
		// Obtener el contenedor
		contenedor = this.getContentPane();
		// Crear el gestor de diseño, en este caso es BoxLayout.
		gestor = new BoxLayout(contenedor,BoxLayout.Y_AXIS);
		// Asociar el gestor de diseño al panel de contenido
		//contenedor.setLayout(gestor);
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
