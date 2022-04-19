package Unidad11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class PonteaPrueba4u11 {

    public static void main(String[] args) {
        
        //crearemos primero un objeto de clase Amigo


        Amigo amigo1 = new Amigo("Pepito", "Perez", LocalDate.of(1989, 04, 29) , 32);

        //Guardamos el objeto en un arhivo de texto agenda.txt

        try {

            FileOutputStream agenda = new FileOutputStream("Unidad11/agenda.txt");
            ObjectOutputStream oos = new ObjectOutputStream(agenda);
            oos.writeObject(amigo1);
            oos.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        //Podemos leer y obtener los datos del archivo

        try {

            FileInputStream agenda = new FileInputStream("Unidad11/agenda.txt");
            ObjectInputStream ois = new ObjectInputStream(agenda);
            System.out.println(ois.readObject());
            ois.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }

    }
    
}
