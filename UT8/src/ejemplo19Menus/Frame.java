package ejemplo19Menus;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar barra;

	Frame() {
		super("Mi primer menú");
		barra = new BarraMenu();
		this.setJMenuBar(barra);
		
		//barra.setBorderPainted(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
	}
}