package accionEjecutable;

public class AccionContar extends AccionEjecutable {

    protected int cant;

    public AccionContar() {
        this.cant = 0;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public void ejecutar(Comparable c) {
        this.setCant(getCant() + 1);
    }

}