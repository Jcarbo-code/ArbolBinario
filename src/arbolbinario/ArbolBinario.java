package arbolbinario;

import java.util.ArrayList;

public class ArbolBinario {

    protected Nodo raiz;

    public void setRaiz(Nodo valor) {
        this.raiz = valor;
    }

    public void addValor(Comparable valor) {
        if (raiz != null) {
            if (!this.contains(valor)) {
                raiz.agregarNodo(valor);
            }
        }
    }

    private boolean contains(Comparable valor) {
        if (raiz == null) {
            return false;
        }
        return raiz.contains(valor);
    }

    public ArrayList<Comparable> recorrerDescendente() {
        if (raiz != null) {
            return raiz.descendente(); //la guardo descendente
        }
        return new ArrayList<>(); //sino retorno un arreglo vac�o
    }

    public int contarElementos() {
        if (raiz != null) {
            return raiz.cantNodos();
        }
        return 0;
    }

    @Override
    public String toString() {
        //imprimo cual es mi raiz y despues imprimo la raiz (el metodo toString esta redefinido en el nodo)
        return "ArbolBinario [raiz=" + raiz + "]";
    }

    /*public Comparable mayorElemento() {
        if (raiz != null) {

        }
        return null;
    }*/
}
