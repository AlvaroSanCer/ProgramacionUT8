package ejercicio6bis;

import javax.swing.JFrame;

import ejercicio6bis.controlador.Controlador;
import ejercicio6bis.vista.Ventana;

public class Aplicacion {
	
	private Controlador controlador;
	private Ventana ventana;
	
	public Aplicacion() {
		
		controlador = new Controlador();
		//ventana = new Ventana();
		//ventana =  controlador.getVentana();
		iniciar();
	}
	
	public void iniciar(){
		ventana.setSize(700,500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		libraries.MetodosSwing.centrar(ventana);
	}
	
	public static void main(String[] args) {
		new Aplicacion();
	}
	
}
