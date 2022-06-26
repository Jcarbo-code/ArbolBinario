package accionEjecutable;

public class AccionMenor extends AccionEjecutable {

    protected Comparable menor;

    public AccionMenor() {
        this.menor = null;
    }

    public Comparable getMenor() {
        return menor;
    }

    public void setMenor(Comparable menor) {
        this.menor = menor;
    }

    @Override
    public void ejecutar(Comparable c) {
        if (menor == null) {
            menor = c;
        } else if (menor.compareTo(c) > 0) {
            menor = c;
        }
    }
}
