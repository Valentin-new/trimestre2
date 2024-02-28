package Unidad6;
/* Queremos mantener una colecc io´ n de los libros que hemos ido leyendo,
p oni´endoles una calificac io´ n seg u´ n nos haya gustado m ´as o menos al leerlo.
Para ello, crear la clase Libro, cuyos atributos son el titulo, el autor, el
n u´ mero de p ´aginas y la calificac io´ n que le damos entre 0 y 10. Cre ar los
m´eto dos t´ıpicos para p oder mo dificar y obtener los atribu tos si tienen
sentido. */
public class Libro {
	
	private String titulo, autor;
	private int pag, nota;
	
	public Libro(String titulo, String autor, int pag, int nota) {
		this.titulo = titulo;
		this.autor = autor;
		this.pag = pag;
		this.nota = nota;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPag() {
		return pag;
	}
	public void setPag(int pag) {
		this.pag = pag;
	}
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", pag=" + pag + ", nota=" + nota + "]";
	}

	
	
	
}
