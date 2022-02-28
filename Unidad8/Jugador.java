package Unidad8;

/**
 *  Clase Jugador, instancia que representa jugadores con un nombre y un nivel para la partida multijugador
 */

public class Jugador {
    private String nick;
    private String nivel;

    public Jugador(String nick, String nivel) {
        this.nick = nick;
        this.nivel = nivel;
    }

    public String leenick() {
        return nick;
    }

    public String leenivel() {
        return nivel;
    }
    /**Devuelve true si el jugador pasado como parametro es igual al ejemplar de clase referenciado */
    public boolean equals (Jugador j) {

        if (this == j) {
            return true;
        }

        else {return false;}
    }


}
