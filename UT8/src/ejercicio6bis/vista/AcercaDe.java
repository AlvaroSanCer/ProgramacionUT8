package ejercicio6bis.vista;




import javax.swing.JDialog;


import javax.swing.JLabel;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class AcercaDe extends JDialog {

	private static final long serialVersionUID = 1L;

	public AcercaDe() {
		setModal(true);
		// getContentPane().setVisible(true);
		setSize(550, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();

		gridBagLayout.columnWidths = new int[] { 31, 173, 80, 200, 31 };

		gridBagLayout.columnWidths = new int[] { 31, 191, 80, 200, 31 };

		gridBagLayout.rowHeights = new int[] { 30, 29, 29, 29, 29, 29, 15, 0, 25 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		getContentPane().setLayout(gridBagLayout);

		PanelImagen panel = new PanelImagen();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.weightx = 1.0;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridheight = 6;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		JLabel lblNewLabel = new JLabel("Gestión de Biblioteca");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblVersin = new JLabel("Versión 1.0");
		GridBagConstraints gbc_lblVersin = new GridBagConstraints();
		gbc_lblVersin.anchor = GridBagConstraints.WEST;
		gbc_lblVersin.insets = new Insets(0, 0, 5, 0);
		gbc_lblVersin.gridx = 3;
		gbc_lblVersin.gridy = 2;
		getContentPane().add(lblVersin, gbc_lblVersin);

		JLabel lblc = new JLabel("(c) Copyright CIFP Juan de Colonia");
		GridBagConstraints gbc_lblc = new GridBagConstraints();
		gbc_lblc.anchor = GridBagConstraints.WEST;
		gbc_lblc.insets = new Insets(0, 0, 5, 0);
		gbc_lblc.gridx = 3;
		gbc_lblc.gridy = 3;
		getContentPane().add(lblc, gbc_lblc);

		JLabel lblAutor = new JLabel("Autor/a: Alvaro Santillana Cernuda");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.WEST;
		gbc_lblAutor.insets = new Insets(0, 0, 5, 0);
		gbc_lblAutor.gridx = 3;
		gbc_lblAutor.gridy = 4;
		getContentPane().add(lblAutor, gbc_lblAutor);

		JLabel lblFecha = new JLabel("Fecha: 03/05/2109");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.WEST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 0);
		gbc_lblFecha.gridx = 3;
		gbc_lblFecha.gridy = 5;
		getContentPane().add(lblFecha, gbc_lblFecha);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 7;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
	}



}
