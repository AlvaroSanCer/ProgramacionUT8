package ejercicio6bis.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

import ejercicio6bis.modelo.Libro;

import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAdd extends JPanel {
	
	private static final long serialVersionUID = -4747973713418972726L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnLimpiar;
	private JButton btnNewButton;
	
	public PanelAdd() {
		
		this.setSize(550,300);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {54, 86, 73, 139, 150};
		gridBagLayout.rowHeights = new int[] {40, 22, 30, 20, 20, 20, 24, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNuevosLibros = new JLabel("Nuevos Libros");
		lblNuevosLibros.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNuevosLibros = new GridBagConstraints();
		gbc_lblNuevosLibros.gridwidth = 2;
		gbc_lblNuevosLibros.weighty = 1.0;
		gbc_lblNuevosLibros.weightx = 1.0;
		gbc_lblNuevosLibros.insets = new Insets(0, 0, 5, 0);
		gbc_lblNuevosLibros.gridx = 2;
		gbc_lblNuevosLibros.gridy = 1;
		add(lblNuevosLibros, gbc_lblNuevosLibros);
		
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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.weighty = 1.0;
		gbc_textField.weightx = 1.0;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
	add(textField, gbc_textField);
		textField.setColumns(10);
		
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
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.weighty = 1.0;
		gbc_textField_1.weightx = 1.0;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
	add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
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
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 5;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			crearLibro();	
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		
		gbc_btnNewButton.weighty = 1.0;
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 6;
	add(btnNewButton, gbc_btnNewButton);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpiarTexto();
			
			}
		});
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.gridwidth = 2;
		gbc_btnLimpiar.weighty = 1.0;
		gbc_btnLimpiar.weightx = 1.0;
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 7;
		add(btnLimpiar, gbc_btnLimpiar);
		
	
	}
	

    public void limpiarTexto() {
    	
    		textField.setText(" ");
    		textField_1.setText(" ");
    		textField_2.setText(" ");
    		textField.requestFocus();
    	
    }
    
    public Libro crearLibro() {
    	int a= Integer.parseInt(textField.getText());
    	String b= textField_1.getText();
    	String c= textField_2.getText();
    	Libro libro = new Libro(a,b,c);
    	return libro;
    }
	
	public JButton getLimpiar() {
		return btnLimpiar;
	}
	public JButton getGuardar() {
		return btnNewButton;
	}
	}

