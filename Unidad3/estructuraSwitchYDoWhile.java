import java.util.Scanner;

/**
 * estructuraSswitchYDoWhile:
 * 
 * El programa comprueba que el valor que introduce el usuario está entre 1 y 5, entonces ejecutará la estructura switch que se encuentra a continuación.
 * Realiza un programa que haga lo siguiente: 
 * 1. Imprima el siguiente  menú de opciones  por pantalla:
 * 2. Solicite un numero por pantalla
 * 3. Siempre que el numero se encuentre ente 1 y 5, ambos valores inclusive, escribira por pantalla: "Opcion 1/2/3/4 o 5 Ejecutada"
 */
public class estructuraSwitchYDoWhile {

    public static void main(String[] args) {
    System.out.println("1. Opcion 1 \n2. Opcion 2\n3. Opcion 3\n4. Opcion 4\n5. Opcion 5\n6. Salir");
    Scanner input = new Scanner(System.in);
    byte opcion = input.nextByte();
    switch (opcion){
    case 1:
        System.out.println("Opcion 1 Ejecutada");
        break;  
    case 2:
        System.out.println("Opcion 2 Ejecutada");
        break;  
    case 3:
        System.out.println("Opcion 3 Ejecutada");
        break;  
    case 4:
        System.out.println("Opcion 4 Ejecutada");
        break;  
    case 5:
        System.out.println("Opcion 5 Ejecutada");
        break;     
    case 6:
        break;   
    }

    }
}