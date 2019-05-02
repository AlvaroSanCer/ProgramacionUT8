package ejemplo20MVC;

import ejemplo20MVC.controlador.Controlador;

public class App {
	// Atributo
	private Controlador controlador;
	App() {
	controlador = new Controlador();
	}
	public static void main(String[] args) {
	new App();
	}
	}

