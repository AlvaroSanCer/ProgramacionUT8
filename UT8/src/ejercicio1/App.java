package ejercicio1;

import java.awt.Dimension;
import java.awt.Toolkit;


import ejercicio1.vista.*;


public class App {

private Frame ventana;
	
	App(){
//	ventana = new Frame();
//
//    centrar();
//	ventana.setVisible(true);
	
		crearVentana("Alineacion centro");
		crearVentana("Alineacion izquierda");
		crearVentana("Alineacion derecha");
		
		
		
	}
	
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
	
	public void crearVentana(String a){
		ventana = new Frame(a);
		ventana.setVisible(true);
		centrar();
	}
	
	public static void main(String[] args) {
		new App();

	}

}


