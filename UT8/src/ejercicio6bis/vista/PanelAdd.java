package ejercicio6bis.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;


import javax.swing.JLabel;


import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import ejercicio6bis.modelo.Libro;

import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class PanelAdd extends JPanel {

	private static final long serialVersionUID = -4747973713418972726L;
	private JTextField campoCodigo;
	private JTextField campoTitulo;
	private JTextField campoAutor;
	private JButton btnLimpiar;
	private JButton btnNewButton;

	public PanelAdd() {
		//Border y tamaño
		ponerBorder();
		this.setSize(550, 300);
		
		//Insertar gestor en en panel
		ponerGestor();

		//Insertar los labels y los JTextField a nuestro panel mediante metodos
		ponerTituloPanel();
		ponerLabelCodigo();
		ponerTFCodigo();
		ponerLabelTitulo();
		ponerTFTitulo();
		ponerLabelAutor();
		ponerTFAutor();

//		btnNewButton = new JButton("Guardar");
//
//		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
//		gbc_btnNewButton.gridwidth = 2;
//
//		gbc_btnNewButton.weighty = 1.0;
//		gbc_btnNewButton.weightx = 1.0;
//		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
//		gbc_btnNewButton.gridx = 2;
//		gbc_btnNewButton.gridy = 6;
//		add(btnNewButton, gbc_btnNewButton);
//
//		btnLimpiar = new JButton("Limpiar");
//		btnLimpiar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				limpiarTexto();
//
//			}
//		});
//		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
//		gbc_btnLimpiar.gridwidth = 2;
//		gbc_btnLimpiar.weighty = 1.0;
//		gbc_btnLimpiar.weightx = 1.0;
//		gbc_btnLimpiar.gridx = 2;
//		gbc_btnLimpiar.gridy = 7;
//		add(btnLimpiar, gbc_btnLimpiar);

	}

	private void ponerBorder() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	}

	private void ponerTFAutor() {
		campoAutor = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.weighty = 1.0;
		gbc_textField_2.weightx = 1.0;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 5;
		add(campoAutor, gbc_textField_2);
		campoAutor.setColumns(10);
	}

	private void ponerLabelAutor() {
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
	}

	private void ponerTFTitulo() {
		campoTitulo = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.weighty = 1.0;
		gbc_textField_1.weightx = 1.0;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		add(campoTitulo, gbc_textField_1);
		campoTitulo.setColumns(10);
	}

	private void ponerLabelTitulo() {
		JLabel lblNewLabel_1 = new JLabel("   Título");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 1.0;
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
	}

	private void ponerTFCodigo() {
		campoCodigo = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.weighty = 1.0;
		gbc_textField.weightx = 1.0;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		add(campoCodigo, gbc_textField);
		campoCodigo.setColumns(10);
	}

	private void ponerLabelCodigo() {
		JLabel lblNewLabel = new JLabel("   Código");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 1.0;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
	}

	private void ponerTituloPanel() {
		JLabel lblNuevosLibros = new JLabel("NUEVOS LIBROS");
		lblNuevosLibros.setFont(new Font("Arial", Font.BOLD, 26));
		GridBagConstraints gbc_lblNuevosLibros = new GridBagConstraints();
		gbc_lblNuevosLibros.gridwidth = 2;
		gbc_lblNuevosLibros.weighty = 1.0;
		gbc_lblNuevosLibros.weightx = 1.0;
		gbc_lblNuevosLibros.insets = new Insets(0, 0, 5, 0);
		gbc_lblNuevosLibros.gridx = 2;
		gbc_lblNuevosLibros.gridy = 1;
		add(lblNuevosLibros, gbc_lblNuevosLibros);
	}

	private void ponerGestor() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {54, 86, 73, 139, 75, 75};
		gridBagLayout.rowHeights = new int[] {40, 22, 30, 20, 20, 20, 30, 30, 30};
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
	}

	public void limpiarTexto() {

		campoCodigo.setText(" ");
		campoTitulo.setText(" ");
		campoAutor.setText(" ");
		campoCodigo.requestFocus();

	}

	public Libro crearLibro() {

	    String a = campoCodigo.getText();
		String b = campoTitulo.getText();
		String c = campoAutor.getText();
		Libro libro = new Libro(a, b, c);
		return libro;
	}

	public JButton getLimpiar() {
		return btnLimpiar;
	}

	public JButton getGuardar() {
		return btnNewButton;
	}
}
