package ejercicio6bis.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PanelListar extends JPanel {

	private static final long serialVersionUID = -4706621000757970752L;
	
	//private BoderLayout gestorDiseño;
	private JLabel titulo;
	private JTable tabla;

	
	public PanelListar(){
		BorderLayout gestorDiseño= new BorderLayout();
		gestorDiseño.setHgap(15);
		gestorDiseño.setVgap(15);
		this.setLayout(gestorDiseño);
		this.setOpaque(true);
		
		titulo = new JLabel("LISTADO DE LIBROS");
		titulo.setBorder(new EmptyBorder(10,0,10,0));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Arial", Font.BOLD, 23));
		titulo.setBounds(120,37,150,14);
		titulo.setHorizontalTextPosition(SwingConstants.CENTER);
		add(titulo,BorderLayout.NORTH);
		
		tabla = new JTable();
		tabla.setPreferredScrollableViewportSize(new Dimension(300,50));
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(new Rectangle(10,0,10,0));
		this.add(scroll, BorderLayout.CENTER);
	}
	
	public JTable getTabla(){
		return tabla;
	}


	
	
}
