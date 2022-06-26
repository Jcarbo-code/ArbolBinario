package arbolbinario;

import accionEjecutable.AccionContar;
import accionEjecutable.AccionMayor;
import accionEjecutable.AccionMenor;
import accionEjecutable.AccionOrdenAsc;
import accionEjecutable.AccionOrdenDesc;

public class Main {

    public static void main(String[] args) {

        Nodo numeros = new Nodo(8, null);
        numeros.agregarNodo(3);
        numeros.agregarNodo(1);
        numeros.agregarNodo(6);
        numeros.agregarNodo(10);
        numeros.agregarNodo(14);
        numeros.agregarNodo(13);
        numeros.agregarNodo(4);
        numeros.agregarNodo(7);

        Nodo animales = new Nodo("gato", null);
        animales.agregarNodo("canario");
        animales.agregarNodo("perro");
        animales.agregarNodo("conejo");
        animales.agregarNodo("liebre");
        animales.agregarNodo("jabali");
        animales.agregarNodo("carpincho");
        animales.agregarNodo("zorro");
        animales.agregarNodo("aguilucho");

        Empleado e1 = new Empleado(100000, 7253, 25458123, "Juan", "Garcia");
        Empleado e2 = new Empleado(150000, 1222, 23581111, "María", "Perez");
        Empleado e3 = new Empleado(120000, 2375, 27888954, "Pedro", "Ruiz");
        Empleado e4 = new Empleado(80000, 8253, 12515712, "Federico", "Perez");
        Empleado e5 = new Empleado(60400, 8002, 33229331, "Facundo", "Quiroga");
        Empleado e6 = new Empleado(140500, 9253, 35252232, "Rosa", "Blotta");
        Empleado e7 = new Empleado(110000, 1530, 15811654, "Florencia", "Paz");

        Nodo empleados = new Nodo(e1, null);
        empleados.agregarNodo(e2);
        empleados.agregarNodo(e3);
        empleados.agregarNodo(e4);
        empleados.agregarNodo(e5);
        empleados.agregarNodo(e6);
        empleados.agregarNodo(e7);

        AccionContar contar = new AccionContar();
        AccionMayor buscarMayor = new AccionMayor();
        AccionMenor buscarMenor = new AccionMenor();
        AccionOrdenAsc ordenAsc = new AccionOrdenAsc();
        AccionOrdenDesc ordenDesc = new AccionOrdenDesc();

        imprimirCant(numeros, contar);
        imprimirAscendente(numeros, ordenAsc);
        imprimirDescendente(numeros, ordenDesc);
        imprimirMenor(numeros, buscarMenor);
        imprimirMayor(numeros, buscarMayor);

        imprimirCant(animales, contar);
        imprimirAscendente(animales, ordenAsc);
        imprimirDescendente(animales, ordenDesc);
        imprimirMenor(animales, buscarMenor);
        imprimirMayor(animales, buscarMayor);

        imprimirCant(empleados, contar);
        imprimirAscendente(empleados, ordenAsc);
        imprimirDescendente(empleados, ordenDesc);
        imprimirMenor(empleados, buscarMenor);
        imprimirMayor(empleados, buscarMayor);
    }

    public static void imprimirCant(Nodo n, AccionContar contar) {
        n.recorrer(contar);
        System.out.println("cantidad de elementos del arbol: " + contar.getCant());
        contar.setCant(0);
    }

    private static void imprimirAscendente(Nodo n, AccionOrdenAsc orden) {
        n.recorrer(orden);
        System.out.println("elementos en orden ascendente: " + orden.getElementos());
        orden.vaciarElementos();
    }

    private static void imprimirDescendente(Nodo n, AccionOrdenDesc orden) {
        n.recorrer(orden);
        System.out.println("elementos en orden descendente: " + orden.getElementos());
        orden.vaciarElementos();
    }

    private static void imprimirMenor(Nodo n, AccionMenor menor) {
        n.recorrer(menor);
        System.out.println("el menor elemento del arbol es: " + menor.getMenor());
        menor.setMenor(null);
    }

    private static void imprimirMayor(Nodo n, AccionMayor mayor) {
        n.recorrer(mayor);
        System.out.println("el mayor elemento del arbol es: " + mayor.getMayor());
        mayor.setMayor(null);
    }
}
