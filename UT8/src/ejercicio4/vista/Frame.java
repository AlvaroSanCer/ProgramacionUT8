package ejercicio4.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Font;

public class Frame extends JFrame{


	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private BorderLayout gestor1;
	private JPanel panel1,panel2,panel3,panel4;
	private JButton boton1,boton2,boton3,botonA,botonB,botonC,botonListo,botonn1,botonn2,botonn3;
	private JTextField texto;
	private JLabel label;
	
	
	public Frame() {
		super("Ejercicio 4  - Alvaro Santillana Cernuda");
		contenedor = this.getContentPane();
		contenedor.setForeground(Color.LIGHT_GRAY);
		this.setSize(400,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gestor1 = new BorderLayout();
		
		panel1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel1.setBackground(Color.CYAN);
		contenedor.add(panel1, BorderLayout.NORTH);
		
		
		boton1 = new JButton("Botón 1");
		boton2 = new JButton("Botón 2");
		boton3 = new JButton("Botón 3");
		panel1.add(boton1);
		panel1.add(boton2);
		panel1.add(boton3);
		
		
		panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		contenedor.add(panel2, BorderLayout.WEST);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		
		botonn1 = new JButton("1");
		botonn2 = new JButton("2");
		botonn3 = new JButton("3");
		panel2.add(botonn1);
		panel2.add(botonn2);
		panel2.add(botonn3);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		contenedor.add(panel3, BorderLayout.EAST);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		botonA = new JButton("A");
		botonB = new JButton("B");
		botonC = new JButton("C");
		panel3.add(botonA);
		panel3.add(botonB);
		panel3.add(botonC);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.YELLOW);
		contenedor.add(panel4, BorderLayout.SOUTH);
		
		
		label = new JLabel("Pon texto");
		label.setFont(new Font("Arial", Font.BOLD, 12));
		texto = new JTextField(18);
		botonListo = new JButton("Listo");
		panel4.add(label);
		panel4.add(texto);
		panel4.add(botonListo);
		
		
		
		
		
		
	}
	
	

}
