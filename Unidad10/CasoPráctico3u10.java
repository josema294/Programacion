package Unidad10;

import java.util.Scanner;

public class CasoPráctico3u10 { 

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

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
     
        String dni;
     
        try{
     
          System.out.print("Introduce el DNI: ");
     
          dni = teclado.nextLine();
     
          teclado.close();
     
          validaDNI(dni);
     
        } catch (ErrorValidacionDNI e){
     
          System.out.println(
     
                 "Se ha producido un error en la validación del DNI");
     
          System.out.println("Mensaje del error producido: "+e.getMessage());
     
        }
     
        finally{
     
            teclado.close();
     
        }
     
      }
    
}
