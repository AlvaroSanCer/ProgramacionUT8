package ejercicio6bis.controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import ejercicio6bis.modelo.Biblioteca;
import ejercicio6bis.modelo.Libro;
import ejercicio6bis.vista.AcercaDe;
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

	public Controlador() {
		ventana = new Ventana();
		biblioteca = new Biblioteca();
		paneladd = new PanelAdd();
		panelborrar = new PanelBorrar();
		dialogoacercade = new AcercaDe();
		

		// Trabajar con las opciones de Menu.

		opcionesMenu = ventana.getBarra().getItemMenu();
		asociarOyenteOPcionesMenu();

		// Trabajar con el JDialog AcercaDe.

		// dialogoacercade.getAceptarAcerca().addActionListener(this);

		// Trabajar con los paneles
	

		// ventana.getPanelAdd().getGuardar().addActionListener(this);

		// Desactivar las opciones del menu Libro

		ventana.getBarra().MostrarInicio();

		ventana.getPanelAdd().getGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				biblioteca.addLibro(ventana.getPanelAdd().crearLibro());
				ventana.getPanelAdd().limpiarTexto();
				ventana.getPanelAdd().setVisible(false);
				ventana.getPanelInicio().setVisible(true);

			}
		});

		ventana.getPanelAdd().getLimpiar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getPanelAdd().limpiarTexto();

			}
		});

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
			// if(e.getSource().equals(dialogoacercade).getAceptarAcerca())){
			dialogoacercade.setVisible(false);

		} else if (e.getSource().equals(opcionesMenu[0])) {
			ventana.setTitle(JOptionPane.showInputDialog("Nombre de la biblioteca"));
			ImageIcon ImageIcon = new ImageIcon("src/imagenes/libros.jpg");
			Image image = ImageIcon.getImage();
			ventana.setIconImage(image);
			ventana.getBarra().MostrarItemMenuBiblioteca();
			ventana.getBarra().getItemMenu()[0].setEnabled(false);
			

		} else if (e.getSource().equals(opcionesMenu[3])) {
			ventana.getPanelAdd().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
		}else if (e.getSource().equals(opcionesMenu[4])) {
			
			titulos = biblioteca.getTitulos();
			for(int i=0;i>titulos.length;i++){
				System.out.print(titulos[i]);
			}
			panelborrar.getComboBox().setModel(new DefaultComboBoxModel<String>(titulos));
			//panelborrar.setVisible(true);
			ventana.getPanelborrar().setVisible(true);
			ventana.getPanelInicio().setVisible(false);
			ventana.getPanelAdd().setVisible(false);
		}

	}

	public Ventana getVentana() {
		return ventana;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

}

//}
