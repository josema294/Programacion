public class Tarea2 {

    public static void main(String[] args) {
        
        //Tarea 2. Matriz Numeros aleatorios
        //Crea una estructura de datos estática  donde se almacenen números aleatorios 

        int matriz [][] = new int [3][3];

        for (int fila = 0; fila <3; fila++){
            for (int columna = 0; columna <3; columna ++){
                
                matriz [fila][columna] = (int) (Math.random()*100);

            }
        }


        for (int fila = 0; fila <3; fila++){
            System.out.println();
            for (int columna = 0; columna <3;columna++){
                System.out.print("[" + matriz [fila][columna]+ "]");
            }
        
        }
    }
    
}
