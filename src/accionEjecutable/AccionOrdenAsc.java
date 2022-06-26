package accionEjecutable;

import java.util.ArrayList;

public class AccionOrdenAsc extends AccionEjecutable {

    protected ArrayList<Comparable> elementos;

    public AccionOrdenAsc() {
        this.elementos = new ArrayList<>();
    }

    public ArrayList<Comparable> getElementos() {
        ArrayList<Comparable> aux = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            aux.add(elementos.get(i));
        }
        return aux;
    }

    @Override
    public void ejecutar(Comparable c) {
        this.elementos.add(c);
    }
}