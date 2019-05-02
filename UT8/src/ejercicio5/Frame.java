package ejercicio5;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar barra;

	Frame() {
		super("Ejercicio5 - Alvaro Santillana Cernuda");
		barra = new BarraMenu();
		this.setJMenuBar(barra);
		
		//barra.setBorderPainted(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
	}
	
	
}