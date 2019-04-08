package ejercicio3.vista;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Frame extends JFrame {

	private static final long serialVersionUID = -4892418694164186384L;
	private Container contenedor;
	private DefaultComboBoxModel<String> modelo;
	private JComboBox<String> combo;
	private BorderLayout gestor;
	private JPanel panelArriba, panelCentral, panelInferior;
	private JCheckBox chbox1, chbox2;

	public Frame() {

		// Configuracion inicial del Contenedor principal.
		super("Ejercicio 3 - Alvaro Santillana Cernuda");
		contenedor = this.getContentPane();
		contenedor.setForeground(Color.BLACK);
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Primer Panel - BorderLayout.
		panelArriba = new JPanel();
		gestor = new BorderLayout(0, 0);
		panelArriba.setBackground(new Color(102, 153, 204));
		panelArriba.setLayout(gestor);
		contenedor.add(panelArriba, BorderLayout.NORTH);

		// Componente ComboBox
		crearModelo();
		combo = new JComboBox<>(modelo);
		combo.setForeground(Color.BLACK);
		combo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		combo.setBackground(Color.GREEN);
		panelArriba.add(combo);

		// Segundo Panel - Absolute.
		panelCentral = new JPanel();
		contenedor.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);

		// Componentes CheckBox.
		chbox1 = new JCheckBox("Segundo plano");
		chbox1.setFont(new Font("Tahoma", Font.BOLD, 13));
		chbox1.setForeground(Color.BLUE);
		chbox1.setBounds(78, 24, 121, 23);
		panelCentral.add(chbox1);

		chbox2 = new JCheckBox("Primer plano");
		chbox2.setForeground(Color.BLUE);
		chbox2.setFont(new Font("Tahoma", Font.BOLD, 13));
		chbox2.setBounds(227, 24, 134, 23);
		chbox2.setSelected(true);
		panelCentral.add(chbox2);

		// Tercer Panel -
		panelInferior = new JPanel();
		panelInferior.setBackground(Color.CYAN);
		contenedor.add(panelInferior, BorderLayout.SOUTH);

		// Componentes Boton.
		JButton boton1 = new JButton("Aceptar");
		panelInferior.add(boton1);

		JButton boton2 = new JButton("Cancelar");
		panelInferior.add(boton2);
	}

	/**
	 * Metodo para introducir elementos de tipo String como opciones a nuestro
	 * JComboBox.
	 */

	public void crearModelo() {
		modelo = new DefaultComboBoxModel<>();
		modelo.addElement("Rojo");
		modelo.addElement("Verde");
		modelo.addElement("Azul");
		modelo.addElement("Morado");
	}

}
