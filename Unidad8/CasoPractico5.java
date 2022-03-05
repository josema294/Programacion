public class CasoPractico5 {

    public static void main(String[] args) {

        FiguraGeometrica cuadrado1 = new Cuadrado(2);
        FiguraGeometrica cuadrado2 = new Cuadrado(4.2);
        FiguraGeometrica cuadrado3 = new Cuadrado(6);
        FiguraGeometrica circulo1 = new Circulo(2);
        FiguraGeometrica circulo2 = new Circulo(4.6);
        FiguraGeometrica circulo3 = new Circulo(5.11);
        FiguraGeometrica rectangulo1 = new Rectangulo(2, 3);
        FiguraGeometrica rectangulo2 = new Rectangulo(4.4, 4.8);
        FiguraGeometrica rectangulo3 = new Rectangulo(6.66, 7.98);


        Figuras vectorFiguras = new Figuras(9);

        vectorFiguras.add(cuadrado1);
        System.out.println(vectorFiguras.toString());
        vectorFiguras.remove(cuadrado1);
        System.out.println(vectorFiguras.toString());
        vectorFiguras.add(cuadrado1);
        vectorFiguras.add(cuadrado2);
        vectorFiguras.add(cuadrado3);
        vectorFiguras.add(circulo1);
        vectorFiguras.add(circulo1);
        vectorFiguras.add(circulo1);
        vectorFiguras.add(circulo1);
        vectorFiguras.add(circulo1);
        vectorFiguras.add(circulo1);

        vectorFiguras.remove(circulo1);
        System.out.println(vectorFiguras);

    }

}
