package Unidad6;

import java.util.Scanner;

public class PruebaLibros {
/*Crear una clase PruebaLibros, que realice varias pruebas con las clases
creadas. En concreto, prueb e a: crear dos libros, a n˜adirlos al conjunto,
eliminarlos p or los dos criterios hasta que el conjunto est´e va c´ıo, volver a
a n˜adir un libro y mostrar el contenido final*/
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		Libro libroA = new Libro ("Los juegos del hambre", "Sussy", 300, 9);
		Libro libroB = new Libro ("Orgullo y prejuicio", "Jane Austin", 400, 4);
		Libro libroC = new Libro ("La Celestina", "Fer", 250, 6);
		Libro libroD = new Libro ("La Celestina", "per", 250, 6);

		
		ConjuntoLibros conj1 = new ConjuntoLibros();
		
		conj1.agregarLibros(libroA);
		conj1.agregarLibros(libroB);
		
		
		int op = 0;
		do {
			menu();
			op = in.nextInt();
			in.nextLine();
			switch(op) {
			case 1:
				if(conj1.agregarLibros(libroC)) {
					System.out.println("Se ha agregado correctamente.");
				}else {
					System.out.println("ERROR: el conjunto ya está lleno.");
				}
				break;
				
			case 2:
				System.out.println("Introduce el nombre o título del libro: ");
				String nombre = in.nextLine();
				if(conj1.eliminarLibroPorAutor(nombre)) {
					System.out.println("Se ha podido eliminar correctamente por el nombre del autor.");
				}else if(conj1.eliminarLibroPorTitulo(nombre)){
					System.out.println("Se ha podido eliminar correctamente por el nombre del titulo.");
				}else {
					System.out.println("ERROR: no se ha podido eliminar.");
				}
				break;
				
			case 3:
				conj1.mejorPuntuacion();
				conj1.menorPuntuacion();
				break;
				
			case 4: 
				conj1.mostrarConjunto();
				break;
			case 6:
				conj1.agregarLibros(libroD);
				break;
			}

		}while(op != 5);
		
		
	}public static void menu() {
		System.out.println("1. Introducir un libro en el conjunto: ");
		System.out.println("2. Eliminar un libro del conjunto: ");
		System.out.println("3. Mostrar el mejor y el peor libro según su nota");
		System.out.println("4. Mostrar conjunto: ");
		System.out.println("5. Salir del programa.");
		System.out.println("Introduce la opción");
	}
}
