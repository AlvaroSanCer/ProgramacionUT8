package ejercicio6bis.controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import ejercicio6bis.modelo.Biblioteca;

import ejercicio6bis.vista.AcercaDe;
import ejercicio6bis.vista.MenuContextual;
import ejercicio6bis.vista.PanelAdd;
import ejercicio6bis.vista.PanelBorrar;
import ejercicio6bis.vista.Ventana;
import ejercicio6bis.modelo.*;

public class Controlador implements ActionListener {

	private Ventana ventana;
	private JMenuItem[] opcionesMenu;
	private AcercaDe dialogoacercade;
	private PanelAdd paneladd;
	private Biblioteca biblioteca;
	private PanelBorrar panelborrar;
	private String[] titulos;
	//private MenuContextual menuContextual;
	private JMenuItem[] itemContextual ;
	private JPopupMenu pmenu;
	private Libro libro;
	public Controlador() {

		ventana = new Ventana();
		biblioteca = new Biblioteca();
		paneladd = ventana.getPanelAdd();
		panelborrar = ventana.getPanelborrar();
		dialogoacercade = new AcercaDe();
		ventana.getBarra().MostrarInicio();
		
		pmenu = new JPopupMenu();
		
		final JPopupMenu colorMenu = new JPopupMenu("Color");
	    colorMenu.add(makeMenuItem("Guardar"));
	    colorMenu.add(makeMenuItem("Limpiar"));
	   
		
	    MouseListener mouseListener = new MouseAdapter() {
	        public void mousePressed(MouseEvent e) {
	          checkPopup(e);
	        }

	        public void mouseClicked(MouseEvent e) {
	          checkPopup(e);
	        }

	        public void mouseReleased(MouseEvent e) {
	          checkPopup(e);
	        }

	        private void checkPopup(MouseEvent e) {
	          if (e.isPopupTrigger()) {
	            
	            colorMenu.show(paneladd, e.getX(), e.getY());
	          }
	        }
	      };
		paneladd.addMouseListener(mouseListener);
		

		// Trabajar con las opciones de Menu.

		opcionesMenu = ventana.getBarra().getItemMenu();
		asociarOyenteOPcionesMenu();

	}

	private void asociarOyenteOPcionesMenu() {
		for (int i = 0; i < opcionesMenu.length; i++) {
			opcionesMenu[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String color = e.getActionCommand();
		if (e.getSource().equals(opcionesMenu[2])) {
			System.exit(0);
		} else if (e.getSource().equals(opcionesMenu[1])) {
			dialogoacercade.setLocationRelativeTo(ventana);
			dialogoacercade.setVisible(true);
		} else if (dialogoacercade.isVisible()) {
			dialogoacercade.setVisible(false);
		} else if (e.getSource().equals(opcionesMenu[0])) {
			ventana.setTitle(JOptionPane.showInputDialog("Nombre de la biblioteca"));
			ImageIcon ImageIcon = new ImageIcon("src/imagenes/libros.jpg");
			Image image = ImageIcon.getImage();
			ventana.getBarra().MostrarItemMenuBiblioteca();
			ventana.setIconImage(image);
			ventana.getBarra().MostrarItemMenuBiblioteca();
			ventana.getBarra().getItemMenu()[0].setEnabled(false);
		} else if (e.getSource().equals(opcionesMenu[3])) {
			ventana.getPanelAdd().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
		} else if (e.getSource().equals(opcionesMenu[4])) {
			titulos = biblioteca.getTitulos();
			panelborrar.getComboBox().setModel(new DefaultComboBoxModel<String>(titulos));
			
			
			String a =biblioteca.devolverAutor( panelborrar.getTitulo());
			String b =biblioteca.devolverCodigo( panelborrar.getTitulo());
			panelborrar.setTextFieldAutor(a);
			panelborrar.setTextFieldCodigo(b);
			
			
			
			ventana.getPanelborrar().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
			ventana.getPanelAdd().setVisible(false);
			 {
				
			}
			
		} else if (e.getSource().equals(opcionesMenu[5])) {
			ventana.getPanelListar().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
			ventana.getPanelAdd().setVisible(false);
			ventana.getPanelborrar().setVisible(false);
		} else if (color.equals("Guardar")) {
			biblioteca.addLibro(ventana.getPanelAdd().crearLibro());
			ventana.getPanelAdd().limpiarTexto();
			ventana.getPanelAdd().setVisible(false);
			ventana.getPanelInicio().setVisible(true);
		} else if (color.equals("Limpiar")) {
			ventana.getPanelAdd().limpiarTexto();
		}

	}

	public Ventana getVentana() {
		return ventana;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	
	private JMenuItem makeMenuItem(String label) {
	    JMenuItem item = new JMenuItem(label);
	    item.addActionListener(this);
	    return item;
	  }


}
