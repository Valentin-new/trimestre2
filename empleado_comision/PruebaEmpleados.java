package empleado_comision;

/** Fecha: 13/03/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

public class PruebaEmpleados {
	 public static void main(String[] args) {
	     // Crear empleados
	     Empleado empleado1 = new EmpleadoPorComision("Juan", "García", "123456789", 10, 50);
	     Empleado empleado2 = new EmpleadoPorComision("María", "López", "987654321", 15, 60);
	     Empleado empleado3 = new EmpleadoBaseMasComision("Carlos", "Martínez", "456789123", 1000, 20, 70);
	     Empleado empleado4 = new EmpleadoBaseMasComision("Laura", "Sánchez", "321654987", 1200, 25, 80);

	     // Imprimir nombre y salario de cada empleado
	     System.out.println("Empleado 1 - Nombre: " + empleado1.getNombre() + ", Salario: " + empleado1.calcularSalario());
	     System.out.println("Empleado 2 - Nombre: " + empleado2.getNombre() + ", Salario: " + empleado2.calcularSalario());
	     System.out.println("Empleado 3 - Nombre: " + empleado3.getNombre() + ", Salario: " + empleado3.calcularSalario());
	     System.out.println("Empleado 4 - Nombre: " + empleado4.getNombre() + ", Salario: " + empleado4.calcularSalario());
	 }

	}
