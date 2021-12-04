/* Utilizando el operador condicional  ternario  ? : realiza el siguiente programa en java:
1. Pedir por pantalla 3 notas o calificaciones a un  estudiante
2. Almacenar  cada nota en una variable
3. Calcular el promedio de las notas
4. Usando  el operador ternario imprime por pantalla  la calificación del alumno "Aprobado" 
si el alumno obtiene una nota media => 5 o la calificación "suspenso" en caso que la nota media sea < 5
NOTA: Subir el codigo fuente de tu programacion con extension .java. 
Ten en cuenta la nomenclatura a utilizar para nombrar las clase, los metodos y los atributos de clase */

import java.util.Scanner;
public class ejercicioOperadorternario {
    public static void main(String[] args) {
        System.out.println("Introduce 3 notas");
        
        Scanner input1 = new Scanner(System.in); Scanner input2 = new Scanner(System.in); Scanner input3 = new Scanner(System.in);
        
        float nota1 = input1.nextFloat();
        float nota2 = input2.nextFloat();
        float nota3 = input3.nextFloat();
        float media = (nota1+nota2+nota3)/3;
        System.out.println("Tu media es: " + media);

        String notafinal = (media>=5)? "Aprobado":"Suspendido";
        System.out.println(notafinal);

        
    }
    
}
