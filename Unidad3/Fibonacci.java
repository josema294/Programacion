import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Introduce hasta que numero quieres calcular");
        Scanner input = new Scanner(System.in);
        long entrada = input.nextLong();
        
        long Fibo1 = 0;
        long Fibo2 = 1; 
        
        while (Fibo1<entrada) {
            System.out.println(Fibo1);
            
            Fibo1 = Fibo2 + Fibo1;
            Fibo2 =  Fibo1 - Fibo2;

            
        }
        
        double numfibo = (double) Fibo1/ (double) Fibo2;
        System.out.println(numfibo);
    }
    
}
