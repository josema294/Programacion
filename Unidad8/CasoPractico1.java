/**
 * Aplicacion
 */
public class CasoPractico1 {

    public static void main(String[] args) {

       Partidamultijugador1 mipartida = new Partidamultijugador1(4);
       Jugador1 pepe = new Jugador1("pepe", "lvl1");
       Jugador1 marco = new Jugador1("marco", "lvl2");
       Jugador1 trueno = new Jugador1("trueno", "lvl99");
       Jugador1 noob = new Jugador1("noob", "0");
       Jugador1 sinespacio = new Jugador1("sinespacio", "-10");

       mipartida.anyadirJugador(pepe);
       mipartida.anyadirJugador(marco);
       mipartida.anyadirJugador(trueno);
       mipartida.anyadirJugador(noob);
       mipartida.anyadirJugador(sinespacio);
       System.out.println("La partida tiene estos Jugador1es: ");
       mipartida.mostrarjugadores();

       System.out.println(noob.equals(noob)); System.out.println(noob.equals(trueno)); 

       //Comprobamos si el metodo eliminarJugador1 funciona
        System.out.println("Eleminamos el Jugador1 " + trueno.leenick());
       mipartida.eliminajugador(trueno);
       mipartida.mostrarjugadores();
       
       

    }

}