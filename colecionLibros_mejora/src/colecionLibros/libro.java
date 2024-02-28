package colecionLibros;

public class libro {
	
	//defino los atributos

	String nombre, autor ;
	int paginas;
	double calificacion;
	
	//crear metodos (futuro)
	
	//constructor
	public libro (String nombre, String autor, int paginas, double calificacion) {
		this.nombre = nombre;
		this.autor= autor;
		this.paginas=paginas;
		this.autor=autor;
		this.calificacion=calificacion;
	}
	
	
	//setters y getters

	public int getPaginas() {
		return paginas;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public String getAutor() {
		return autor;
	}
	
	

}
