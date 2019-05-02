package ejercicio6bis.vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	Container contenedor;
	PanelSur panelSur;
	JPanel panelBase;
	CardLayout gestorCard;
	PanelInicio panelInicio;
	
	private BarraMenu barra;

	public Ventana() {
		barra = new BarraMenu();
		this.setJMenuBar(barra);
		this.setTitle("Biblioteca Nacional");
		BorderLayout gestorDiseño = new BorderLayout();
		
		contenedor = this.getContentPane();
		contenedor.setLayout(gestorDiseño);
		
		panelSur = new PanelSur();
		contenedor.add(panelSur, BorderLayout.SOUTH);
		
		panelBase = new JPanel();
		panelBase.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
		
		gestorCard = new CardLayout();
		panelBase.setLayout(gestorCard);
		
		panelInicio = new PanelInicio();
		panelBase.add(panelInicio);
		
		contenedor.add(panelBase, BorderLayout.CENTER);
	}

}
