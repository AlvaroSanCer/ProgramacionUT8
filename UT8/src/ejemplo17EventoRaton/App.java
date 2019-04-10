package ejemplo17EventoRaton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class App {
	// Atributos
	private Frame ventana;

	App() {
		ventana = new Frame();
		jInit();
	}

	void jInit() {
		// Creo el objeto oyente de tipo OyenteMouseListener
		OyenteMouseListener oyenteMouseListener = new OyenteMouseListener();
		// Creo el objeto oyente de tipo OyenteMouseMotionListener
		OyenteMouseMotionListener oyenteMouseMotionListener = new OyenteMouseMotionListener();
		// Resgistro los oyentes en el objeto fuente
		ventana.getContenedor().addMouseListener(oyenteMouseListener);
		ventana.getContenedor().addMouseMotionListener(
				oyenteMouseMotionListener);
		ventana.setLocationRelativeTo(ventana);
		ventana.setVisible(true);
	}

	// Clase interna para generar el oyente de eventos MouseListener
	private class OyenteMouseListener implements MouseListener {
		JLabel etiqueta = ventana.getEtiqueta();
		Container contenedor = ventana.getContenedor();

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has hecho click en el punto (" + e.getX()
						+ "," + e.getY() + ")");
			}
			contenedor.add(etiqueta, BorderLayout.SOUTH);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has presionado en el punto (" + e.getX()
						+ "," + e.getY() + ")");
			}
			contenedor.add(etiqueta, BorderLayout.SOUTH);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has soltado en el punto (" + e.getX() + ","
						+ e.getY() + ")");
			}
			contenedor.add(etiqueta, BorderLayout.SOUTH);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has entrado en el panel de contenido");
			}
			contenedor.add(etiqueta, BorderLayout.SOUTH);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has salido del panel de contenido");
			}
			contenedor.add(etiqueta, BorderLayout.SOUTH);
		}
	}// Fin de la clase interna OyenteMouseListener
	// Clase interna para crear oyentes de tipo MouseMotionListener

	private class OyenteMouseMotionListener implements MouseMotionListener {
		Container contenedor = ventana.getContenedor();
		JLabel etiqueta = ventana.getEtiqueta();

		@Override
		public void mouseDragged(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has arrastrado el ratón");
				contenedor.add(etiqueta, BorderLayout.SOUTH);
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (e.getSource().equals(contenedor)) {
				etiqueta.setText("Has movido el ratón");
				contenedor.add(etiqueta, BorderLayout.SOUTH);
			}
		}
	}

	public static void main(String[] args) {
		new App();
	}
}