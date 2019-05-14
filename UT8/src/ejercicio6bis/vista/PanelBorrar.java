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

import ejercicio6bis.controlador.Controlador;
import ejercicio6bis.modelo.Biblioteca;

import javax.swing.border.BevelBorder;

public class PanelBorrar extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textoCodigo;
	private JTextField textoAutor;
	private JComboBox<String> comboBox;
	private JButton botonborrar;
	

	//private DefaultComboBoxModel<String> modelo;
	
	//private JButton btnLimpiar;
	
	public PanelBorrar() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setSize(513,300);
		
		
		ponerGestor();

		labelBorrar();
		
		labelTitulo();
				
				comboBox = new JComboBox<String>();
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.weightx = 1.0;
				gbc_comboBox.gridwidth = 4;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 3;
				add(comboBox, gbc_comboBox);
		
				poderCodigo();
		
				textCodigo();

		ponerAutor();

		textAutor();

		ponerBotonBorrar();
	}

	private void ponerBotonBorrar() {
		botonborrar = new JButton("Borrar");

		GridBagConstraints gbc_botonborrar = new GridBagConstraints();
		gbc_botonborrar.gridwidth = 2;

		gbc_botonborrar.weighty = 1.0;
		gbc_botonborrar.weightx = 1.0;
		gbc_botonborrar.insets = new Insets(0, 0, 5, 5);
		gbc_botonborrar.gridx = 2;
		gbc_botonborrar.gridy = 6;
		add(botonborrar, gbc_botonborrar);
	}
	
	public String getTitulo(){
		String titulo = (String) comboBox.getSelectedItem();
		
		return titulo;
		
		
	}

	private void textAutor() {
		textoAutor = new JTextField();
		GridBagConstraints gbc_textoAutor = new GridBagConstraints();
		gbc_textoAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoAutor.weightx = 1.0;
		gbc_textoAutor.insets = new Insets(0, 0, 5, 5);
		gbc_textoAutor.gridwidth = 4;
		gbc_textoAutor.gridx = 1;
		gbc_textoAutor.gridy = 5;
		add(textoAutor, gbc_textoAutor);
		textoAutor.setColumns(10);
	}

	private void ponerAutor() {
		JLabel lblNewLabel_2 = new JLabel("   Autor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 1.0;
		gbc_lblNewLabel_2.weightx = 1.0;
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
	}

	private void textCodigo() {
		textoCodigo = new JTextField();
		GridBagConstraints gbc_textoCodigo = new GridBagConstraints();
		gbc_textoCodigo.gridwidth = 2;
		gbc_textoCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_textoCodigo.gridx = 1;
		gbc_textoCodigo.gridy = 4;
		add(textoCodigo, gbc_textoCodigo);
		textoCodigo.setColumns(10);
	}

	private void poderCodigo() {
		JLabel lblNewLabel = new JLabel("   Código");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 1.0;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
	}

	private void labelTitulo() {
		JLabel lblNewLabel_1 = new JLabel("   Título");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 1.0;
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
	}

	private void labelBorrar() {
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
	}

	private void ponerGestor() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 54, 86, 73, 139, 150 };
		gridBagLayout.rowHeights = new int[] { 40, 22, 30, 20, 20, 20, 24, 23, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
		
	}

	public void setTextFieldCodigo(String textField) {
		textoCodigo.setText(textField);
	}

	public void setTextFieldAutor(String textField_2) {
		textoAutor.setText(textField_2);
<<<<<<< HEAD
	}

	public JTextField getTextoCodigo() {
		return textoCodigo;
	}

	public JTextField getTextoAutor() {
		return textoAutor;
=======
>>>>>>> refs/remotes/origin/master
	}
	
	public JButton getBotonborrar() {
		return botonborrar;
	}
}
