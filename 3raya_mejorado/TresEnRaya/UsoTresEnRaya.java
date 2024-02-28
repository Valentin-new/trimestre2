package TresEnRaya;

/** Fecha: 20/02/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

import java.util.Scanner;

public class UsoTresEnRaya {

	public UsoTresEnRaya() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		
		//ejecutas el metodo de la clase.
		iniciar();
		
		//ejecutas el metodo de la clase.
		
		maquinaJugador();
				
		maquinaMaquina();
				
		// Ese petodo debe de realizar la funcion de switckear
		// Es decir Despues de haber creado el menu de forma exitosa debe:
		// 1.Interperetar la opcion del user
		// 2.Lamar a maquinaJugador o maquinaMaquina
				
		
		//Inicializo variable elegir que sera ingresada por user
        int elegir;
        do {
            //Imprimo el Menu
        	System.out.print("Seleccione una opción: ");
            System.out.println("1.Máquina contra jugador");
            System.out.println("2. Máquina vs máquina");
            System.out.println("3. Salir");
            
            elegir = entrada.nextInt();

            //Implemento los casos
            switch (elegir) {
                case 1:
                    maquinaJugador(); //Hay que llamarlo wn un futuro
                    break;
                case 2:
                    maquinaMaquina(); //Hay que llamarlo wn un futuro
                    break;
                case 3:
                    System.out.println("¡Finalizado el juego!");
                    break;
                //Implemento caso por defecto 
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        //Ejecuta el switch hasta que la opción sea distinta de 3 (corresponde al caso de salida)
        } while (elegir != 3);
    }

	private static void maquinaMaquina() {
		// TODO Auto-generated method stub
		
	}

	private static void maquinaJugador() {
		// TODO Auto-generated method stub
		
	}

	private static void iniciar() {
		
		//Se me estan cruzando los cables
		//El metodo iniciar es para poner todo a zeros
		
		  //Inicializo las variables para estadísticas
	    int GanaJugador1 = 0;
	    int GanaJugador2 = 0;
	    int empates = 0;
		
		
		
		
	}

	

}
