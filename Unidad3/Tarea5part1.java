/* Confeccionar un programa que lea por teclado tres números distintos y nos muestre el mayor. */

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Tarea5part1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        int A = Math.max(n1,n2);
        int B = Math.max(A,n3);

        System.out.println("El numero mas grande que has introducido es: " + B);
        
    }
    
}
