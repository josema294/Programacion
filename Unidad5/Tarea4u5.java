import java.util.Scanner;

public class Tarea4u5 {

   /*  Tarea4- Recursividad-2
    Invertir una palabra de forma recursiva Desde el metodo main pasa el valor de la palabra a la función recursiva y muestrala por pantalla.
     */
    

    public static String revertidor(String palabra) {
        if (palabra.length() == 1)
          return palabra;
        else 
          return revertidor(palabra.substring(1)) + palabra.charAt(0);
       }


       public static void main(String[] args) {
           
            System.out.println("Introduce la palabra que quieres invertir");
            Scanner entrada = new Scanner (System.in);
            String palabra = entrada.nextLine();

            System.out.println( "La palabra invertida es: " + revertidor (palabra));
       }

}

