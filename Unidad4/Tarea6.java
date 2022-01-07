import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un texto que quieras");
        int counter = 0;
        Scanner input = new Scanner(System.in);
        String texto = input.nextLine();

        System.out.println("Introduce la letra que quieras buscar");
        char letra = input.next().charAt(0);

        for (int i =0; i<texto.length(); i++){

            char busqueda = texto.charAt(i);
            if (busqueda == letra) {

                counter = counter +1;
            }
        }
       System.out.println(counter);
    }
    
}
