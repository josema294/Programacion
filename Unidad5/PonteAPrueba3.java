import java.util.Scanner;

public class PonteAPrueba3 {

    public static void main(String[] args) {

        System.out.println("Introduce tu numero de DNI con la letra incluida");

        Scanner entrada = new Scanner(System.in);
        String DNI = entrada.nextLine();

    }
    

    public static boolean checkdni (DNI) {
        
        char letradni = DNI.charAt(8);

        char list [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',

        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        
        resto = DNI % 23;
        

    
    }
}