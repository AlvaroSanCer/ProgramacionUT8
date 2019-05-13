package ejercicio6bis.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Biblioteca {

	private  ArrayList<Libro> biblioteca;
	private int posicion;
	private String[] titulos;
	private String[] codigos;
	private String[] autores;
	private String titulo_aux;
	private String codigo_aux;
	private String autor_aux;
	

	public Biblioteca() {
		
		biblioteca = new ArrayList<Libro>();
		titulos = new String[20];
		codigos=new String[20];
		autores= new String[20];
		posicion = 0;
	}

	public void addLibro(Libro l) {
		biblioteca.add(l);
		titulos[posicion]= l.getTitulo();
		codigos[posicion]=l.getCodigo();
		autores[posicion]=l.getAutor();
		posicion++;
		
	}

	public String[] getTitulos() {
		return titulos;
	}

	public  ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}
	 
	public String devolverAutor(String s) {
		String autor="";
		int position =Arrays.asList(titulos).indexOf(s) ;
		autor=autores[position];
		
		return autor;
	}
	
	public String devolverCodigo(String s) {
		String codigo="";
		int position =Arrays.asList(titulos).indexOf(s) ;
		codigo=codigos[position];
		
		return codigo;
	}
	


}


