package accionEjecutable;

public class AccionMayor extends AccionEjecutable {

    protected Comparable mayor;

    public AccionMayor() {
        this.mayor = null;
    }

    @Override
    public void ejecutar(Comparable c) {
        if (mayor == null) {
            mayor = c;
        } else if (mayor.compareTo(c) > 0) {
            mayor = c;
        }
    }
}
