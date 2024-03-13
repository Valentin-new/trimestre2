package empleado_comision;

/** Fecha: 13/03/2024
 * @author Vasile Valentin Vladu
 * Curso DAW
 */


public class Empleado {
    private String nombre;
    private String apellido;
    private String numSegSocial;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, String apellido, String numSegSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSegSocial = numSegSocial;
        this.salarioBase = salarioBase;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumSegSocial() {
        return numSegSocial;
    }

    // Método para calcular el salario
    public double calcularSalario() {
        return salarioBase;
    }
}



