/*Considera una matriz ( array bidimensional) de 3 filas y 5 columnas

1. Carga todos los valores de la matriz mediante la introduccion por consola de dichos valores

2. Imprime el contenido de dicha matriz. */

import java.util.Scanner;

public class Tarea1 {

   public static void main(String[] args) {

        int[][] matrix = new int [3][5]; 

        Scanner input = new Scanner(System.in);

        for (int fila = 0; fila < matrix.length; fila++){
            for( int columna = 0; columna < matrix[fila].length; columna++){
                matrix [fila][columna]= input.nextInt();
                }

        }

        for (int fila = 0; fila < matrix.length; fila++){
            
            for( int columna = 0; columna < matrix[fila].length; columna++){
                System.out.print("[" + matrix [fila][columna]+ "]");
            }
            System.out.println();    
        }

    }
}