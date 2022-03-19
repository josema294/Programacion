

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Casopráctico2{

    public static void main(String[] args) {
        
        //creamos la lista de numeros enteros.

        ArrayList <Integer> miLista = new ArrayList<>();
        
        miLista.add(1);
        miLista.add(31);
        miLista.add(20);
        miLista.add(2);
        miLista.add(7);
        miLista.add(45089);
        miLista.add(000);
        
        //Con iterador
        Iterator <Integer> Itera = miLista.iterator();
            
        while (Itera.hasNext()){
            System.out.println(Itera.next());
        }
        //Sin Iterador
        for  (int i =0; i < miLista.size(); i++ ) {
            System.out.println(miLista.get(i));

        }

        Collections.sort(miLista);

        for (Integer i : miLista) {
            System.out.println(i);
            
        }

    }
}
