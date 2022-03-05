public class Cuadrado extends FiguraGeometrica implements Printable{

    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        // TODO Auto-generated method stub
        return lado*lado;
    }

    @Override
    public double calculaPerimetro() {
        return lado*4;
    }

    @Override
    public void printMe() {
        
        System.out.println("Cuadrado de lado: " + lado);
            
    }

    @Override
    public boolean equals (Object j) {

        if (this.getClass() == j.getClass() && this.lado == ((Cuadrado)j).lado){

            return true;
        }

        else {return false;}

    }

    @Override
    public String toString() {
        return "Cuadrado de: " + lado + "*" + lado;
    }

    
    
    
}
