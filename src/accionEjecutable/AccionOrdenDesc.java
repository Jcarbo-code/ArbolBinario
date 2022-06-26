package accionEjecutable;

import java.util.ArrayList;

public class AccionOrdenDesc extends AccionOrdenAsc {

    public AccionOrdenDesc() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void ejecutar(Comparable c) {
        this.elementos.add(0, c);
    }
}
