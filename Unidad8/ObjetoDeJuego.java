public abstract class ObjetoDeJuego implements Colisionable {

    private int posX;
    private int posY;

    public  boolean puedeColisionar() {

        return true;
    }


    public void saltar (){
        System.out.println("Puede saltar");
    }


    public int getPosX() {
        return posX;
    }


    public void setPosX(int posX) {
        this.posX = posX;
    }


    public int getPosY() {
        return posY;
    }


    public void setPosY(int posY) {
        this.posY = posY;
    }



}