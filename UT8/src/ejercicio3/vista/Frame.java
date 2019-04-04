package ejercicio3.vista;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Frame extends JFrame {
	
	
	public Frame() {
		getContentPane().setForeground(Color.BLACK);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Verde", "Azul", "Morado"}));
		getContentPane().add(comboBox, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Segundo plano");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setForeground(Color.BLUE);
		chckbxNewCheckBox.setBounds(78, 24, 121, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxPrimerPlano = new JCheckBox("Primer plano");
		chckbxPrimerPlano.setForeground(Color.BLUE);
		chckbxPrimerPlano.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxPrimerPlano.setBounds(227, 24, 134, 23);
		panel.add(chckbxPrimerPlano);
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = -4892418694164186384L;
}
