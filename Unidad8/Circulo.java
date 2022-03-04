public class Circulo extends FiguraGeometrica implements Printable{

        double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calculararea() {
            return Math.PI*radio*radio;
        }

        @Override
        public void printMe() {
            System.out.println("Ciruclo de Radio: " + radio);
            
        }

        

        
    
}
