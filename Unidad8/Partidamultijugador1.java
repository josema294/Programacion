/**
 * partidamultijugador
 */
public class Partidamultijugador1 {

    private Jugador1 [] jugadores;
    private int numerojugadores;
    private int numerojugadoresmaximo;

    //Constructor
    public Partidamultijugador1( int numerojugadoresmaximo) {
        this.numerojugadores=0;
        this.numerojugadoresmaximo = numerojugadoresmaximo;
        this.jugadores = new Jugador1 [numerojugadoresmaximo];
        
    }

    //Método anyadirJugador
    public boolean anyadirJugador (Jugador1 j) {

        if (numerojugadores<numerojugadoresmaximo) {
            jugadores [numerojugadores] = j;
            numerojugadores++;
            return true;
        }

        else { System.out.println("Numero maximo de jugadores alcanzados");
        return false;}
    }

    /** Este metodo devolvera el nick de los jugadores de la partida */
    public void mostrarjugadores (){

        for (Jugador1 i : jugadores ) {

            try {System.out.println(i.leenick());}
            catch (Exception e) { System.out.println("jugador eliminado");}
        

        }

    }
    
    /**Este metodo elimina el jugador introducido como parametro de la partida multijugador */
    public void eliminajugador (Jugador1 j) {

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].equals(j)) {
                jugadores [i] = null;
            }
            else {continue;}
        }


    }



}