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
	PanelAdd paneladd;
	PanelBorrar panelborrar;
	private BarraMenu barra;
	PanelListar panellistar;

	public Ventana() {
		barra = new BarraMenu();
		this.setJMenuBar(barra);
		this.setTitle("");
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
		
		paneladd= new PanelAdd();
		panelBase.add(paneladd);
		paneladd.setVisible(false);
		
		panelborrar= new PanelBorrar();
		panelBase.add(panelborrar);
		panelborrar.setVisible(false);
		
		
		 panellistar = new PanelListar();
		 panelBase.add(panellistar);
		 panellistar.setVisible(false);
		
		
		
		contenedor.add(panelBase, BorderLayout.CENTER);
		
	}

	public BarraMenu getBarra() {
		return barra;
	}

	public void setBarra(BarraMenu barra) {
		this.barra = barra;
	}
	
	public PanelAdd getPanelAdd(){
		return paneladd;
		
	}

	public PanelInicio getPanelInicio(){
		return panelInicio;
	}

	public PanelBorrar getPanelborrar() {
		return panelborrar;
	}
	public PanelListar getPanelListar(){
		return panellistar;
	}
}
