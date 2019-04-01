package ejemplo1;

import ejemplo1.vista.Frame1;

public class App {
	// Atributo
	private Frame1 ventana;

	// Constructor
	public App() {
		ventana = new Frame1();
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		// Creo el objeto de la clase
		new App();
	}
}
