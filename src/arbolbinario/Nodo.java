package arbolbinario;

import java.util.ArrayList;

public class Nodo {

    protected Comparable valor;
    protected Nodo izq;
    protected Nodo der;
    protected Nodo padre;

    public Nodo(Comparable valor) {
        this.valor = valor;
        this.padre = null;
        this.izq = null;
        this.der = null;
    }

    public Nodo(Comparable valor, Nodo padre) {
        this(valor);
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

    public void agregarNodo(Object o) {
        if (valor.compareTo(this.valor) != 0) {
            if (valor.compareTo(this.valor) > 0) {
                if (der == null) { // si el valor de la derecha es nulo, creo el nodo y me paso como padre
                    der = new Nodo(valor, this); //
                } else {
                    der.agregarNodo(valor); // sino intento agregarlo en las hojas de la derecha
                }
            } else {
                if (valor.compareTo(this.valor) < 0) {
                    if (izq == null) { // si el valor de la izquierda es nulo
                        izq = new Nodo(valor, this); // creo un nuevo nodo y me paso como padre
                    } else {
                        izq.agregarNodo(valor); // sino intento agregarlo en las hojas de la izquierda
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.valor + " (izq: " + this.izq + ", der: " + this.der + " )";
    }

    public boolean contains(Comparable valor) {
        if (this.valor.compareTo(valor) == 0) // si comparo mi valor con el valor que me pasan y es igual retorno true
        {
            return true;
        } else if (valor.compareTo(this.valor) > 0 && der != null) // si el valor que me pasan es mayor a mi y no tengo ya
        // seteado mi hijo derecho
        {
            return der.contains(valor); // retorno
        } else if (valor.compareTo(this.valor) < 0 && izq != null) {
            return izq.contains(valor);
        }
        return false;
    }

    //Punto 1. incorporar todos los elementos en forma ordenada ascendentemente.
    public ArrayList<Comparable> ascendente() {
        /* PRIMER FORMA DISEÑADA
        aux.add(this);
        if (n.getIzq() != null) {
            aux.addAll(ascendente(n.getIzq()));
        }
        if (n.getDer() != null) {
            aux.addAll(ascendente(n.getDer()));
        }
        Collections.sort(aux);
        return aux;*/

        ArrayList<Comparable> aux = new ArrayList<>();
        if (this.getIzq() != null) {
            aux.addAll(this.getIzq().ascendente());
        }
        aux.add(this.getValor());
        if (this.getDer() != null) {
            aux.addAll(this.getDer().ascendente());
        }
        return aux;
    }

    //Punto 2. incorporar todos los elementos en forma ordenada descendentemente.
    public ArrayList<Comparable> descendente() {
        /* PRIMER FORMA DISEÑADA
        aux.add(this.getValor());
        if (n.getIzq() != null) {
            aux.addAll(ascendente(n.getIzq()));
        }
        if (n.getDer() != null) {
            aux.addAll(ascendente(n.getDer()));
        }
        Collections.sort(aux).reverse;
        return aux;*/

        ArrayList<Comparable> aux = new ArrayList<>();
        if (this.getDer() != null) {
            aux.addAll(this.getDer().descendente());
        }
        aux.add(this.getValor());
        if (this.getIzq() != null) {
            aux.addAll(this.getIzq().descendente());
        }
        return aux;
    }

    //Punto 3. contar la cantidad de elementos del arbol
    public int cantNodos() {
        int cant = 1;
        if (this.getDer() != null) {
            cant += this.getDer().cantNodos();
        }
        if (this.getIzq() != null) {
            cant += this.getIzq().cantNodos();
        }
        return cant;
    }
}
