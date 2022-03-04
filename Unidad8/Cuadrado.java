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

    
    
    
}
