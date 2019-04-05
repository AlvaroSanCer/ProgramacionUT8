package ejemplo13Contenedores.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * 
 * En esta clase vamos a definir la apariencia de una ventana con multiples zonas (BorderLayout)
 * creando dentro de las mismas distintas funciones según hemos ido aprendiendolos en clase.
 * 
 * 
 * @author Alvaro Santillana Cernuda
 * @version 05/04/2019
 *
 */
public class Frame extends JFrame{


	 
	private static final long serialVersionUID = 4707513624420142320L;
	private Container contenedor;
	private  BorderLayout gestorContenedor;
	
	public Frame(){
		super("Ejemplo paneles - Alvaro Santillana Cernuda");
		this.setSize(600,300);
		contenedor = this.getContentPane();
		gestorContenedor = (BorderLayout) contenedor.getLayout();
		((BorderLayout)gestorContenedor).setHgap(10);
		((BorderLayout)gestorContenedor).setVgap(10);
		
		crearZonaNorte();
		crearZonaCentro();
		crearZonaEste();
		crearZonaOeste();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	/**
	 * Metodo para crear la zona Oeste de nuestro panel raiz, añadiento un TextArea y un Scroll
	 * anclado a la misma
	 * 
	 */
	
	private void crearZonaOeste() {
		//Creamos el TextArea con un numero de filas y columnas determinado.
		JTextArea areaTexto = new JTextArea(2,3);
		//Usa la clase StringBuffer para añadir algun comentario al TextArea
		areaTexto.append("ETIQUETA");
		//Creamos un Scroll anclado a nuestra Area de Texto
		JScrollPane panel = new JScrollPane(areaTexto);
		//Añadimos finalmente a la parte Oeste de nuestro contenedor raiz.
		contenedor.add(panel,BorderLayout.WEST);
		
		
	}

	/**
	 * Metodo para Crear la zona Este de nuestro programa, usando un SplitPane y un par de 
	 * etiquetas que nos dividiran las zona norte y sur del propio Split. 
	  */
	private void crearZonaEste() {
	
		//Creo el SplitPane y pasamos por argumento al constructor la forma del Split.
		JSplitPane panel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		//Le damos un color de fondo.
		panel.setBackground(new Color(221,160,221));
		//Creamos las etiquetas y las colocamos arriba y abajo del Slide.
		JLabel etiqueta1 = new JLabel("Arriba");
		panel.setTopComponent(etiqueta1);
		JLabel etiqueta2 = new JLabel("Abajo");
		panel.setBottomComponent(etiqueta2);
		//Añadimos todo al contenedor Raiz.
		contenedor.add(panel,BorderLayout.EAST);
		
	}
/**
 * Metodo para crear TabbedPane con subpestañas con sus etiquetas.
 * 
 */
	private void crearZonaCentro() {
		//Creamos un TabbedPane como subcontenedor central.
		JTabbedPane panel = new JTabbedPane();
		//Creamos la etiqueta.
		JLabel etiqueta1 = new JLabel("Etiqueta 1");
		//Creamos el panel de la primera pestaña
		JPanel pestania1= new JPanel();
		//Añadimos la etiqueta a la primera pestaña
		pestania1.add(etiqueta1);
		//Añadimos la pestaña a nuestro panel central.
		panel.add("Pestaña 1", pestania1);
		//Creamos y añadimos como anteriormente una segunda pestaña con su etiqueta.
		JPanel pestania2 = new JPanel();
		JLabel etiqueta2 = new JLabel("Etiqueta 2");
		pestania2.add(etiqueta2);
		panel.addTab("Pestaña 2", pestania2);
		//Añadir el panelCentral a nuestro contenedor raiz.
		contenedor.add(panel,BorderLayout.CENTER);
		
	}

	/**
	 * Metodo para introducir Botones en la zona norte mediante un bucle for que recorrera
	 * el array de etiquetas y los añadira la Layout.
	 * 
	 */
	public void crearZonaNorte(){
		JPanel panelNorte = new JPanel();
		String [] etiquetas={"Botón 1 ", "Botón 2" , "Botón 3","Botón 4","Botón 5"};
		JButton boton;
		for (int i=0;i<etiquetas.length; i++){
			boton = new JButton(etiquetas[i]);
			panelNorte.add(boton);
		}
		contenedor.add(panelNorte, BorderLayout.NORTH);
	}
	
	
	
}
