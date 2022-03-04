/**
 * Colisionable
 */
public interface Colisionable {

    public abstract boolean puedeColisionar();
    public boolean detectarColision(ObjetoDeJuego objeto);
}