package TresEnRaya;

/** Fecha: 20/02/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

import java.util.Sacanner;

public class UsoTresEnRaya {

	public UsoTresEnRaya() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		static Scanner entrada =new Sacner(System.in);
		
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

	

}
