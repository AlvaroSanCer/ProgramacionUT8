package ejemplo7.vista;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame7 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private BoxLayout gestor;
	private JLabel[] etiquetas;

	public Frame7() {
		super("Ejemplo 7");
		contenedor = this.getContentPane();
		gestor = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
		// Asociar el gestor al contenedor
		contenedor.setLayout(gestor);
		// Crear el array de etiquetas.
		etiquetas = new JLabel[5];
		// Crear las etiquetas y añadirlas al contenedor
		crearEtiquetas();
		// Mostrar el contenido de las etiquetas
		// Primera etiqueta solamente tiene texto
		etiquetas[0].setText("Etiqueta de texto");
		// Segunda etiqueta solamente tiene una imagen
		etiquetas[1].setIcon(new ImageIcon("src/imagenes/icono.gif"));
		// Tercera etiqueta tiene texto e imagen
		 etiquetas[2].setHorizontalAlignment(SwingConstants.LEFT);
		// Ponemos el texto a la izquierda
		etiquetas[2].setHorizontalTextPosition(SwingConstants.LEFT);
		etiquetas[2].setText("Mario ahora es neoliberal, ITS MEEEE , MAAAAAAAAARIO");
		etiquetas[2].setIcon(new ImageIcon("src/imagenes/icono.gif"));
		// Cuarta etiqueta tiene texto e imagen
		 etiquetas[3].setHorizontalAlignment(JLabel.LEFT);
		// Ponemos el texto a la derecha
		etiquetas[3].setHorizontalTextPosition(JLabel.RIGHT);
		etiquetas[3].setText("Mario ahora es socialista");
		etiquetas[3].setIcon(new ImageIcon("src/imagenes/icono.gif"));
		// Quinta etiqueta tiene texto e imagen
		etiquetas[4].setText("Ahora Mario es el Presi");
		etiquetas[4].setIcon(new ImageIcon("src/imagenes/icono.gif"));
		// Centramos los elementos de la etiqueta
		etiquetas[4].setHorizontalTextPosition(SwingConstants.CENTER);
		// Ponemos el texto abajo
		 etiquetas[4].setVerticalTextPosition(JLabel.BOTTOM);
		// Tamaño de la ventana
		this.setSize(600, 300);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void crearEtiquetas() {
		for (int i = 0; i < etiquetas.length; i++) {
			etiquetas[i] = new JLabel();
			contenedor.add(etiquetas[i]);
		}
	}
}