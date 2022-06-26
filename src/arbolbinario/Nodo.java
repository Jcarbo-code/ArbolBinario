package arbolbinario;

import accionEjecutable.AccionEjecutable;

public class Nodo {

    protected Comparable valor;
    protected Nodo izq;
    protected Nodo der;
    protected Nodo padre;

    public Nodo(Comparable valor, Nodo padre) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
        this.padre = padre;
    }

    public Comparable getValor() {
        return valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public void agregarNodo(Comparable o) {
        if (o.compareTo(this.valor) != 0) {
            if (o.compareTo(this.valor) > 0) {
                if (der == null) {
                    der = new Nodo(o, this);
                } else {
                    der.agregarNodo(o);
                }
            } else {
                if (o.compareTo(this.valor) < 0) {
                    if (izq == null) {
                        izq = new Nodo(o, this);
                    } else {
                        izq.agregarNodo(o);
                    }
                }
            }
        }
    }

    public void recorrer(AccionEjecutable ae) {
        if (this.getIzq() != null) {
            this.getIzq().recorrer(ae);
        }
        ae.ejecutar(this.getValor());
        if (this.getDer() != null) {
            this.getDer().recorrer(ae);
        }
    }

    @Override
    public String toString() {
        return this.valor + " (izq: " + this.izq + ", der: " + this.der + " )";
    }
}
