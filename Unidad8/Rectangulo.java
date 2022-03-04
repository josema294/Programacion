public class Rectangulo extends FiguraGeometrica implements Printable{

    double base;
    double altura;

    Rectangulo (double base, double altura){

        this.altura = altura;
        this.base = base;

    }

    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculaPerimetro() {
        return (base*2)+(altura*2);
    }
    
    @Override
    public void printMe() {
        System.out.println("Rectangulo de base: " + base + " Y altura: " + altura);
    }
    
}
