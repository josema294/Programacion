package Unidad11;

import java.io.File;
import java.util.Scanner;

/**
 * PonteaPrueba1U11
 * utilizamos el_quijote.txt
 */
public class PonteaPrueba1U11 {

    public static void main(String[] args) {
        System.out.println("Introduce el archivo que quieres que sea analizado");

        Scanner entrada = new Scanner(System.in);
        String directorio = entrada.nextLine();
        
        File archivo = new File(directorio);

        System.out.println("Nombre: " + archivo.getName() + " Ruta: " + archivo.getAbsolutePath() + " Peso: " + archivo.length() + " Ejecutable " + archivo.canExecute()+" Leible " + archivo.canRead());
        entrada.close();
        

        
    }

}