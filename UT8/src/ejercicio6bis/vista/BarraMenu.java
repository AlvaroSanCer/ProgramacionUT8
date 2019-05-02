package ejercicio6bis.vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar {

	private static final long serialVersionUID = 1L;

	private JMenu[] menus;
	private String[] etiquetasMenus = { "Archivo", "Libro"};
	private char[] accesoMenus = { 'A', 'L', 'i' };
	private JMenuItem[] itemMenu;
	private String[] etiquetasItemMenus = { "Crear Biblioteca", "Acerca de", "Salir", "A�adir", "Borrar", "Listar"};
	private char[] accesoItemMenus = { 'C', 'c', 'S', '�', 'B', 'L'};

	public BarraMenu() {
		super();
		
		menus = libraries.MetodosSwing.crearMenus(etiquetasMenus, accesoMenus);
		itemMenu = libraries.MetodosSwing.crearOpciones(etiquetasItemMenus, accesoItemMenus);

		libraries.MetodosSwing.addOpciones(menus[0], itemMenu, 0, 2);
		libraries.MetodosSwing.addOpciones(menus[1], itemMenu, 3, 5);
		
		for (int i = 0; i < menus.length; i++) {
			this.add(menus[i]);
		}
		
	}

	public JMenuItem[] getItemMenu() {
		return itemMenu;
	}

	public void MostrarInicio() {

	}

}
