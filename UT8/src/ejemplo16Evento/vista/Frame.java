package ejemplo16Evento.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private FlowLayout gestor;
	private JButton boton1, boton2;

	public Frame() {
		// Crear la ventana y poner el título
		super("Ejemplo de eventos");
		// Obtener el contenedor
		contenedor = this.getContentPane();
		// Crear el gestor de diseño
		gestor = new FlowLayout();
		// Asociar el gestor de diseño al contenedor
		contenedor.setLayout(gestor);
		// Crear los botones
		boton1 = new JButton("Botón 1");
		boton2 = new JButton("Botón 2");
		jInit();
	}

	public void jInit() {
		// Añadir los botones al contenedor
		contenedor.add(boton1);
		contenedor.add(boton2);
		// Medida de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JButton getBoton1() {
		return boton1;
	}
}