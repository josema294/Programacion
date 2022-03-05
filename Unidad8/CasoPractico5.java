public class CasoPractico5 {

    public static void main(String[] args) {

        //Creamos figuras geometricas para probar 

        FiguraGeometrica cuadrado1 = new Cuadrado(2);
        FiguraGeometrica cuadrado2 = new Cuadrado(4.2);
        FiguraGeometrica cuadrado3 = new Cuadrado(6);
        FiguraGeometrica circulo1 = new Circulo(2);
        FiguraGeometrica circulo2 = new Circulo(4.6);
        FiguraGeometrica circulo3 = new Circulo(5.11);
        FiguraGeometrica rectangulo1 = new Rectangulo(2, 3);
        FiguraGeometrica rectangulo2 = new Rectangulo(4.4, 4.8);
        FiguraGeometrica rectangulo3 = new Rectangulo(6.66, 7.98);
        FiguraGeometrica rectangulo99 = new Rectangulo(99,99);


        Figuras vectorFiguras = new Figuras(9);

        System.out.println(vectorFiguras.toString()); //Aqui el vector de 9 posicioens todavia esta vacio, asi lo muestra si imprimimos.
        vectorFiguras.add(cuadrado1);
        vectorFiguras.add(cuadrado2);
        vectorFiguras.add(cuadrado3);
        vectorFiguras.add(circulo1);
        vectorFiguras.add(circulo2);
        vectorFiguras.add(circulo3);
        vectorFiguras.add(rectangulo1);
        vectorFiguras.add(rectangulo2);
        vectorFiguras.add(rectangulo3);
        vectorFiguras.add(cuadrado1); //Estafigura no se agrega al vector puesto que ya no hay espacio
        
        System.out.println(vectorFiguras.toString());

        //Probamos que quita correctamente los objetos indicados
        vectorFiguras.remove(cuadrado1);
        vectorFiguras.remove(circulo1);
        vectorFiguras.remove(rectangulo1);
        vectorFiguras.remove(rectangulo99); // Este objeto no esta en el vector, dara error al no encontrarlo.

        System.out.println(vectorFiguras.toString()); // Imprimimos el objeto final
        

    }

}
