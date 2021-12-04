import java.util.Random;

public class u4ponteaprueba {
    public static void main(String[] args) {
        
        Random dice = new Random();
         
        

        for (int i = 0; i<2; i++){
            int dado = dice.nextInt(6) + 1;
            System.out.println(dado);
 
        }
    }
    
}
