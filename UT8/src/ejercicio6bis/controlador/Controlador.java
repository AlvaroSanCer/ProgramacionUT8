package ejercicio6bis.controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import ejercicio6bis.modelo.Biblioteca;
import ejercicio6bis.modelo.Libro;
import ejercicio6bis.vista.AcercaDe;
import ejercicio6bis.vista.MenuContextual;
import ejercicio6bis.vista.PanelAdd;
import ejercicio6bis.vista.PanelBorrar;
import ejercicio6bis.vista.Ventana;

public class Controlador implements ActionListener {

	private Ventana ventana;
	private JMenuItem[] opcionesMenu;
	private AcercaDe dialogoacercade;
	private PanelAdd paneladd;
	private Biblioteca biblioteca;
	private PanelBorrar panelborrar;
	private String[] titulos;
	private MenuContextual menuContextual;
	private JMenuItem[] itemContextual;

	public Controlador() {

		ventana = new Ventana();
		biblioteca = new Biblioteca();
		paneladd = ventana.getPanelAdd();
		panelborrar = ventana.getPanelborrar();
		dialogoacercade = new AcercaDe();
		menuContextual = new MenuContextual();

		// Trabajar con las opciones de Menu.

		opcionesMenu = ventana.getBarra().getItemMenu();
		asociarOyenteOPcionesMenu();
		
		GestorMouse gestormouse = new GestorMouse();
		paneladd.addMouseListener(gestormouse);

		itemContextual = menuContextual.getItems();
		for (int i = 0; i < itemContextual.length; i++) {
			itemContextual[i].addActionListener(this);
		}

		// Trabajar con el JDialog AcercaDe.

		// dialogoacercade.getAceptarAcerca().addActionListener(this);

		// Trabajar con los paneles

		// ventana.getPanelAdd().getGuardar().addActionListener(this);

		// Desactivar las opciones del menu Libro

		ventana.getBarra().MostrarInicio();

		// ventana.getPanelAdd().getGuardar()
		// .addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// biblioteca.addLibro(ventana.getPanelAdd().crearLibro());
		// ventana.getPanelAdd().limpiarTexto();
		// ventana.getPanelAdd().setVisible(false);
		// ventana.getPanelInicio().setVisible(true);
		//
		// }
		// });

		// ventana.getPanelAdd().getLimpiar()
		// .addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// ventana.getPanelAdd().limpiarTexto();
		//
		// }
		// });

	}

	private void asociarOyenteOPcionesMenu() {
		for (int i = 0; i < opcionesMenu.length; i++) {
			opcionesMenu[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(opcionesMenu[2])) {
			System.exit(0);
		} else if (e.getSource().equals(opcionesMenu[1])) {
			dialogoacercade.setLocationRelativeTo(ventana);
			dialogoacercade.setVisible(true);
		} else if (dialogoacercade.isVisible()) {
			dialogoacercade.setVisible(false);

		} else if (e.getSource().equals(opcionesMenu[0])) {
			ventana.setTitle(JOptionPane
					.showInputDialog("Nombre de la biblioteca"));
			ImageIcon ImageIcon = new ImageIcon("src/imagenes/libros.jpg");
			Image image = ImageIcon.getImage();
			ventana.setIconImage(image);
			ventana.getBarra().MostrarItemMenuBiblioteca();
			ventana.getBarra().getItemMenu()[0].setEnabled(false);

		} else if (e.getSource().equals(opcionesMenu[3])) {
			ventana.getPanelAdd().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
		} else if (e.getSource().equals(opcionesMenu[4])) {
			titulos = biblioteca.getTitulos();
			panelborrar.getComboBox().setModel(
					new DefaultComboBoxModel<String>(titulos));
			panelborrar.getTitulo();

			ventana.getPanelborrar().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
			ventana.getPanelAdd().setVisible(false);
		} else if (e.getSource().equals(opcionesMenu[5])) {
			ventana.getPanelListar().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
			ventana.getPanelAdd().setVisible(false);
			ventana.getPanelborrar().setVisible(false);
		} else if (e.getSource().equals(itemContextual[0])) {
			biblioteca.addLibro(ventana.getPanelAdd().crearLibro());
			ventana.getPanelAdd().limpiarTexto();
			ventana.getPanelAdd().setVisible(false);
			ventana.getPanelInicio().setVisible(true);
		} else if (e.getSource().equals(itemContextual[1])) {
			ventana.getPanelAdd().limpiarTexto();
		}

	}

	public Ventana getVentana() {
		return ventana;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	class GestorMouse extends MouseAdapter {
		public void mousePressed(MouseEvent evento) {
			if (evento.isPopupTrigger()) {
				menuContextual.show(paneladd, evento.getX(), evento.getY());
			}
		}

		public void mouseReleased(MouseEvent evento) {
			if (evento.isPopupTrigger()) {
				menuContextual.show(paneladd, evento.getX(), evento.getY());
			}
		}

	}

}

// }
