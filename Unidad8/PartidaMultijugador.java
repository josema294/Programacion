public final class PartidaMultijugador extends Partida {
    private Jugador[] jugadores;
    private int numeroJugadores;
    private int numeroJugadoresMax;

    PartidaMultijugador(int id, int numeroJugadoresMax) {
        super(id);
        // Inicialización de valores
        this.numeroJugadores = 0;
        this.numeroJugadoresMax = numeroJugadoresMax;
        this.jugadores = new Jugador[numeroJugadoresMax];
    }

    public boolean anyadirJugador(Jugador j) {
        // Mantenemos esta condición para evitarnos
        // recorrer todo el vector si ya está lleno
        if (numeroJugadores < numeroJugadoresMax) {
            for (int i = 0; i < numeroJugadoresMax; i++) {
                if (jugadores[i] == null) {
                    jugadores[i] = j;
                    numeroJugadores++;
                    // Una vez añadido,
                    // salimos del método
                    return true;
                }
            }
        } else {
            System.out.println(
                    "No se pudo añadir " + j.getNick() + ", la partida está completa.");
            return false;
        }
        return false;
    }
}
