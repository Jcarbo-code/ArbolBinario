package arbolbinario;

public class Nodo implements Comparable {

    protected int valor;
    //HIJOS
    protected Nodo izq;
    protected Nodo der;

    protected Nodo padre;

    public Nodo(int valor, Nodo padre) {
        this.valor = valor;
        this.padre = padre;
        /*PARA HIJOS VACIOS DECLARAR COMO NULOS?
        this.izq = NULL;
        this.der = NULL;*/
    }

    //GETTERS Y SETTERS
    public int getValor() {
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

    public void agregarNodo(int n) {
        if (this.getValor() != n) {            //si el nodo a agregar no tiene el mimso valor que el nodo raiz...
            if (this.getValor() < n) {             //si el nodo a agregar es mayor el valor que el nodo raiz...
                if (this.getDer() == null) {           //si este nodo no tiene un hijo en la derecha...
                    this.setDer(new Nodo(n, this));      //creo el hijo derecho, asignando el valor y a mi* como padre
                } else {
                    this.der.agregarNodo(n);      //si tiene hijo busco de agregarlo entre la derecha, ACA RECORRE ENTRE LAS "HOJAS"
                }
            } else if (this.getValor() > n) {             //si el nodo a agregar es menor el valor que el nodo raiz...
                if (this.getIzq() == null) {           //si este nodo no tiene un hijo en la izquierda...
                    this.setIzq(new Nodo(n, this));      //creo el hijo izquierdo, asignando el valor y a mi* como padre
                } else {
                    this.izq.agregarNodo(n);      //si tiene hijo busco de agregarlo entre la izquierda, ACA RECORRE ENTRE LAS "HOJAS"
                }
            }
        }
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
