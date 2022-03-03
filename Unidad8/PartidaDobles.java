public final class PartidaDobles extends Partida {
    private Jugador jugador1;
    private Jugador jugador2;

    PartidaDobles(int id) {
        super(id);
    }

    protected boolean anyadirJugador(Jugador j) {
        if (this.jugador1 == null)
            this.jugador1 = j;
        else if (this.jugador2 == null)
            this.jugador2 = j;
        else {
            System.out.println("Error: La partida ya tiene dos jugadores");
            return false;
        }
        return true;
    }
}