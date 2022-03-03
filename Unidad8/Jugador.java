public final class Jugador {
    private String nick;
    private String nivel;

    Jugador(String nick, String nivel) {
        this.nick = nick;
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNick() {
        return nick;
    }
}