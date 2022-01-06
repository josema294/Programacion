import java.util.Scanner;

/*Escribe un programa que pida 10 números por teclado,   los almacene en un array y que luego muestre el máximo valor, 

   el mínimo y las posiciones que ocupan en el array*/

public class Tarea3 {

    public static void main(String[] args) {

        int array[] = new int[10];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i<array.length; i++){
            
            System.out.println("Introduce el valor " + i + " del vector.");
            array[i]=input.nextInt();

       }

       //Sacamos el maximo

       int maximo = array[0];
       int minimo = array[0];
       int maxpos = 0;
       int minpos =0;
       for (int i = 0; i<array.length; i++){
           if (array[i]>maximo){
               maximo = array[i];
               maxpos = i;
               
           }

           if (array[i]<minimo){
               minimo = array[i];
               minpos = i;

           }


       }

        System.out.println("El valor maximo es " + maximo + " en la posicion " + maxpos + " Y el valor minimo es " + minimo + " que esta en la posicion " + minpos);
        
    }

   

   
    
}
