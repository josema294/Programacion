/* Se carga una fecha (día, mes y año) por teclado. 
Mostrar un mensaje si corresponde al primer trimestre del año (enero, febrero o marzo) Cargar por teclado el valor numérico del día, mes y año. */


import java.util.Scanner;

public class Tarea5part2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el dia");
        int dia = entrada.nextInt();
        System.out.println("Introduce el mes en numero");
        int mes = entrada.nextInt();
        System.out.println("Introduce el año");
        int año = entrada.nextInt();

        if (mes<=3){
            System.out.println("Estas en el primer triemestre");
        }

        else {
            System.out.println("No estas en el primer trimestre");
        }
   
   
    }   
}   
