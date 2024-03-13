package empleado_comision;

/** Fecha: 13/03/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

public class EmpleadoBaseMasComision extends Empleado {
	 private int numVentas;
	 private double comisionPorVenta;

	 // Constructor
	 public EmpleadoBaseMasComision(String nombre, String apellido, String numSegSocial, double salarioBase, int numVentas, double comisionPorVenta) {
	     super(nombre, apellido, numSegSocial, salarioBase);
	     this.numVentas = numVentas;
	     this.comisionPorVenta = comisionPorVenta;
	 }

	 // Redefinición del método para calcular el salario
	 @Override
	 public double calcularSalario() {
	     return super.calcularSalario() + (numVentas * comisionPorVenta);
	 }
	}

