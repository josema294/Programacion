/* 1. Pedir por pantalla 3 notas o calificaciones a un  estudiante
2. Almacenar  cada nota en una variable
3. Calcular el promedio de las notas
4. Usando  una estructura repetitiva  do...while vuelve a pedir las 3 notas hasta que el promedio de las 3 notas sea >=5.
En este caso imprime por pantalla "Resultado: Aprobado". 
NOTA: Sube el código fuente del programa con extensión .java. 
Ten en cuenta la nomenclatura a utilizar para nombrar las clase, los métodos y los atributos de clase */

import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            int nota1 = input.nextInt();
            int nota2 = input.nextInt();
            int nota3 = input.nextInt();
            float media = (float) (nota1 + nota2+ nota3)/3;
            
        
        do {

            System.out.println("tu nota media es: " + media);
            
            nota1 = input.nextInt();
            nota2 = input.nextInt();
            nota3 = input.nextInt();
            media = (float) (nota1 + nota2+ nota3)/3;
        }   
        while ( media < 5 ); 

        
    }
    
}
