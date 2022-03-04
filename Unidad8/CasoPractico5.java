public class CasoPractico5 {

    public static void main(String[] args) {
        
        FiguraGeometrica figura [];

        figura = new FiguraGeometrica [9];

        figura[0] = new Circulo (2.8);
        figura[1] = new Cuadrado (3);
        figura[2] = new Circulo (7.1);
        figura[3] = new Rectangulo(2.3, 3.1);
        figura[4] = new Cuadrado (3);
        figura[5] = new Rectangulo(5.3, 1.1);
        figura[6] = new Circulo (10);
        figura[7] = new Circulo (4);
        figura[8] = new Rectangulo(3, 6.666);
        
        
        for (FiguraGeometrica i : figura) {

            System.out.println("El area es " + i.calculaArea() + " Y el perimetro es " + i.calculaPerimetro());
        }

        



    }
    
}
