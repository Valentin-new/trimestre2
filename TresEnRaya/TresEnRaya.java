/**
 * 
 */
package TresEnRaya;

/** Fecha: 20/02/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

//import java.util.Sacanner;

public class TresEnRaya {

	/**
	 * 
	 */
	public TresEnRaya() {
		// Siempre scanner
		static Scanner entrada =new Sacner(System.in);
		
		
		char primerJuador1 = 'X';
		char segundoJuador2 = 'O';
		
		//Esto es un tablero hecho con un array bidimensional
		static char [] []  tablero= new char [3] [3]; 
		//tablero[0] = new int [0];
		//tablero[1] = new int [0];		 //Creo que si estan los valores a 0 dara problemas al imprimir
		//tablero[2] = new int [0];
		
		
		//debo de generar un lector o interprete de info
		//como si fuera la clase estadistica 
		
		// al inicio el tablero esta en 0
		//Si jugador1 marca = 1
		//Si jugador2 marca = 2
		
	}
	// de todas manras debemos de imprimir el tablero
	
	
	//Función imprime tablreo de caracteres
	public static void dibujaTablero(char[] tablero) {
		//Es mucho más facil hacerlo con un for que recorra las 9 casillas
        System.out.println("-------------"); //Optimización de código
        for (int i = 0; i < 9; i += 3) {  //El += es un operador de asignación compuesta
            System.out.println("| " + tablero[i] + " | " + tablero[i + 1] + " | " + tablero[i + 2] + " |");
            System.out.println("-------------");
            
        }
        //Se me ha encendido la bombilla
        
       
            

        /**
         * System.out.println(tablero[1] + " | " + tablero[2] + " | " + tablero[3]);
         * System.out.println("---------");
         * System.out.println(tablero[4] + " | " + tablero[5] + " | " + tablero[6]);
         * System.out.println("---------");
         * System.out.println(tablero[7] + " | " + tablero[8] + " | " + tablero[9]);
         */
        
    }
	
	//Función comprueba si ha ganado jugador1
	
    public static boolean ganaJugador1(char[] tablero) {
    // Verificar filas y columnas
    for (int i = 0; i < 3; i++) {
        if (tablero[i] == 'X' && tablero[i + 3] == 'X' && tablero[i + 6] == 'X') {
            return true; // Ganador en columna
        }
        if (tablero[i * 3] == 'X' && tablero[i * 3 + 1] == 'X' && tablero[i * 3 + 2] == 'X') {
            return true; // Ganador en fila
        }
    }

    // Verificar diagonales
    if (tablero[0] == 'X' && tablero[4] == 'X' && tablero[8] == 'X') {
        return true; // Ganador en diagonal principal
    }
    if (tablero[2] == 'X' && tablero[4] == 'X' && tablero[6] == 'X') {
        return true; // Ganador en diagonal secundaria
    }
	
	    return false;
	}
    
  //Función comprueba si están ocupadas todas las posiciones del tablero
    public static boolean quedanCasillas(char[] tablero) {
        for (char casilla : tablero) {
            if (casilla == ' ') {
                return true;
            }
        }
        return false;
    }
    
  //Función comprueba si ha ganado jugador2

	public static boolean ganaJugador2(char[] tablero) {
	    // Verificar filas y columnas
	    for (int i = 0; i < 3; i++) {
	        if (tablero[i] == 'O' && tablero[i + 3] == 'O' && tablero[i + 6] == 'O') {
	            return true; // Ganador en columna
	        }
	        if (tablero[i * 3] == 'O' && tablero[i * 3 + 1] == 'O' && tablero[i * 3 + 2] == 'O') {
	            return true; // Ganador en fila
	        }
	    }
	
	    // Verificar diagonales
	    if (tablero[0] == 'O' && tablero[4] == 'O' && tablero[8] == 'O') {
	        return true; // Ganador en diagonal principal
	    }
	    if (tablero[2] == 'O' && tablero[4] == 'O' && tablero[6] == 'O') {
	        return true; // Ganador en diagonal secundaria
	    }
	
	    return false;
	}
	
	public void mueveJugador1(int pos) {
		
		int pos [ ]= {1,2,3,4,5,6,7,8,9};
		//Entiendo que el usuario deberia elegir el numero
		//Con lo cual hacemos un menu
		//pero la maquina lo haria automatico con random
		
		//Inicializo variable elegir que sera ingresada por user
        int elegir;
        do {
            //Imprimo el Menu
        	System.out.print("Seleccione una opción: ");
        	System.out.println(" ");
        	for (int i = 0; i < 9; i ++) {  
                System.out.println( pos[i]);
                System.out.println(" ");
                
            }
            
            elegir = entrada.nextInt();

            //Implemento los casos
            switch (elegir) {
                case 1:
                    maquinaJugador();
                    break;
                case 2:
                    maquinaMaquina();
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
	
	public void mueveJugador2(int pos) {
		
		
		
	}
	
	public void mueveOrdenador1() {
		
		
		
	}
	
	public void mueveOrdenador2() {
		
		
		
	}
	
	public void iniciar() {
		
		
		
	}

}
