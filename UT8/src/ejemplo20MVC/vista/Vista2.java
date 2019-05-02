package ejemplo20MVC.vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista2 extends JFrame {
	private JPanel panel1, panel2, panel3;
	private JTextField campo3;
	private JButton boton;
	private int[] numero;
	private JComboBox<Integer> campo1, campo2;

	public Vista2() {
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
		this.setLocationRelativeTo(null);
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
		numero = new int[9];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = i + 1;
		}
		campo1 = new JComboBox<Integer>();
		campo2 = new JComboBox<Integer>();
		for (int i = 0; i < numero.length; i++) {
			campo1.addItem(new Integer(numero[i]));
			campo2.addItem(new Integer(numero[i]));
		}
		campo3 = new JTextField(5);
		// campo3.setEditable(false);
		JLabel etiqueta1 = new JLabel("+");
		JLabel etiqueta2 = new JLabel("=");
		panel.add(campo1);
		panel.add(etiqueta1);
		panel.add(campo2);
		panel.add(etiqueta2);
		panel.add(campo3);
		// campo3.setEditable(false);
		campo3.setEnabled(false);
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
	public JComboBox<Integer> getCampo1() {
		return campo1;
	}

	public JComboBox<Integer> getCampo2() {
		return campo2;
	}

	public JButton getBoton() {
		return boton;
	}

	// Dar valor al resultado de la suma
	public void setCampo3(String a) {
		campo3.setText(a);
	}
}
