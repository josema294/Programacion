
public final class CasoPractico3 {
    public static void main(String[] args) {
        // Creación de los jugadores
        Jugador j1 = new Jugador("jugador1", "principiante");
        Jugador j2 = new Jugador("jugador2", "principiante");
        Jugador j3 = new Jugador("jugador3", "intermedio");
        Jugador j4 = new Jugador("jugador4", "experto");
        // Creación de partidas
        // Partida p1;
        Partida p1;
        p1 = new PartidaSimple(0);
        // Partida p2;
        Partida p2;
        p2 = new PartidaDobles(1);
        // Partida p3;
        Partida p3;
        p3 = new PartidaMultijugador(2, 3);

        /*
         * Al sustituir los datos que nos piden el programa va a seguir funcionando igualmente, cuando instanciamos los objetos de las clases
         * Partidasimple, Partidadobles o Partidamultijugador.
         * 
         * Esto se debe a que estamos llamando al constructor de esas clases hijas (por lo que el objeto que se crea se puede considerar de dichas clases)
         * Si intentasemos crear un objeto instanciando directamente el constructor de la clase Partida nos daria un error, porque es una clase abstracta y estas
         * clases no se pueden instanciar. Pero al mismo tiempo como las clases hijas al ser herencia de la clase Partida, estas comparten sus caracteristicas
         * y pueden definirse con el nombre de la clase original. Esto se conoce como polimorfismo, ya que permite a un objeto hijo tener la forma de su clase
         * madre, si lo intentaramos con otra clase que no este relacionada por herencia no funcionaria.
         * 
         * Puede ser muy util en situaciones como por ejemplo, implementacion de codigo en el que todavia no tenemos claro la clase exacta que eligiremos para nuestros
         * objetos, pudiendo dejarlos denominados por la clase madre y desarrollar sin problemas, y posteriormente cuando sepamos cual es la clase hija que mejor se 
         * ajusta a lo que queremos las cambiamos.
         */
        
        p1.anyadirJugador(j1);
        p1.anyadirJugador(j2);
        p2.anyadirJugador(j1);
        p2.anyadirJugador(j2);
        p2.anyadirJugador(j3);
        p3.anyadirJugador(j1);
        p3.anyadirJugador(j2);
        p3.anyadirJugador(j3);
        p3.anyadirJugador(j4);
    }
}