import java.io.Serializable;

public class Empleado implements Serializable {
    private String DNI;
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String DNI, String nombre, int edad, double sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return nombre + ": [DNI = " + DNI +", nombre = " + nombre + ", edad = " + edad + ", sueldo = " + sueldo + "]";
    }
}
