package ejercicio6bis.vista;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MenuContextual extends JPopupMenu {

	private static final long serialVersionUID = 8110973641334363857L;
	private JMenuItem[] itemMenu;
	private String[] etiquetaMenu = { "Guardar", "Limpiar" };

	public MenuContextual() {

		itemMenu = new JMenuItem[etiquetaMenu.length];

		for (int i = 0; i < etiquetaMenu.length; i++) {
			this.add(itemMenu[i]);

			if (i < itemMenu.length - 1) {
				this.addSeparator();
			}

		}
	}

	public JMenuItem[] getItems() {
		return itemMenu;
	}
}
