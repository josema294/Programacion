package Unidad6;

public class semaforo {

    private String color;

    public semaforo () {

        this.color = "rojo";
    }
    
    public String nextcolor () {

        if (this.color == "verde"){

            this.color = "amarillo";
            return color;
        }
        else if (color == "amarillo") {
            this.color = "rojo";
            return color;
        }
        else {
            color = "verde";
            return color;
        }
    }

    public String cruzando () {

        if (this.color == "verde"){

            return "puedes cruzar la calle";
        }
        else if (color == "amarillo") {
            return "cruza con cuidado";
        }
        else {
            return "No puedes cruzar";
        }
    }

    public static void main(String[] args) {
        
        semaforo semaforo1 = new semaforo();
        semaforo1.nextcolor();
        semaforo1.nextcolor();
        System.out.println(semaforo1.cruzando()); 
        
        
    }

}
