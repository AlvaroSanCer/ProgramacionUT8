package ejercicio6bis.vista;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PanelBorrar extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;
	private JComboBox<String> comboBox;
	//private DefaultComboBoxModel<String> modelo;
	
	//private JButton btnLimpiar;
	
	public PanelBorrar() {
		this.setSize(550,300);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 54, 86, 73, 139, 150 };
		gridBagLayout.rowHeights = new int[] { 40, 22, 30, 20, 20, 20, 24, 23, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNuevosLibros = new JLabel("BORRAR LIBRO");
		lblNuevosLibros.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNuevosLibros = new GridBagConstraints();
		gbc_lblNuevosLibros.gridwidth = 2;
		gbc_lblNuevosLibros.weighty = 1.0;
		gbc_lblNuevosLibros.weightx = 1.0;
		gbc_lblNuevosLibros.insets = new Insets(0, 0, 5, 5);
		gbc_lblNuevosLibros.gridx = 2;
		gbc_lblNuevosLibros.gridy = 1;
		add(lblNuevosLibros, gbc_lblNuevosLibros);
		
				JLabel lblNewLabel_1 = new JLabel("   Título");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_1.weighty = 1.0;
				gbc_lblNewLabel_1.weightx = 1.0;
				gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 0;
				gbc_lblNewLabel_1.gridy = 3;
				add(lblNewLabel_1, gbc_lblNewLabel_1);
				
				comboBox = new JComboBox<String>();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"hola", "holaaa", "hollaaaaaa"}));
				
				//comboBox.setModel(new DefaultComboBoxModel(new String[] {"hol", "adi"}));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 3;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 3;
				add(comboBox, gbc_comboBox);
		
				JLabel lblNewLabel = new JLabel("   Código");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.weighty = 1.0;
				gbc_lblNewLabel.weightx = 1.0;
				gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 4;
				add(lblNewLabel, gbc_lblNewLabel);
		
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.weighty = 1.0;
				gbc_textField.weightx = 1.0;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 4;
				add(textField, gbc_textField);
				textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("   Autor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 1.0;
		gbc_lblNewLabel_2.weightx = 1.0;
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.weighty = 1.0;
		gbc_textField_2.weightx = 1.0;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 5;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JButton botonborrar = new JButton("Borrar");

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;

		gbc_btnNewButton.weighty = 1.0;
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 6;
		add(botonborrar, gbc_btnNewButton);
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}
}
