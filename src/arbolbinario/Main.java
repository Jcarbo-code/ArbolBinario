package arbolbinario;

import accionEjecutable.AccionEjecutable;

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

        System.out.println(animales);

        System.out.println(numeros);

        System.out.println(empleados);
    }
}
