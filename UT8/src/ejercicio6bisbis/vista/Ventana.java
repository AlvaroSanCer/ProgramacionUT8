package ejercicio6bisbis.vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	public static Object lblTextoDeEjemplo;
	// Atributos
	private JMenu [] menu;
	private Container contenedor;
	private PanelInicio panelInicio;
	private JMenuItem[] itemMenu;
	private BarraMenu barra;
	
	
	public Ventana() {
		super("");
		
		// Crear barra de menú
		barra = new BarraMenu();
		this.setJMenuBar(barra);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		//contenedor = this.getContentPane();// Obtener el panel de la ventana
		//getContentPane().setLayout(null);
		
		BorderLayout gestorDiseño = new BorderLayout();
		contenedor= this.getContentPane();
		contenedor.setLayout(gestorDiseño);
		PanelSur panelSur = new PanelSur();
		contenedor.add(panelSur,BorderLayout.SOUTH);
		
		JPanel panelBase = new JPanel();
		panelBase.setBorder(BorderFactory.createEmptyBorder(5,30,5,30));
		CardLayout gestorCard = new CardLayout();
		panelBase.setLayout(gestorCard);
		
		PanelInicio panelInicio = new PanelInicio();
		panelBase.add(panelInicio);
		
		contenedor.add(panelBase,BorderLayout.CENTER);
	
		// Para el icono de la ventana
		//icono = new ImageIcon("src/imagenes/icono.gif");
		//imagenIcono = icono.getImage();
		//this.setIconImage(imagenIcono);	
		
	}// Fin del constructor
	
	// Para que la ventana se adapte
	void mostrarApariencias() {
		UIManager.LookAndFeelInfo[] apariencias;
		apariencias = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < apariencias.length; i++) {
			System.out.println(apariencias[i] + "\n");
		}
	}
	
	// Clase para gestionar el cambio de color
	class GestorAction implements ActionListener {
		// Creo un array con los colores que tendrá el contenedor
		final Color[] colores = { Color.BLUE, Color.YELLOW, Color.RED };

		public void actionPerformed(ActionEvent e) {
			// Según la opción de menú seleccionada cambio el
			// color del contenedor
			for (int j = 0; j < colores.length; j++) {
				if (e.getSource().equals(itemMenu[j])) {
					contenedor.setBackground(colores[j]);
				}
			}
		}
	}// Fin de la clase GestorAction

	public BarraMenu getBarra() {
		// TODO Apéndice de método generado automáticamente
		return barra;
	}
		
}// Fin de la clase Ventana
