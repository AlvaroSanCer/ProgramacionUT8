package ejercicio6bis.modelo;

public class Libro {
	private int codigo;
	private String titulo;
	private String autor;
	
	public Libro(int c,String t, String a) {
		this.codigo=c;
		this.autor= a;
		this.titulo = t;
	}

	public void mostrar() {
		String c = "Libro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + "]";
		System.out.print(c);;
	}
	
	
}
