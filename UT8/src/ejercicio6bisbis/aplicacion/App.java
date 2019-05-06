package ejercicio6bisbis.aplicacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import libraries.MetodosSwing;
import ejercicio6bisbis.vista.Ventana;
import ejercicio6bisbis.controlador.Controlador;

public class App {
	//Atributos
	private Controlador controlador;
	private Ventana ventana;
	
	
	public App(){
		controlador = new Controlador();
		ventana = controlador.getVentana();
		iniciar();
	}
	
	public void iniciar() {
		ventana.setSize(700, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		//Metodos.centrar(ventana);
	}

		
	public static void main(String[] args) {
	new App();
	}
}
