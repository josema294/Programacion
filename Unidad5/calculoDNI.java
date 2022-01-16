import java.util.Scanner;

public class calculoDNI {

    public static char letraDni (int entradadni){

        int resto = entradadni %23;
        char list [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',

        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return list[resto];

    }

    public static void main(String[] args) {
        System.out.println("Introduce tu dni para calcular la letra que tine");
        Scanner teclado = new Scanner(System.in);
        int dnintroducido = teclado.nextInt();

        System.out.println(" La letra de tu DNI es: " + letraDni(dnintroducido));


    }
    
}
