package arbolbinario;

public class Empleado extends Persona implements Comparable {

    protected double sueldo;
    protected int legajo;

    public Empleado() {
        super();
    }

    public Empleado(double sueldo, int legajo, int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public int compareTo(Object o) {
        Empleado e = (Empleado) (o);
        return (this.getLegajo() - e.getLegajo());  //TERMINAR DE VER
    }

}
