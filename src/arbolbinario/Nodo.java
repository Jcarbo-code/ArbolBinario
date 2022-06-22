package arbolbinario;

import java.util.ArrayList;
import java.util.Collections;

public class Nodo implements Comparable {

    protected Object valor;
    //HIJOS
    protected Nodo izq;
    protected Nodo der;

    protected Nodo padre;

    public Nodo(Object valor) {
        this.valor = valor;
        this.padre = null;
        this.izq = null;
        this.der = null;
    }

    //GETTERS Y SETTERS
    public Object getValor() {
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
        if (this.getValor() != o) {            //si el nodo a agregar no tiene el mimso valor que el nodo raiz...
            if (this.getValor() < o) {             //si el nodo a agregar es mayor el valor que el nodo raiz...
                if (this.getDer() == null) {           //si este nodo no tiene un hijo en la derecha...
                    this.setDer(new Nodo(o, this));      //creo el hijo derecho, asignando el valor y a mi* como padre
                } else {
                    this.der.agregarNodo(o);      //si tiene hijo busco de agregarlo entre la derecha, ACA RECORRE ENTRE LAS "HOJAS"
                }
            } else if (this.getValor() > o) {             //si el nodo a agregar es menor el valor que el nodo raiz...
                if (this.getIzq() == null) {           //si este nodo no tiene un hijo en la izquierda...
                    this.setIzq(new Nodo(o, this));      //creo el hijo izquierdo, asignando el valor y a mi* como padre
                } else {
                    this.izq.agregarNodo(o);      //si tiene hijo busco de agregarlo entre la izquierda, ACA RECORRE ENTRE LAS "HOJAS"
                }
            }
        }
    }

    public int cantNodos(Nodo n) {
        int cant = 0;
        if (n.getDer() != null) {
            cant += cantNodos(n.getDer());
        }
        if (n.getIzq() != null) {
            cant += cantNodos(n.getIzq());
        }
        return cant++;
    }

    public ArrayList<Nodo> ascendente(Nodo n) {
        ArrayList<Nodo> aux = new ArrayList<>();
        aux.add(this);
        if (n.getIzq() != null) {
            aux.addAll(ascendente(n.getIzq()));
        }
        if (n.getDer() != null) {
            aux.addAll(ascendente(n.getDer()));
        }
        Collections.sort(aux);
        return aux;
    }

    @Override
    public int compareTo(Object o) {                //Compara por valor numerico
        return (this.getValor().compareTo(o.getValor()));   //BUSCAR ERROR
    }

    @Override
    public String toString() {
        return "nodo: " + this.getValor();
    }
}
