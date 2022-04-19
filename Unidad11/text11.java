package Unidad11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class text11 {

    public static void main(String[] args) {

        try {
            
            File ruta = new File("Unidad11/el_quijote.txt");

            FileInputStream file = new FileInputStream(ruta);

            InputStreamReader leer = new InputStreamReader(file);

            /* while (leer.read()!=-1) {
                
            
            
            System.out.println((char)leer.read());
            

            }
            leer.close(); */

            FileReader lector = new FileReader(ruta);

            System.out.println(lector.read();



        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        

    }
    
}
