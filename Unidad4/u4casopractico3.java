import java.util.Scanner;

/**
 * u4casopractico3
 * Crea un array de 4 posiciones para guardar números de tipo entero.
 *  Haz un bucle para pedirle al usuario que rellene el array.
 *  A continuación, muestra por pantalla los datos introducidos. 
 */
public class u4casopractico3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] matriz = new int[4];
        
        for (int i=0; i<matriz.length; i++) {
            System.out.println("introduce el " + i +  " valor que formara parte del vector");
            int dato = entrada.nextInt();
            matriz [i] = dato;


        }
        for (int i=0; i<4; i++) {
            System.out.println ("El elemento " + i + " del vector es: " + matriz[i]);

        }
        
        
    }
}   