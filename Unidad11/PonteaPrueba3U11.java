package Unidad11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PonteaPrueba3U11 {

    public static void main(String[] args) throws FileNotFoundException {

        // En primer lugar necesitamos indicar el archivo donde se realizara la busqueda.

        String ruta = "Unidad11/el_quijote.txt";
        File archivo = new File(ruta);
        Scanner escaneado = new Scanner (archivo);

        //Pediremos por teclado la palabra a buscar dentro del texto.

        Scanner entrada = new Scanner(System.in);
        String abuscar = entrada.next();

        //Buscamos en el texto la palabra indicada, usaremos un contador int linea para calcular por donde vamos.

        int linea = 1;
         
        while (escaneado.hasNext()) {

            //Por cada linea del escaneado por la clase Scanner comprobamos si contiene el conjunto de caracteres exacto que forma nuestro string abuscar
            boolean b = (escaneado.nextLine()).contains(abuscar);

            //Si nuetra busqueda es true, indicamos que esa linea si tiene el string, e indicamos el numero de linea.
            if (b) {
                System.out.println("El texto contiene la palabra " + abuscar + " En la linea " + linea);
            }
            
            //Terminada la lectura de la linea, sumaremos 1 a linea, y el bucle se repetira.
            linea++;
            
        }

    }
}
