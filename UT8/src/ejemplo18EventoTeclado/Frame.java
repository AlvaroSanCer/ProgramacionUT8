package ejemplo18EventoTeclado;


import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = -1889417446201934954L;
	private Container contenedor;
	private JTextArea areaTexto;
	
	public Frame(){
		super("Evento de teclas");
		contenedor = this.getContentPane();
		areaTexto= new JTextArea();
		areaTexto.append("Pulsa cualquier tecla");
		contenedor.add(areaTexto);
		jInit();
	}
	private void jInit(){
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JTextArea getAreaTexto(){
		return areaTexto;
	}
}