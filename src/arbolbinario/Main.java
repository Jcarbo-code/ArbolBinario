package arbolbinario;

public class Main {

    public static void main(String[] args) {

        ArbolBinario numeros = new ArbolBinario();
        Nodo raiz = new Nodo(8);
        numeros.setRaiz(raiz);
        //	numeros.addValor(8);
        numeros.addValor(3);
        numeros.addValor(1);
        numeros.addValor(6);
        numeros.addValor(10);
        numeros.addValor(14);
        numeros.addValor(13);
        numeros.addValor(4);
        numeros.addValor(7);

        /*
		//imprimo nodo raiz
		System.out.println(raiz);
		//imprimo nodo ordenado
		System.out.println(numeros.recorrer());
		//imprimo el arbol
		System.out.println(numeros);
         */
        ArbolBinario animales = new ArbolBinario();
        Nodo raizAnimales = new Nodo("gato");
        animales.setRaiz(raizAnimales);
        animales.addValor("gato");
        animales.addValor("canario");
        animales.addValor("perro");
        animales.addValor("conejo");
        animales.addValor("liebre");
        animales.addValor("jabali");
        animales.addValor("carpincho");
        animales.addValor("zorro");
        animales.addValor("aguilucho");

        //imprimo nodo raiz 
        System.out.println(raizAnimales);
        //imprimo nodo ordenado
        // System.out.println(animales.recorrer());
        //imprimo el arbol
        System.out.println(animales);
        System.out.println(animales.contarElementos());

        System.out.println(animales.recorrerDescendente());

        ArbolBinario empleados = new ArbolBinario();
        Empleado eRaiz = new Empleado(90000, 4419, 39590302, "Joe", "Carbo");
        Nodo raizEmpleados = new Nodo(eRaiz);
        empleados.setRaiz(raizEmpleados);

        Empleado e1 = new Empleado(100000, 7253, 25458123, "Juan", "Garcia");
        Empleado e2 = new Empleado(150000, 1222, 23581111, "María", "Perez");
        Empleado e3 = new Empleado(120000, 2375, 27888954, "Pedro", "Ruiz");
        Empleado e4 = new Empleado(80000, 8253, 12515712, "Federico", "Perez");
        Empleado e5 = new Empleado(60400, 8002, 33229331, "Facundo", "Quiroga");
        Empleado e6 = new Empleado(140500, 9253, 35252232, "Rosa", "Blotta");
        Empleado e7 = new Empleado(110000, 1530, 15811654, "Florencia", "Paz");

        //	numeros.addValor(8);
        empleados.addValor(e1);
        empleados.addValor(e2);
        empleados.addValor(e3);
        empleados.addValor(e4);
        empleados.addValor(e5);
        empleados.addValor(e6);
        empleados.addValor(e7);
    }

}
