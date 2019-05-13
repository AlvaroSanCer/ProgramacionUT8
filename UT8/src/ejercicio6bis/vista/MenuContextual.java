package ejercicio6bis.vista;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MenuContextual extends JPopupMenu {

	private static final long serialVersionUID = 8110973641334363857L;
	private JMenuItem[] itemMenu;
	private String[] etiquetaMenu = { "Guardar", "Limpiar" };

	public MenuContextual() {

		
		
		crearOpciones();

//		for (int i = 0; i > itemMenu.length; i++) {
//			colorMenu.add(itemMenu[i]);
//		}

	}

	public JMenuItem[] getItems() {
		return itemMenu;
	}

	void crearOpciones() {
		itemMenu = new JMenuItem[etiquetaMenu.length];
		for (int i = 0; i < itemMenu.length; i++) {
			itemMenu[i] = new JMenuItem(etiquetaMenu[i]);
		}
	}
}