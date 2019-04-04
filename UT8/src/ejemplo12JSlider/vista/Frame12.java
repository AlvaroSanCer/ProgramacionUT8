package ejemplo12JSlider.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Frame12 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private FlowLayout gestor;
	private JSlider deslizador;

	public Frame12() {
		super("Ejemplo JSlider");
		contenedor = this.getContentPane();
		gestor = new FlowLayout();
		// Asociar el gestor de diseño al contenedor
		contenedor.setLayout(gestor);
		/*
		 * Crear el deslizador en sentido horizontal valor mínimo 0, valor
		 * máximo 200 y valor inicial 10
		 */
		deslizador = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 100);
		deslizador.setMajorTickSpacing(50);
		deslizador.setPaintLabels(true);
		deslizador.setPaintTicks(true);
		deslizador.setSnapToTicks(true);

		// Añadir el deslizador al contenedor
		contenedor.add(deslizador);
		// Medida de la ventana
		this.setSize(400, 100);
		// Cerrar la aplicación al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}