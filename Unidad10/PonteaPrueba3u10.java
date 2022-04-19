package Unidad10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PonteaPrueba3u10 {

    //Mantengo este bloque de codigo para llamarlo desde el try

    public static void validaDNI(String dni) throws ErrorValidacionDNI{

        // Comprobamos que tiene una longitud de 9 caracteres
        if (dni.length() != 9) throw new LongitudDNINoValida();

        // Comprobamos que el último carácter es una letra
        if (!Character.isLetter(dni.charAt(8))) throw new
        UltimoDigitoNoLetra();

        // Comprobamos que el resto de caracteres son dígitos
        for(int i = 0; i < 8; i++)
        if (!Character.isDigit(dni.charAt(i))) throw new
        NumeracionContieneLetra();

        
    }


    public static void main(String[] args) throws ErrorValidacionDNI{
        Scanner teclado = new Scanner(System.in);
        String dni;
        boolean validador = true;

        //He decidido incluir un buble while para que en vez de terminar el programa vuelva a pedir el DNI si este se introduce incorrectamente,
    
        while (validador) {
            try {
            System.out.print("Introduce el DNI: ");
            dni = teclado.nextLine();
            validaDNI(dni);
            validador = false;
            }

            
            catch (UltimoDigitoNoLetra e) {

                System.out.println("El formato introducido no es correcto: ");
                System.out.println(e.getMessage());
                
            }

            catch (LongitudDNINoValida e) {

                System.out.println("El formato introducido no es correcto: ");
                System.out.println(e.getMessage());
                
            }

            catch (NumeracionContieneLetra e) {

                System.out.println("El formato introducido no es correcto: ");
                System.out.println(e.getMessage());
                
            }

            /* Esta parte del codigo no se ejecutara en el estado actual del programa, no hay casos de ValidaDNI() que no esten cubiertos, pero la incluyo porque 
            el codigo se podria ampliar y mejorar con casos que no estuvieran especificados, y podriamos llamarla como un error mas generico.
            Por ejemplo 50906070あ es un DNI valido en este programa porque あ es un caracter, pero no es un DNI valido en la vida real, con un validaDNI() mejor hecho podriamos 
            contemplar casos mas raros y menos especificos y lanzar un error mas general para que no nos puedan boicotear el programa.
             */
            catch (InputMismatchException e) {
            
                System.out.println("El formato introducido no es correcto: ");
                System.out.println(e.getMessage());

            }
            
        }
    }


    
}
