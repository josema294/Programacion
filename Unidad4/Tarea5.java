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

        for (int fila =0; fila < matriz.length; fila++){
            //System.out.println();
            for (int columna = 0; columna < matriz[fila].length ; columna++){

                sumf1 = sumf1 + matriz [fila] [columna];
                
                System.out.print("  ["+ matriz[fila][columna ]+ "] ");

            }
        System.out.println("[[" + sumf1 + "]]");
        sumf1=0;
            
        }
        for (int columna = 0; columna <5; columna++)   {

            for (int fila =0 ; fila <4; fila++){

                sumc1 = sumc1 + matriz [fila] [columna];
                
            }
        System.out.print("[[" + sumc1 + "]]");
        total = total + sumc1;
        sumc1=0;
        
        

            
        }
        System.out.print("[[" + total + "]]");
    }
    
}
