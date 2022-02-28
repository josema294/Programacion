package Unidad8;

/**
 * Aplicacion
 */
public class CasoPractico1 {

    public static void main(String[] args) {

       partidamultijugador mipartida = new partidamultijugador(4);
       Jugador pepe = new Jugador("pepe", "lvl1");
       Jugador marco = new Jugador("marco", "lvl2");
       Jugador trueno = new Jugador("trueno", "lvl99");
       Jugador noob = new Jugador("noob", "0");
       Jugador sinespacio = new Jugador("sinespacio", "-10");

       mipartida.anyadirJugador(pepe);
       mipartida.anyadirJugador(marco);
       mipartida.anyadirJugador(trueno);
       mipartida.anyadirJugador(noob);
       mipartida.anyadirJugador(sinespacio);
       System.out.println("La partida tiene estos jugadores: ");
       mipartida.mostrarjugadores();

       System.out.println(noob.equals(noob)); System.out.println(noob.equals(trueno)); 

       //Comprobamos si el metodo eliminarJugador funciona
        System.out.println("Eleminamos el jugador " + trueno.leenick());
       mipartida.eliminajugador(trueno);
       mipartida.mostrarjugadores();
       
       

    }

}