package ejercicio6bis.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


import javax.swing.table.DefaultTableModel;

public class Biblioteca {

	private ArrayList<Libro> biblioteca;
	private int posicion;
	private String[] titulos;
	private String[] codigos;
	private String[] autores;


	public Biblioteca() {

		biblioteca = new ArrayList<Libro>();
		titulos = new String[20];
		codigos = new String[20];
		autores = new String[20];
		posicion = 0;
	}

	public void addLibro(Libro l) {
		biblioteca.add(l);
		titulos[posicion] = l.getTitulo();
		codigos[posicion] = l.getCodigo();
		autores[posicion] = l.getAutor();
		posicion++;

	}



	public ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}

	public String devolverAutor(String s) {
		String autor = "";
		int position = Arrays.asList(titulos).indexOf(s);
		autor = autores[position];

		return autor;
	}

	public String devolverCodigo(String s) {
		String codigo = "";
		int position = Arrays.asList(titulos).indexOf(s);
		codigo = codigos[position];

		return codigo;
	}

	public void borrarLibro(String t) {

		Iterator<Libro> iterador = biblioteca.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getTitulo().equals(t)) {
				iterador.remove();
			}

		}

	}

	public String[] getotitulos() {
		String[] titulos = new String[biblioteca.size()];
		Iterator<Libro> iterator = biblioteca.iterator();
		int contador = 0;
		while (iterator.hasNext()) {
			titulos[contador] = iterator.next().getTitulo();
			contador++;
		}
		return titulos;
	}

	public DefaultTableModel darTabla() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Codigo"); 
		modelo.addColumn("Titulo"); 
		modelo.addColumn("Autor"); 

		for (Libro lib : biblioteca) {
			
			Object rows[]= new Object[3];
			rows[0]= lib.getCodigo();
			rows[1]= lib.getTitulo();
			rows[2]= lib.getAutor();
			
			modelo.addRow(rows);

		}
		
		
		
	    
	    return modelo;
	}
}