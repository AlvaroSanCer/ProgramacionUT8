package ejemplo11JList.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Frame11 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private FlowLayout gestor;
	private JList<String> lista;
	private DefaultListModel<String> modelo;
	private JLabel etiqueta;

	public Frame11() {
		super("Ejemplo JList");
		contenedor = this.getContentPane();
		gestor = new FlowLayout();
		// Asociar el gestor de diseño al contenedor
		contenedor.setLayout(gestor);
		// Crear la etiqueta
		etiqueta = new JLabel("Elige tu hobbie:");
		// Añadir la etiqueta al contenedor
		contenedor.add(etiqueta);
		// Crear un modelo para la lista
		crearModelo();
		// Crear el componente JList
		lista = new JList<>(modelo);
		// Añadir la lista al contenedor
		contenedor.add(lista);
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void crearModelo() {
		modelo = new DefaultListModel<>();
		modelo.addElement("Cine");
		modelo.addElement("Deporte");
		modelo.addElement("Amigos");
		modelo.addElement("Música");
	}
}