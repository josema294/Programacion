public class Tarea5 {

    public static void main(String[] args) {
        
        int matriz [][] = new int [4][5];
        int sumf1=0;
        int sumc1=0;
        int total = 0;
        
        for (int fila =0; fila < matriz.length ; fila++){
            for (int columna = 0; columna < matriz[fila].length ; columna++){

                matriz [fila] [columna] = (int) (Math.random()*10);


               // System.out.print("["+ matriz[fila][columna ]+ "]");

            }
            
            System.out.println();
        }
        System.out.println("A continuacion mostramos una matriz 4x5 aleatoria, donde en amarillo se suman sus filas y sus columnas,\n" + "y en color rojo el total de ambas: \n");

        for (int fila =0; fila < matriz.length; fila++){
            //System.out.println();
            for (int columna = 0; columna < matriz[fila].length ; columna++){

                sumf1 = sumf1 + matriz [fila] [columna];
                
                System.out.print("["+ matriz[fila][columna ]+ "]");

            }
        System.out.println( "\u001B[33m" + "[" + sumf1 + "]" + "\u001B[0m");
        sumf1=0;
            
        }
        for (int columna = 0; columna <5; columna++)   {

            for (int fila =0 ; fila <4; fila++){

                sumc1 = sumc1 + matriz [fila] [columna];
                
            }
        System.out.print("\u001B[33m" +"[" + sumc1 + "]");
        total = total + sumc1;
        sumc1=0;
        
        

            
        }
        System.out.print("\u001B[31m" +"[[" + total + "]]");
    }
    
}
