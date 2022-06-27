package arbolbinario;

public class Empleado extends Persona implements Comparable<Empleado> {

    protected int sueldo;
    protected int legajo;

    public Empleado() {
        super();
    }

    public Empleado(int sueldo, int legajo, int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
        this.legajo = legajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public int compareTo(Empleado o) {
        return (this.getLegajo() - o.getLegajo());
    }

    @Override
    public String toString() {
        return (this.nombre + " " + this.apellido + ": (DNI " + this.dni + ", sueldo: " + this.sueldo + "legajo " + this.legajo + ")");
    }
}
