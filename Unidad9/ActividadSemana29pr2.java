

import java.util.ArrayList;
import java.util.HashMap;

public class ActividadSemana29pr2 {

    public static void main(String[] args) {

        ArrayList<String> miLista = new ArrayList<String>();
        HashMap <Character,Integer> diccionario = new HashMap<>();
        
        miLista.add("abc");
        miLista.add("bcd");
        miLista.add("cde");
        miLista.add("sdfWSER2W34R");
        miLista.add("GHJTYUsdfw3");
        miLista.add("asdqoiwedhskdlfnsmdsdfmsel;dfjopserfjerktndfjosnviosefjiowenrfjksnfvpaosfopweirfwjngvojiwehuiewrjklfgnopsdfkpwoefjnfaioqewjdq");

        //Itero la lista de arrays con un bucle, y dentro de estos itero cada caracter c.
        //En mi caso he optado por crear un diccionario que guarde los pares caracter y numero de veces que aparece. 

        for (String l : miLista) {

            for (int i = 0; i < l.length(); i++) {

                char c = l.charAt(i);

                if (diccionario.containsKey(c)) {

                    int value = diccionario.get(c);
                    value++;
                    diccionario.put(c, value);
                    
                } else {

                    diccionario.putIfAbsent(c, 1);
                }
                
            }
            
        }
        System.out.println(diccionario.toString());
    }

}
