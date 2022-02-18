//Utilizamos los metodos del caso practico 3 e incluimos los que nos piden en el ponte a prueba.

class Coche {
    private String matricula;
    private String color;
    private String marca;

    public void agregarMatricula(String matricula){
        this.matricula = matricula;
    }

    public void agregarColor(String color){
        this.color = color;
    }

    public void agregarMarca(String marca){
        this.marca = marca;
    }

    public String devolverDescripcion(){
        String plantilla = "Marca: %s, color %s y matrícula %s";
        return String.format(plantilla, marca, color, matricula);
    }

    public Boolean equals(Coche c){
        if (c.matricula == matricula && 
            c.color == color &&   
            c.marca == marca) return true;
        else return false;
    }

    // Estos 3 metodos de abajo corresponden a los que nos piden en el ponte a prueba 3
    public Boolean parecido (Coche c) {

        if (c.color == color &&   
            c.marca == marca) return true;
        else return false;
    }

    public void copia (Coche c) {

        c.matricula = matricula;
        c.color = color;
        c.marca = marca;
    }

    public Boolean elMismo (Coche c) {

        if (System.identityHashCode(this)== System.identityHashCode(c) ){

         return true;
        }

        else return false;

    }
    
}
//Creamos la public class que contiene el main para probar que funcionan los nuevos metodos creados:
public class PonteaPrueba3{
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.agregarMarca("Seat");
        c1.agregarColor("rojo");
        c1.agregarMatricula("1234 ABC");

        Coche c2 = new Coche();
        c2.agregarMarca("Seat");
        c2.agregarColor("rojo");
        c2.agregarMatricula("1234 ABC");

        Coche c3 = c1;

        Coche c4 = new Coche();
        c4.agregarMarca("Seat");
        c4.agregarColor("rojo");
        c4.agregarMatricula("0987 ABC");

        //Estos primeras comprobaciones son las de los metodos del caso practico.
        System.out.println(c1.devolverDescripcion());
        System.out.println(c2.devolverDescripcion());
        System.out.println(c3.devolverDescripcion());
        System.out.println("\n * Comparando con ==\n");
        System.out.println("c1==c2?" + (c1 == c2));
        System.out.println("c1==c3?" + (c1 == c3));
        System.out.println("\n * Comparando con equals\n");
        System.out.println("c1.equals(c2)?" + (c1.equals(c2)));
        System.out.println("c1.equals(c3)?" + (c1.equals(c3)));
        
        //En esta parte añadimos impresiones a pantalla para ver el comportamiento y que todo esta correcto en los nuevos metodos creados.
        System.out.println("\n A partir de aqui los nuevos metodos \n");

        System.out.println(c1.parecido(c4)); //Imprimira true si los coches son de la misma marca y color, aunque tanto si la matricula es igual o diferente.

        Coche c5 = new Coche ();
        c1.copia(c5);
        System.out.println(c5.devolverDescripcion());  // Crea un objeto c5 y el metodo copie le pasa los atributos copiados de c1 e imprime su descripcion.

        System.out.println(c1.elMismo(c3)); //comprueba la coincidencia del hashcode, si coincide devuelve true aqui es true y una linea mas abajo false
        System.out.println(c1.elMismo(c2));



    }

}