package ejemplo1v2;

import ejemplo1v2.vista.Frame1;


import java.awt.Dimension;
import java.awt.Toolkit;



public class App {
	private Frame1 ventana;


	App() {
		ventana = new Frame1();
		centrar();
	
		ventana.setVisible(true);
	}

	/**
	 * Metodo general para centrar ventanas dentro de la pantalla de usuario.
	 * Si la ventana es más grande que las dimesiones de la pantalla, esta se 
	 * ajustara y limitara a la misma.
	 * 
	 */
	
	public void centrar() {
		// Obtener las medidas de la pantalla
		Dimension medidaPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		// Obtener las medidas de la ventana
		Dimension medidaVentana = ventana.getSize();
		// Tomamos como medidas de Pantalla la mayor de las medidas
		if (medidaPantalla.height < medidaVentana.height) {
			medidaPantalla.height = medidaVentana.height;
		}
		if (medidaPantalla.width < medidaVentana.width) {
			medidaPantalla.width = medidaVentana.width;
		}
		// Ponemos la localización de la esquina superior izquierda de la
		// ventana
		ventana.setLocation((medidaPantalla.width - medidaVentana.width) / 2,
				(medidaPantalla.height - medidaVentana.height) / 2);
	}

	public static void main(String[] args) {
		new App();
	}
}