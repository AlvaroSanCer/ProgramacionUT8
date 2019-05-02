package ejemplo19Menus;

public class App {
	// Atributos
	private Frame ventana;

	App() {
		ventana = new Frame();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new App();
	}
}