package ejercicio6bis.modelo;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> biblioteca;
	
	public Biblioteca() {
		biblioteca = new ArrayList<Libro>();
		
	}

	public void addLibro(Libro l) {
		biblioteca.add(l);
	}
}
