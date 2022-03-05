import java.util.Arrays;
/** Clase para encapsular el vector de figura geomtricas, implementa metodos adecuados para que se pueda, agregar, eliminar figuras o imprimir el vector.*/  
public class Figuras {

    FiguraGeometrica figuras[];
    int longitud;

    // Constructor
    public Figuras(int longitud) {
        this.longitud = longitud;
        this.figuras = new FiguraGeometrica[longitud];
    }

    /** Agrega un objeto del tipo figura al primer hueco no ocupado del vector de figuras.
     * Si dicho vector esta completamente ocupado no agrega ningun elemento nuevo
     * 
     * @param f
     * @return true si el objeto es agregado a la matriz y falso si no ha sido posible agregarlo.
     */  
    public boolean add(FiguraGeometrica f) {

        for (int i =0; i < figuras.length; i++) {
            if (figuras[i] == null) {
                figuras[i]=f;
                System.out.println("La figura " + f +" Ha sido agregada");
                return true;
                
            }

        }
        System.out.println("Vector de figuras saturado, la figura " + f + " No se ha podido agregar");
        return false;
    }

    /** Elimina la figura pasada como parametro al metodo del vector de objetos.
     * Se iterara el metodo de forma lineal para buscar el objeto f en el vector
     * @param f
     * @return true si se encuentra objeto y elimina, false si no se haya el objeto pasado 
     * como parametro y por lo tanto no se puede eliminar del vector.
     * 
     *  */  
    public boolean remove(FiguraGeometrica f) {

        for (int i =0; i<figuras.length; i++) {
            
            if (figuras[i] == null){
                continue;
            }
            else if (figuras[i].equals(f)) { 
                
                figuras [i]= null;
                System.out.println("La figura " + f + " Ha sido eliminada");
                return true;
                
            }

        }
        System.out.println("No se ha podido eliminar la figura " + f);
        return false;

    }

    @Override
    public String toString() {

        String add; 
        String adevolver = "";

        for (int i=0; i < figuras.length; i++) {

            if (figuras[i] == null ) {
                add = "Objeto vacio";
                adevolver += add + "\n";
            }

            else { 
                add = figuras[i].toString();
                adevolver = adevolver + add + "\n";
            }


        }

        return "Los objetos que componen el vector son los siguientes : \n" + adevolver;
    }
}

   


