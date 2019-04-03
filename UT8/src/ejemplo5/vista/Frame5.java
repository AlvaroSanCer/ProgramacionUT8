package ejemplo5.vista;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame5 extends JFrame {
	private static final long serialVersionUID = 8419330844220734381L;
	// Atributos
	private JButton botones[];
	private final String nombres[] = { "Norte", "Sur", "Este", "Oeste",
			"Centro" };
	private BorderLayout gestorDiseño;
	private Container contenedor;

	// Constructor
	public Frame5() {

		// Creo la ventana con un título
		super("Uso de BorderLayout"); // Es como poner this.setTittle();

		// Establecer el tamaño.
		this.setSize(600, 300);
		// Obtenemos el panel raíz de la ventana
		contenedor = getContentPane();
		// Creo el gestor de diseño
		gestorDiseño = new BorderLayout();
		// Añado el gestor de diseño
		contenedor.setLayout(gestorDiseño);
		// Crear los botones
		botones = new JButton[nombres.length];

		for (int i = 0; i < 5; i++) {
			botones[i] = new JButton(nombres[i]);
		}
		// Añado los botones a las diferentes regiones del panel
		contenedor.add(botones[0], BorderLayout.NORTH);
		contenedor.add(botones[1], BorderLayout.SOUTH);
		contenedor.add(botones[2], BorderLayout.EAST);
		contenedor.add(botones[3], BorderLayout.WEST);
		contenedor.add(botones[4], BorderLayout.CENTER);
	}
}