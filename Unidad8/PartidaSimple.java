public final class PartidaSimple extends Partida {
    private Jugador jugador;

    PartidaSimple(int id) {
        super(id);
    }

    protected boolean anyadirJugador(Jugador j) {
        if (this.jugador == null) {
            this.jugador = j;
            return true;
        } else {
            System.out.println("Error: La partida ya tiene un jugador");
            return false;
        }
    }
}