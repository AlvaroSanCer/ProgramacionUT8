package ejercicio6bis.modelo;

import java.util.ArrayList;


public class Biblioteca {

	private  ArrayList<Libro> biblioteca;
	private int posicion;
	private String[] titulos;
	private String[] codigo;
	private String[] autor;
	private String titulo_aux;
	private String codigo_aux;
	private String autor_aux;
	

	public Biblioteca() {
		
		biblioteca = new ArrayList<Libro>();
		titulos = new String[20];
		codigo=new String[20];
		autor= new String[20];
		posicion = 0;
	}

	public void addLibro(Libro l) {
		biblioteca.add(l);
		titulos[posicion]= l.getTitulo();
		codigo[posicion]=l.getCodigo();
		autor[posicion]=l.getAutor();
		posicion++;
		
	}

	public String[] getTitulos() {
		return titulos;
	}

	public  ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}
	
	


}


