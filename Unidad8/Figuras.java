import java.util.Arrays;

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
                return true;
                
            }

        }
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

            if (figuras[i].equals(f)){

                figuras [i]= null;
                return true;
                
            }

        }
        return false;

    }

    @Override
    public String toString() {
        return "Figuras [figuras=" + Arrays.toString(figuras) + "]";
    }

   

}
