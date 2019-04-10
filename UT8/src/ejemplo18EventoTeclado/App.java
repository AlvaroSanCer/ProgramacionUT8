package ejemplo18EventoTeclado;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class App {
	private Frame ventana;
	private JTextArea areaTexto;

	public App() {
		
			ventana=new Frame();
			jInit();
			
		
	}

	private void jInit() {
		areaTexto = ventana.getAreaTexto();
		OyenteTeclado oyente = new OyenteTeclado();
		areaTexto.addKeyListener(oyente);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}
	
	

	class OyenteTeclado implements KeyListener {
		public void keyPressed(KeyEvent evento) {
			areaTexto.setText("Has oprimido una tecla");
		}

		public void keyReleased(KeyEvent evento) {
			areaTexto.setText("Has soltado la tecla");
		}

		public void keyTyped(KeyEvent evento) {
			areaTexto.setText("Has oprimido una tecla que no es de acción ");
		}
	}
	
	public static void main(String [] args){
		new App();
	}
}