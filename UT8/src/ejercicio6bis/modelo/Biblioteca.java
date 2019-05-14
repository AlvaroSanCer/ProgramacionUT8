package ejercicio6bis.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
<<<<<<< HEAD

import javax.swing.JOptionPane;
=======
>>>>>>> refs/remotes/origin/master


public class Biblioteca {

	private  ArrayList<Libro> biblioteca;
	private int posicion;
	private String[] titulos;
	private String[] codigos;
	private String[] autores;
<<<<<<< HEAD
	
=======
	private String titulo_aux;
	private String codigo_aux;
	private String autor_aux;
>>>>>>> refs/remotes/origin/master
	

	public Biblioteca() {
		
		biblioteca = new ArrayList<Libro>();
		titulos = new String[20];
		codigos=new String[20];
		autores= new String[20];
		posicion = 0;
	}

	public String addLibro(Libro l) {
		//Comprobar que el codigo no esté duplicado.
		Iterator<Libro> iterador = biblioteca.iterator();
		String mensaje="";
		Libro temp;
		boolean dupli = false;
		
		
		while (iterador.hasNext()){
			temp = iterador.next();
			if(temp.getCodigo().equals(l.getCodigo())){
				mensaje = "Libro duplicado";
				
				dupli = true;
			}
		}
		
		
		if(!dupli){
			biblioteca.add(l);
			mensaje="Libro guardado";
		
		
		titulos[posicion]= l.getTitulo();
		codigos[posicion]=l.getCodigo();
		autores[posicion]=l.getAutor();
		posicion++;
		
		}
		return mensaje;
		
	}

	public String[] getTitulos() {
		return titulos;
	}
	
	public void borrarLibro(Libro l){
		Iterator<Libro> iterador = biblioteca.iterator();
		//Libro temp;
		while (iterador.hasNext()) {

			if (iterador.next().getTitulo().equals(l.getTitulo())) {
				iterador.remove();
			}
		}
			
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


