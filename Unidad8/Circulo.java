public class Circulo extends FiguraGeometrica implements Printable{

        double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calculaArea() {
            return Math.PI*radio*radio;
        }

        @Override
        public double calculaPerimetro() {
        return 2* Math.PI* radio;
    }

        @Override
        public void printMe() {
            System.out.println("Ciruclo de Radio: " + radio);
            
        }

        

        
    
}
