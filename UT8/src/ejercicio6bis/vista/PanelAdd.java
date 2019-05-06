package ejercicio6bis.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelAdd extends JPanel {
	
	public PanelAdd() {
		setBorder(null);
		setLayout(null);
		
		JLabel lblAadirLibro = new JLabel("Añadir Libro");
		lblAadirLibro.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAadirLibro.setBounds(142, 60, 152, 26);
		add(lblAadirLibro);
		
	
	}

	
	private static final long serialVersionUID = -4747973713418972726L;
}
