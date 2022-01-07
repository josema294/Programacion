import java.lang.reflect.Array;
import java.util.Arrays;

public class Tarea4 {

    public static void main(String[] args) {
        
        int []array = {3,2,4,10,7,8,9};
        int posicion;
        int valor = 7;
        //Ordenamos Array
        Arrays.sort(array);
        posicion = Arrays.binarySearch(array,valor);

        if (posicion >= 0){
            System.out.println("El " + valor + " aparece en la posicion" + posicion);
        }
        else {
            System.out.println("El " + valor + "No aparece en el array");
        }
    }
    
}
