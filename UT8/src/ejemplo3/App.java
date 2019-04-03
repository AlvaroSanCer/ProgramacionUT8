package ejemplo3;
import ejemplo2.*;
import ejemplo3.vista.Frame3;

public class App {

	private Frame3 ventana;
	App(){
	ventana = new Frame3();

	ventana.setVisible(true);
	}
	public static void main(String[] args) {
	new App();
	}
	}
