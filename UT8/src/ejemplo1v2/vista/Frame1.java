package ejemplo1v2.vista;



import java.awt.Color;

import javax.swing.JFrame;

public class Frame1 extends JFrame {
	/**
*
*/
	private static final long serialVersionUID = 1L;

	public Frame1() {
		this.setSize(600, 300);
		this.setTitle("Mi primera ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.GREEN);
	}
}