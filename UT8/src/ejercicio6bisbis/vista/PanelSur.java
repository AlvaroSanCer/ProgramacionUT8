package ejercicio6bisbis.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

public class PanelSur extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5733206120726044753L;

	public PanelSur (){
		setBorder(new EmptyBorder(5,5, 5, 5));
		FlowLayout flowLayout = (FlowLayout)getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		
		JLabel lblAutorAlvaroSantillana = new JLabel("Autor: Alvaro Santillana Cernuda");
		lblAutorAlvaroSantillana.setVerticalAlignment(SwingConstants.BOTTOM);
		add(lblAutorAlvaroSantillana);	
	}

}
