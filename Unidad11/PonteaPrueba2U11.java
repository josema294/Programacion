package Unidad11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PonteaPrueba2U11 {

    public static void main(String[] args) throws IOException {

        File archivo = new File("Unidad11/datos.txt");
        
        FileReader fr = new FileReader(archivo);

        BufferedReader read = new BufferedReader(fr);

        try {
            String salida = read.readLine();
            System.out.println(salida);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        read.close();
    
    }
}
