package Unidad11;
import java.io.File;
import java.io.IOException;

public class PonteaPrueba5u11 {

    public static void main(String[] args) {

        //Creamos los directorios que nos interesan, utilizamos condicionales para asegurarnos que lance un mensaje si ya existe la ruta
        //Si no existe la intenta crear y si no funciona lanzara un mensaje de error.

        String ruta = "carpeta1/carpeta2/carpeta3";

        File archivo = new File(ruta);

        

        if (archivo.exists()) {

            System.out.println("La ruta ya esta creada, si quieres volver a crearla borrala y vuelve a ejecutar");
        }

        else if (archivo.mkdirs()) {

            System.out.println("Directorios " + ruta + " Han sido creados.");
        }

        else { System.out.println("Algo no ha funcionado");}

        //Una vez creados los directorios, creamos los archivos que va en cada ruta

        String ruta1 = "carpeta1/fichero1.txt";
        String ruta2 = "carpeta1/carpeta2/fichero2.txt";
        String ruta3 = "carpeta1/carpeta2/carpeta3/fichero3.txt";

        File archive1 = new File(ruta1);
        File archive2 = new File(ruta2);
        File archive3 = new File(ruta3);

        //Creamos los directorios con una estructura de condicionales. Primero chequea que el archivo no exista,
        //si no existe lo crea, si no pasa ninguna de las dos cosas muestra en un aviso de que algo no ha ido como se esperaba

        try {
            
            if (archive1.exists()) {

                System.out.println(archive1.toString() + " Ya habia sido creado");
            }
            else if (archive1.createNewFile()) {

                System.out.println(archive1.toString() + " creado con exito");
            }

            else  {System.out.println("Algo ha fallado");}


            if (archive2.exists()) {

                System.out.println(archive2.toString() + " Ya habia sido creado");
            }
            else if (archive2.createNewFile()) {

                System.out.println(archive2.toString() + " creado con exito");
            }

            else  {System.out.println("Algo ha fallado");}

            if (archive3.exists()) {

                System.out.println(archive3.toString() + " Ya habia sido creado");
            }
            else if (archive3.createNewFile()) {

                System.out.println(archive3.toString() + " creado con exito");
            }

            else  {System.out.println("Algo ha fallado");}
            

        } catch (IOException e) {
            
            e.printStackTrace();
        }

        
    }
    
}
