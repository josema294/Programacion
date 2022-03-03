public class Jugador3 implements Colisionable, Saltador{

    public  boolean puedeColisionar() {

        return true;
    }


    public void saltar (){
        System.out.println("Puede saltar");
    }
    
}
