package empleado_comision;

/** Fecha: 13/03/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

public class EmpleadoPorComision extends Empleado {
 private int numVentas;
 private double comisionPorVenta;

 // Constructor
 public EmpleadoPorComision(String nombre, String apellido, String numSegSocial, int numVentas, double comisionPorVenta) {
     super(nombre, apellido, numSegSocial, 0); // El salario base es 0
     this.numVentas = numVentas;
     this.comisionPorVenta = comisionPorVenta;
 }

 // Redefinición del método para calcular el salario
 @Override
 public double calcularSalario() {
     return numVentas * comisionPorVenta;
 }
}


