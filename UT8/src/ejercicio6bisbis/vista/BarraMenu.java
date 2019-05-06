package ejercicio6bisbis.vista;
/* CURSO: 1º DAM
 * MODULO: PROGRAMACIÓN
 * UT8: Interfaces gráficas de usuario
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import libraries.MetodosSwing;


/*Crea una aplicación que permita gestionar una biblioteca realizando las operaciones de añadir libros y mostrar libros.
 * Crea esta interface gráfica de usuario.
 * De la biblioteca se guardarán su nombre y todos los libros que tiene. 
 * De cada libro guardaremos su código (es un número distinto para cada libro), su título y el autor.
 * Cuando comienza la aplicación solamente estarán activas las opciones del menú Archivo.
 * La opción Crear Biblioteca pedirá al usuario el nombre de la nueva biblioteca, cambiará el icono de la aplicación 
 * y pondrá como título el nombre de la biblioteca. Además debe crear el espacio de almacenamiento en memoria 
 * para los libros, usaremos un ArrayList, activa las opciones del menú Libro y desactiva la opción 
 * Crear Biblioteca del menú Archivo. Una vez creada la biblioteca, se activarán las opciones del menú Libro.
 * Cuando se selecciona la opción Acerca de…, se muestra un JDialog como se muestra a continuación.
 */

public class BarraMenu extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	// Acceso rápido, por se subraya_ cuando se selecciona la opción
	private char[] accesoMenus = {'A', 'L'};
	private char[] accesoItemsMenus = {'C', 'A', 'S', 'A', 'B', 'L'};
	
	private JMenu[] menus; 
	private String[] etiquetasMenus = {"Archivo","Libro"};

	private JMenuItem[] itemMenu; 
	private String[] etiquetasOpciones = {"Crear Bibliteca","Acerca de","Salir","Añadir","Borrar","Listar"};
		
	BarraMenu() {
		super();
		// Crear el array de menús y los menús
		menus = MetodosSwing.crearMenus(etiquetasMenus, accesoMenus);
		// Crear el array de opciones de menú y las opciones de menú
		itemMenu = MetodosSwing.crearOpciones(etiquetasOpciones, accesoItemsMenus);
	
		// Menú 1
		// Añadir las opciones al menú 	
		MetodosSwing.addOpciones(menus[0],itemMenu,0,2);
		MetodosSwing.addOpciones(menus[0],itemMenu,3,4);
		MetodosSwing.addOpciones(menus[0],itemMenu,5,6);
		
		
		//menu[i].add(menus[2]);
		this.add(menus[0]);
		
		// Menú 2
		// Añadir las opciones al menú con etiqueta Libro
		MetodosSwing.addOpciones(menus[1],itemMenu,3,5);
		this.add(menus[1]);
	}
	
	//Método para recuperar las opciones del menú
	//public JMenuItem 
	
		
	// Método para crear el array de menús y los menús
	void crearMenus() {
		menus = new JMenu[etiquetasMenus.length];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new JMenu(etiquetasMenus[i]);
		}
	}// Fin del método crearMenus
	
	// Método para crear el array de opciones y las opciones de los menús
	void crearOpciones() {
		itemMenu = new JMenuItem[etiquetasOpciones.length];
		for (int i = 0; i < itemMenu.length; i++) {
			itemMenu[i] = new JMenuItem(etiquetasOpciones[i]);
		}
	}
	
//	// Método para crear el Acerca de
//	void agregarAcercaDe() {
//		GestorVentana gestorVentana = new GestorVentana();
//		opciones [0].addActionListener(gestorVentana);
//		menus[0].add(opciones[0]);
//	}
		
	// Método para crear la Función Salir
	void agregarFuncionSalir() {
		GestorSalir gestorSalir = new GestorSalir();
		itemMenu [0].addActionListener(gestorSalir);
		menus[0].add(itemMenu[2]);
	}	
		
	private class GestorSalir implements ActionListener {
		public void actionPerformed(ActionEvent arg0){
			System.exit(0);
		}
	}

	public JMenuItem[] getItemMenu() {
		// TODO Apéndice de método generado automáticamente
		return itemMenu;
	}
	public void mostrarInicio(){
		for (int i=3; i<itemMenu.length; i++){
			itemMenu[i].setEnabled(false);
		}
	}
	
}
