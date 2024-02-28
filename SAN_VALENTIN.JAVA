package SAN_VALENTIN;

import java.util.Scanner;

public class SAN_VALENTIN {

	public static void main(String[] args) {
		// Clase gestora san valentin
		
		//Pedir datos
		Scanner entrada=new Scanner(System.in);
        //String cadena=entrada.nextLine();
        int num=entrada.nextInt();
        double d=entrada.nextDouble();
		
		
		Regalo valentin = new Regalo();
		valentin.toString();
		
		System.out.println(valentin);
		
		

	}
	
	public class Regalo {
		
		String caja_bombones = "caja_bombones";
		Double cajabombones = 14.99;
		String caja= "caja 20 bombones con frma de corazón";
		
		String oso_peluche = "oso_peluche";
		Double osopeluche = 4.99;
		String oso = "oso con un corazon";
		
		String flores_rosas = "flores";
		Double ramorosas = 24.99;
		String ramo = "ramo con 20  rosas";
		
		String musica_amor = "musica";
		Double baladasamor = 9.99;
		String msica = "colaj de 10 canciones de amor";
		
		String carta_amor = "carta_amor";
		Double cartaamor = 1.99;
		String carta = "cartulina tamañp bolsillo con corazones y con frases de amor estritas en cursiva";
		
		String viaje_romantico = "viaje";
		Double escapadaromantica = 144.99;
		String viaje = "Un fiaje a la Paris la ciudad del amor y a comer creps";
		
		String espa = "espa";
		Double retiroespiritual = 99.99;
		String retiro = "Pack incluido con spa, mansaje, camara de vapor, aguas termales para dos claro";
		
	}
	
	
	
	public class persona{
		
		Scanner entrada=new Scanner(System.in);
        String DNI=entrada.nextLine();
        //String dni = "x9999996-k";
        System.out.println(DNI);
        
        String Nombre=entrada.nextLine();
        //String nombre = "Pepito Perez Galdos";
        System.out.println(Nombre);
       
		
	}
	
	
	public class pareja {
		
		String persona1 = "Pepe";
		
		String persona2 = "Sara";
		
		String regaloParaPersona1 = "Un mustang";
		
		String regaloParaPersona2 = "Amor, comprension y asertividad.";
	}
	
	
	
}
