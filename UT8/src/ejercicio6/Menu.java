package ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	private JMenu[] menus;
	String etiquetasMenus[] = { "Archivo", "Libro" };
	private JMenuItem[] opciones;
	String etiquetasOpciones[] = { "Crear Biblioteca", "Acerca de", "Salir", "A�adir", "Borrar", "Listar" };

	public Menu() {
		super();
		crearMenus();
		crearOpciones();
		
		menus[0].add(opciones[0]);
		menus[0].add(opciones[1]);
		menus[0].add(opciones[2]);
		
		menus[1].add(opciones[3]);
		menus[1].add(opciones[4]);
		menus[1].add(opciones[5]);
		
		this.add(menus[0]);
		this.add(menus[1]);
		
		menus[0].add(opciones[2]).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
	}

	public void crearMenus() {
		menus = new JMenu[etiquetasMenus.length];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new JMenu(etiquetasMenus[i]);
		}
	}

	public void crearOpciones() {
		opciones = new JMenuItem[etiquetasOpciones.length];
		for (int i = 0; i < opciones.length; i++) {
			opciones[i] = new JMenuItem(etiquetasOpciones[i]);
		}
	}

}
