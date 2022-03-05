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


        @Override
        public boolean equals (Object j) {

            if (this.getClass() == j.getClass() && this.radio == ((Circulo)j).radio){
    
                return true;
            }
    
            else {return false;}
    
        }

        @Override
        public String toString() {
            return "Circulo de radio: " + radio ;
        }

        

        
    
}
