package ejercicio6bis.modelo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Biblioteca {

	private  ArrayList<Libro> biblioteca;
	private int posicion=0;
	private String[] titulos = new String [20];
	

	public Biblioteca() {
		
		biblioteca = new ArrayList<Libro>();

	}

	public void addLibro(Libro l) {
		biblioteca.add(l);
		titulos[posicion]= l.getTitulo();
		posicion++;
		
	}

	public String[] getTitulos() {
		return titulos;
	}

	public  ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}

//	public static String[] captarTitulos(ArrayList<Libro> b) {
//		int posicion = 0;
//		String[] titulos = new String[10];
//		
//
////		if (b.isEmpty()) {
////			JOptionPane.showMessageDialog(null,
////					"No existen libros en la Biblioteca");
////
////		} else {
//			Libro a;
//			Iterator<Libro> iterador = b.iterator();
//
//			while (iterador.hasNext()) {
//				a = iterador.next();
//
//				if (!(a == null)) {
//					titulos[posicion] = a.getTitulo();
//					posicion++;
//
//				}
//			}
//		
//		return titulos;
//	}
}
