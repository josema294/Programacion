package Unidad9;

import java.util.Scanner;

public class ProbarLista {
    static Scanner input = new Scanner(System.in);
    int cod;
    String nom;
    String tp;
    double pvp;
    int stock;

    public static void main(String[] args) {

        Producto p1 = new Producto(pedirCodigo(), pedirNombre(), pedirTipo(), pedirPrecio(), pedirStock());
        Producto p2 = new Producto(pedirCodigo(), pedirNombre(), pedirTipo(), pedirPrecio(), pedirStock());
        Producto p3 = new Producto(pedirCodigo(), pedirNombre(), pedirTipo(), pedirPrecio(), pedirStock());

        Coleccion lista = new Coleccion();
        
        lista.adicionar(p1);
        lista.adicionar(p2);
        lista.adicionar(p3);

        lista.mostrarTodo();
        lista.aumentoPrecio();
        lista.mostrarTodo();
        

    }

    // Creo funciones para que el codigo correspondiente a pedir por terminal los productos no tenga que ser repetido.

    static int pedirCodigo() {

        System.out.println("Introduce el codigo de producto");
        int cod = input.nextInt();
        return cod;
    }

    static String pedirNombre() {
        System.out.println("Introduce el nombre del producto");
        String nom = input.next();
        return nom;
    }

    static String pedirTipo() {
        System.out.println("Introduce el tipo del producto");
        String tp = input.next();
        return tp;
    }

    static double pedirPrecio() {

        System.out.println("Introduce el pvp del producto");
        double pvp = input.nextDouble();
        return pvp;
    }

    static int pedirStock() {
        System.out.println("Introduce el stock del producto");
        int stock = input.nextInt();
        return stock;

    }

}
