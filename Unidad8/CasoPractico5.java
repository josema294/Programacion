public class CasoPractico5 {

    public static void main(String[] args) {
        
        FiguraGeometrica figura;

        figura = new Circulo (10);
        System.out.println("Area del circulo: " + figura.calculararea());
        figura = new Cuadrado (10);
        System.out.println("Area del cuadrado: " + figura.calculararea());
        System.out.println(figura.printMe());



    }
    
}
