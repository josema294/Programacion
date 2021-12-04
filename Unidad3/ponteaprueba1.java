import java.util.Scanner;

/**
 * ponteaprueba1
 */
public class ponteaprueba1 {
    
    public static void main(String[] args) {
        /*Empieza nuestro codigo aqui:
        *Tratemos de crear un programa que lea tres datos diferentes por teclado:
        *El número de alumnos de tu clase.
        *Tu nombre completo.
        *La nota media que obtuviste en la ESO.*/

        System.out.println("Introduzca el numero de alumnos, Tu nombre completo y la nota media de tu expediente: ");
        Scanner input = new Scanner(System.in);
        int clase = input.nextInt();
        String nombre = input.next();
        float media = input.nextFloat();
        System.out.println("Los alumnos en clase son: " + clase);
        System.out.println("Tu nombre es " + nombre);
        System.out.println("La nota media es " + media);
    }
}       

