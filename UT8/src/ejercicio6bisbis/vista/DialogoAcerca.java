package ejercicio6bisbis.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoAcerca extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoAcerca frame = new DialogoAcerca();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DialogoAcerca() {
		setTitle("Acerca de Gestión de Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panel = new PanelImagen();	
		panel.setBounds(10, 11, 227, 170);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(DialogoAcerca.class.getResource("/Imagenes/libros.jpg")));
		
		
		JLabel lblNewLabel = new JLabel("Gestión de Biblioteca");
		lblNewLabel.setBounds(247, 60, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVersin = new JLabel("Versión 1.0");
		lblVersin.setBounds(247, 85, 116, 14);
		contentPane.add(lblVersin);
		
		JLabel lblc = new JLabel("(c) Copyright CIFP Juan de Colonia");
		lblc.setBounds(247, 110, 177, 14);
		contentPane.add(lblc);
		
		JLabel lblAutora = new JLabel("Autor/a: Alvaro Santillana Cernuda");
		lblAutora.setBounds(247, 135, 153, 14);
		contentPane.add(lblAutora);
		
		JLabel lblFecha = new JLabel("Fecha: 03/05/2109");
		lblFecha.setBounds(247, 160, 153, 14);
		contentPane.add(lblFecha);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		btnNewButton.setBounds(164, 221, 89, 23);
		contentPane.add(btnNewButton);
	}
}
