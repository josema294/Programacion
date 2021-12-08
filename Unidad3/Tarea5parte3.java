import java.util.Scanner;

/* Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. 
Mostrar un mensaje de error si el número de cifras es mayor de tres.*/

public class Tarea5parte3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        short num = entrada.nextShort();

        if ( num >= 0 && num < 10) {
            
            System.out.println("Tu numero tiene 1 cifra");
        }


        else if ( num <0){
            System.out.println("Te han pedido un numero positivo, el que has introducido es negativo");
        }

        else if (num <100){
            System.out.println("Tu numero tiene 2 cifras");
        }

        else if (num < 1000){
            System.out.println("Tu numero tiene 3 cifras, este es el limite");
        }

        else {
            System.out.println("El maximo permitido son 3 cifras, este programa no admite tu numero.");
        }
        
    }

}
