package ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

public class BarraMenu extends JMenuBar {



	private static final long serialVersionUID = -7205897742528638968L;
	private JMenu[] menus;
	private String[] etiquetasMenus = {"Archivo", "Formato","Color","Tipo de letra"};
	
	private JMenuItem[] opciones;
	private String [] etiquetasOpciones = {"Acerca de", "Salir"};
	
	private JCheckBoxMenuItem [] estiloletra  ;
	private JRadioButtonMenuItem [] colores, tipoletra;
	
	private String [] etiquetasestiloletra = {"Negrita", "Cursiva"};
	private String [] etiquetascolores = {"Negro", "Azul", "Rojo", "Verde"};
	private String [] etiquetastipoletra = {"Serif","MonoSpaced", "SanSerif"};

	
	BarraMenu() {
		super();
		crearMenus();
		crearOpciones();
		crearCB();
		crearRBcolores();
		crearRBtipo();
		menus[0].add(opciones[0]);
		menus[0].addSeparator();
		menus[0].add(opciones[1]);
		
		menus[1].add(menus[2]);
		menus[1].addSeparator();
		menus[1].add(menus[3]);
		
		menus[2].add(colores[0]);
		menus[2].add(colores[1]);
		menus[2].add(colores[2]);
		menus[2].add(colores[3]);
		
		menus[3].add(tipoletra[0]);
		menus[3].add(tipoletra[1]);
		menus[3].add(tipoletra[2]);
		
		menus[3].addSeparator();
		
		menus[3].add(estiloletra[0]);
		menus[3].add(estiloletra[1]);
		
		
		this.add(menus[0]);
		this.add(menus[1]);
		
		opciones[1].addActionListener(new ActionListener() { //Comienza la clase interna anónima
			public void actionPerformed(ActionEvent evento) {
			System.exit(0);
			}
			} //Fin de la clase interna anónima.
				);
		opciones[0].addActionListener(new ActionListener() { //Comienza la clase interna anónima
			public void actionPerformed(ActionEvent evento) {
			JOptionPane.showMessageDialog(null, "Esto es un Acerca de");
			}
			} //Fin de la clase interna anónima.
				);
	}
		
	

	// Método para crear el array de menús y los menús
		void crearMenus() {
			menus = new JMenu[etiquetasMenus.length];
			for (int i = 0; i < menus.length; i++) {
				menus[i] = new JMenu(etiquetasMenus[i]);
			}
		}// Fin del método crearMenus

		// Método para crear el array de opciones y las opciones de los menús

		void crearOpciones() {
			opciones = new JMenuItem[etiquetasOpciones.length];
			for (int i = 0; i < opciones.length; i++) {
				opciones[i] = new JMenuItem(etiquetasOpciones[i]);
			}
		}
		void crearCB(){
			estiloletra = new JCheckBoxMenuItem[etiquetasestiloletra.length];
			for (int i =0; i<estiloletra.length;i++){
				estiloletra[i]= new JCheckBoxMenuItem(etiquetasestiloletra[i]);
			}
		}
		
		void crearRBcolores(){
			colores = new JRadioButtonMenuItem[etiquetascolores.length];
			for (int i =0; i<colores.length;i++){
				colores[i]= new JRadioButtonMenuItem(etiquetascolores[i]);
		}
		}
		void crearRBtipo(){
			tipoletra = new JRadioButtonMenuItem[etiquetastipoletra.length];
			for (int i =0; i<tipoletra.length;i++){
				tipoletra[i]= new JRadioButtonMenuItem(etiquetastipoletra[i]);
		}
		}
		
}