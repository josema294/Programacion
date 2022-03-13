package Unidad9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PonteaPrueba2 {

    public static void main(String[] args) throws FileNotFoundException {

        // Escaneamos el quijote, crearemos un arraylist con cada una de las palabras
        // del texto.
        FileReader quijote = new FileReader("Unidad9/el_quijote.txt");
        Scanner quijo = new Scanner(quijote);

        ArrayList<String> lista = new ArrayList<>();

        while (quijo.hasNext()) {
            lista.add(quijo.nextLine());
        }

        // Creamos iterator para iterarlo

        Iterator it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Ahora probamos a ordenar la lista y recorrerla sin iterador

        Collections.sort(lista);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(lista.get(i));

        }

    }

}
