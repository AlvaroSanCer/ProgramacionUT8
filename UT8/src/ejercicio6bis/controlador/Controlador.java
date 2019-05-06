package ejercicio6bis.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import ejercicio6bis.vista.AcercaDe;
import ejercicio6bis.vista.Ventana;

public class Controlador implements ActionListener {

	private Ventana ventana;
	private JMenuItem[] opcionesMenu;
	private AcercaDe dialogoacercade;

	public Controlador() {
		ventana = new Ventana();

		// Trabajar con las opciones de Menu.

		opcionesMenu = ventana.getBarra().getItemMenu();
		asociarOyenteOPcionesMenu();

		// Trabajar con el JDialog AcercaDe.

		dialogoacercade = new AcercaDe();
		//dialogoacercade.getAceptarAcerca().addActionListener(this);

		// Trabajar con los paneles
		
		//Desactivar las opciones del menu Libro
		
		ventana.getBarra().MostrarInicio();

		
	}

	private void asociarOyenteOPcionesMenu() {
		for(int i=0;i < opcionesMenu.length; i++){
			opcionesMenu[i].addActionListener(this);
		}
	}

	public Ventana getVentana() {
		// TODO Apéndice de método generado automáticamente
		return ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(opcionesMenu[2])){
			System.exit(0);
		}
		else if (e.getSource().equals(opcionesMenu[1])){
			dialogoacercade.setLocationRelativeTo(ventana);
			dialogoacercade.setVisible(true);
		}else if (dialogoacercade.isVisible()){
			//if(e.getSource().equals(dialogoacercade).getAceptarAcerca())){
				dialogoacercade.setVisible(false);
			}
		}

	}
	
	

//}
