package accionEjecutable;

public class AccionMenor extends AccionEjecutable {

    protected Comparable menor;

    public AccionMenor() {
        this.menor = null;
    }

    @Override
    public void ejecutar(Comparable c) {
        if (menor == null) {
            menor = c;
        } else if (menor.compareTo(c) < 0) {
            menor = c;
        }
    }

}
