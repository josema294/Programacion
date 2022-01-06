import java.util.Scanner;

public class LeibnizPiclalc {
    public static void main(String[] args) {
        
        /* Gregory-Leibniz serie */

        long count = 0;
        long precision = 500000;
        double up = 4;
        double down = 1;
        double pi = up/down;

        while (count <= precision ){

            
            down = down+2;
            if (count%2==0) {

                pi = pi - (up/down);
                
                }

            else pi = pi +(up/down);

        count ++;
        
        System.out.println(pi);


        }
    
    }
    
}