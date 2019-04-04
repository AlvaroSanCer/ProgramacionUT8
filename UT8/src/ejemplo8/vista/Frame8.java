package ejemplo8.vista;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame8 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2626830390661665721L;
	private Container contenedor;
	private JLabel etiqueta;

	public Frame8() {

		super("Ejemplo 8");

		// Medida de la ventana
		this.setSize(400, 300);
		contenedor = this.getContentPane();
		contenedor.setLayout(null);

		etiqueta = new JLabel("EJEMPLO CAMPOS DE TEXTO");
		etiqueta.setBounds(31, 11, 190, 14);

		// Pongo la etiqueta en el contenedor
		contenedor.add(etiqueta);

		// Creo el text area
		JTextField campo = new JTextField();
		campo.setBounds(28, 34, 226, 23);
		Font fuente;
		fuente = new Font("Arial", Font.PLAIN, 14);
		campo.setFont(fuente);
		// Añador el textArea
		contenedor.add(campo);
		
		// Creo un boton
		JButton boton1 = new JButton("Aceptar");
		boton1.setBounds(285, 35, 89, 23);
		contenedor.add(boton1);
		
		//Crear nueva etiqueta junto con un CheckBox
		JLabel etiqueta2 = new JLabel("Elige opción:");
		JCheckBox casilla = new JCheckBox();
		casilla.setSelected(true);
		casilla.setBounds(104,62,45,45);
		etiqueta2.setBounds(31,62,90,45);
		contenedor.add(casilla);
		contenedor.add(etiqueta2);
		
		
		//Crear una JTextArea das
		JTextArea area = new JTextArea("ESCRIBE AQUÍ EL TEXTO", 10, 15);
		//contenedor.add(new JScrollPane(area));
		area.setBounds(31,139,267,89);
		contenedor.add(area);
		//contenedor.add(new JTextArea("ESCRIBE AQUÍ EL TEXTO", 10,15);
		
		
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}