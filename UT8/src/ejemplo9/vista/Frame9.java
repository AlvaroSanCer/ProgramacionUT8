package ejemplo9.vista;

import java.awt.Container;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Frame9 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private BoxLayout gestor;
	private ArrayList<JRadioButton> botones;
	private final String[] etiquetas = { "Pulpo", "Calamar", "Tortuga","Tiburón" };
	private ButtonGroup grupo;

	// Constructor
	public Frame9() {
		super("Botones de radio");
		contenedor = this.getContentPane();
		gestor = new BoxLayout(contenedor, BoxLayout.X_AXIS);
		// Asociar el gestor al contenedor
		contenedor.setLayout(gestor);
		// Crear el ArrayList
		botones = new ArrayList<>();
		// Cargar el ArrayList y poner el texto
		cargarArray();
		// Añadir los botones al panel de contenido
		addBotones();
		// Crear el grupo para los botones
		grupo = new ButtonGroup();
		// Añadir los botones al grupo
		agrupar();
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void agrupar() {
		for (int i = 0; i < botones.size(); i++) {
			grupo.add(botones.get(i));
		}
	}

	public void cargarArray() {
		JRadioButton boton;
		for (int i = 0; i < etiquetas.length; i++) {
			boton = new JRadioButton();
			boton.setText(etiquetas[i]);
			botones.add(boton);
		}
	}

	public void addBotones() {
		for (int i = 0; i < botones.size(); i++) {
			contenedor.add(botones.get(i));
		}
	}
}
