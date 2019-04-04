package ejemplo10JComboBox.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame10 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private FlowLayout gestor;
	private JComboBox<String> combo;
	private DefaultComboBoxModel<String> modelo;
	private JLabel etiqueta;

	public Frame10() {
		super("Ejemplo JComboBox");
		contenedor = this.getContentPane();
		gestor = new FlowLayout();
		// Asociar el gestor de diseño al contenedor
		contenedor.setLayout(gestor);
		// Crear la etiqueta
		etiqueta = new JLabel("Elige opción:");
		// Añadir la etiqueta al contenedor
		contenedor.add(etiqueta);
		// Crear un modelo para el JComboBox
		crearModelo();
		// Crear el JComboBox
		combo = new JComboBox<>(modelo);
		// Poner una etiqueta al combo
		// Añadir el combo al contenedor
		contenedor.add(combo);
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void crearModelo() {
		modelo = new DefaultComboBoxModel<>();
		modelo.addElement("Música");
		modelo.addElement("Deporte");
		modelo.addElement("Cine");
	}
}