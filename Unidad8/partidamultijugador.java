package Unidad8;

/**
 * partidamultijugador
 */
public class partidamultijugador {

    private Jugador [] jugadores;
    private int numerojugadores;
    private int numerojugadoresmaximo;

    //Constructor
    public partidamultijugador( int numerojugadoresmaximo) {
        this.numerojugadores=0;
        this.numerojugadoresmaximo = numerojugadoresmaximo;
        this.jugadores = new Jugador [numerojugadoresmaximo];
        
    }

    //Método anyadirJugador
    public boolean anyadirJugador (Jugador j) {

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

        for (Jugador i : jugadores ) {

            try {System.out.println(i.leenick());}
            catch (Exception e) { System.out.println("jugador eliminado");}
        

        }

    }
    
    /**Este metodo elimina el jugador introducido como parametro de la partida multijugador */
    public void eliminajugador (Jugador j) {

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].equals(j)) {
                jugadores [i] = null;
            }
            else {continue;}
        }


    }



}