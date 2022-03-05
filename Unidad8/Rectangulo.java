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

    @Override
        public boolean equals (Object j) {

            if (this.getClass() == j.getClass() && this.base == ((Rectangulo)j).base && this.altura == ((Rectangulo)j).altura){
    
                return true;
            }
    
            else {return false;}
    
        }
    
}
