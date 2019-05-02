package ejemplo19Menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar {
	private static final long serialVersionUID = 1L;

	private JMenu[] menus;
	private String[] etiquetasMenus = { "Fichero", "Imprimir" };

	private JMenuItem[] opciones;
	private String[] etiquetasOpciones = { "Abrir", "Cerrar", "Pantalla",
			"Impresora", "Salir" };

	BarraMenu() {
		// No se pasa nada por argumento al llamar al padre de la clase
		// JMenuBar.
		super();
		// Crear el array de menús y los menús
		crearMenus();
		// Crear el array de opciones de menú y las opciones de menú
		crearOpciones();
		// Añadir al menú con etiqueta Imprimir las opciones de este menú
		menus[1].add(opciones[2]);
		// Añado la barra de separación de opciones de menú
		menus[1].addSeparator();
		menus[1].add(opciones[3]);
		// Añadir las opciones al menú con etiqueta Fichero
		menus[0].add(opciones[0]);
		// Añado la barra de separación de opciones de menú
		menus[0].addSeparator();
		menus[0].add(opciones[1]);
		// Añado la barra de separación de opciones de menú
		menus[0].addSeparator();
		// Añadir al menú con etiqueta Fichero el menú con etiqueta Imprimir
		menus[0].add(menus[1]);
		// Añadir el menú con etiqueta Fichero a la barra de menú
		this.add(menus[0]);
		// Añadir el boton Salir.
		this.add(opciones[4]);
		// Abrir la barra menus con ALT+F ( o la letra que hayamos asignado ),
		menus[0].setMnemonic('F');
		
		// Registramos en el elemento itemSalir el objeto que lo escucha
		//GestorSalir gestorSalir = new GestorSalir();
		//opciones[4].addActionListener(gestorSalir);
		
		//Implantacion de una clase anónima para crear un evento.
		opciones[4].addActionListener(new ActionListener() { //Comienza la clase interna anónima
			public void actionPerformed(ActionEvent evento) {
			System.exit(0);
			}
			} //Fin de la clase interna anónima.
				);
	}

	// Método para crear el array de menús y los menús
	void crearMenus() {
		menus = new JMenu[etiquetasMenus.length];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new JMenu(etiquetasMenus[i]);
		}
	}// Fin del método crearMenus

	// Método para crear el array de opciones y las opciones de los menús

	void crearOpciones() {
		opciones = new JMenuItem[etiquetasOpciones.length];
		for (int i = 0; i < opciones.length; i++) {
			opciones[i] = new JMenuItem(etiquetasOpciones[i]);
		}
	}

	// Manejar el evento al pulsar Salir
//	private class GestorSalir implements ActionListener {
//		public void actionPerformed(ActionEvent arg0) {
//			System.exit(0);
//		}
//	}
}