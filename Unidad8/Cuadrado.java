public class Cuadrado extends FiguraGeometrica implements Printable{

    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculararea() {
        // TODO Auto-generated method stub
        return lado*lado;
    }

    @Override
    public void printMe() {
        
        System.out.println("Cuadrado de Radio: " + lado);
            
    }
    
    
}
