import java.util.Scanner;

public class Tarea2u5 {

    public static int aletorio (int min, int max){

       double seed =  Math.random();

       return (int)(seed*(max-min) + min);

    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero minimo que quieres obtener");
        int min = entrada.nextInt();
        System.out.println("Introduce el numero maximo que quieres obtener");
        int max = entrada.nextInt();

        //for (int i =0; i<=10; i++){
        int random = aletorio (min,max);
        System.out.println("Tu numero aleatorio comprendido en el rango dado es: " + random);//}

    }
}
