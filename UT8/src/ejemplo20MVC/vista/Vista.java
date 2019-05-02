package ejemplo20MVC.vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame {
	private JPanel panel1, panel2, panel3;
	private JTextField campo1, campo2, campo3;
	private JButton boton;

	public Vista() {
		// LLamada al constructor de JFrame y ponemos el título
		super("Ejemplo patrón MVC");
		Container contenedor = getContentPane();
		BorderLayout gestorDiseñoContenedor = new BorderLayout();
		contenedor.setLayout(gestorDiseñoContenedor);
		// Panel para la zona norte con el título
		panel1 = crearPanel1();
		contenedor.add(panel1, BorderLayout.NORTH);
		// Panel para el centro del panel de contenido
		panel2 = crearPanel2();
		contenedor.add(panel2, BorderLayout.CENTER);
		// Panel para la zona sur
		panel3 = crearPanel3();
		contenedor.add(panel3, BorderLayout.SOUTH);
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	// Crear panel panel1
	JPanel crearPanel1() {
		JPanel panel = new JPanel();
		FlowLayout gestorDiseño = new FlowLayout();
		panel.setLayout(gestorDiseño);
		JLabel titulo = new JLabel("ESTE PROGRAMA SUMA DOS NÚMEROS");
		panel.add(titulo);
		return panel;
	}

	// Crear el panel2
	JPanel crearPanel2() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		FlowLayout gestorDiseño = new FlowLayout();
		panel.setLayout(gestorDiseño);
		campo1 = new JTextField(5);
		campo2 = new JTextField(5);
		campo3 = new JTextField(5);
		// campo3.setEditable(false);
		JLabel etiqueta1 = new JLabel("+");
		JLabel etiqueta2 = new JLabel("=");
		panel.add(campo1);
		panel.add(etiqueta1);
		panel.add(campo2);
		panel.add(etiqueta2);
		panel.add(campo3);

		campo3.setEnabled(true);
		//campo3.setEditable(false);
		return panel;
	}

	// Crear el panel 3
	JPanel crearPanel3() {
		JPanel panel = new JPanel();
		FlowLayout gestorDiseño = new FlowLayout();
		panel.setLayout(gestorDiseño);
		boton = new JButton("Sumar");
		panel.add(boton);
		return panel;
	}

	// Acceder a los atributos
	public JPanel getPanel1() {
		return panel1;
	}

	public JPanel getPanel2() {
		return panel2;
	}

	public JPanel getPanel3() {
		return panel3;
	}

	public JTextField getCampo3() {
		return campo3;
	}

	public void setCampo3(String a) {
		campo3.setText(a);
	}

	public JTextField getCampo1() {
		return campo1;
	}

	public JTextField getCampo2() {
		return campo2;
	}

	public JButton getBoton() {
		return boton;
	}
}