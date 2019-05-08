package ejercicio6bis.modelo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;



public class Biblioteca {

	private ArrayList<Libro> biblioteca;

	public Biblioteca() {
		biblioteca = new ArrayList<Libro>();

	}

	public void addLibro(Libro l) {
		biblioteca.add(l);
	}

	public ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}

	public DefaultComboBoxModel<String> captarTitulos(ArrayList<Libro> b) {
		
		DefaultComboBoxModel<String> Titulos = new DefaultComboBoxModel<String>();
		
		

		if (b.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existen libros en la Biblioteca");
		} else {
			Libro a;
			Iterator<Libro> iterador = b.iterator();

			while (iterador.hasNext()) {
				a = iterador.next();

				if (!(a == null)) {
					a.getTitulo();
					Titulos.addElement(a.getTitulo());
					
				} else {

				}
			}
		}
		return Titulos;
	}
}
