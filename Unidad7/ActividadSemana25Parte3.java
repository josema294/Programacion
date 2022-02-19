import java.util.Scanner;

public class ActividadSemana25Parte3 {

    public static void main(String[] args) {

        // Variables para mostrar cuadrados de colores en las terminales unix
        String rojo = "\u001B[31m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u001B[0m";

        String amarillo = "\u001B[33m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u001B[0m";

        String verde = "\u001B[32m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u001B[0m";

        String azul = "\u001B[34m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n" +
                "\u001B[0m";

        // Instrucciones
        System.out.println("Instrucciones, el jugador 1 introducira 10 colores entre el \u001B[31mrojo, \u001B[32mverde, \u001B[33mamarillo \u001B[34m y azul");
        System.out.println("\u001B[0mSe pueden repetir. El jugador 2 debera haberlos memorizado e introducirlos en consola.");
        // creamos variables con los colores validos, asi si eljugador mete otros datos,
        // podemos comparar y parar el juego

        String colorcorrecto1 = "rojo";
        String colorcorrecto2 = "verde";
        String colorcorrecto3 = "amarillo";
        String colorcorrecto4 = "azul";
        String pos1 = "", pos2="",pos3= "", pos4="", pos5="", pos6="", pos7="", pos8="",pos9="",pos10="";
        
        // Introducimos colores, lo comparamos con si es un valor correcto y reasignamos a las variables de colores que hemos creado arriba.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Jugador 1 introduce la secuencia de colores: ");
        System.out.print("color 1: ");
        String color1 = entrada.next();
            if (color1.equalsIgnoreCase(colorcorrecto1)) {
                pos1 = rojo;
            }
            else if (color1.equalsIgnoreCase(colorcorrecto2)) {
                pos1 = verde;
            }
            else if (color1.equalsIgnoreCase(colorcorrecto3)) {
                pos1 = amarillo;
            }

            else if (color1.equalsIgnoreCase(colorcorrecto4)) {
                pos1 = azul;
            }

            else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 2: ");
        String color2 = entrada.next();
        if (color2.equalsIgnoreCase(colorcorrecto1)) {
            pos2 = rojo;
        }
        else if (color2.equalsIgnoreCase(colorcorrecto2)) {
            pos2 = verde;
        }
        else if (color2.equalsIgnoreCase(colorcorrecto3)) {
            pos2 = amarillo;
        }

        else if (color2.equalsIgnoreCase(colorcorrecto4)) {
            pos2 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 3: ");
        String color3 = entrada.next().toLowerCase();
        if (color3.equalsIgnoreCase(colorcorrecto1)){
            pos3 = rojo;
        }
        else if (color3.equalsIgnoreCase(colorcorrecto2)){
            pos3 = verde;
        }
        else if (color3.equalsIgnoreCase(colorcorrecto3)) {
            pos3 = amarillo;
        }

        else if (color3.equalsIgnoreCase(colorcorrecto4)) {
            pos3 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 4: ");
        String color4 = entrada.next().toLowerCase();
        if (color4.equalsIgnoreCase(colorcorrecto1)) {
            pos4 = rojo;
        }
        else if (color4.equalsIgnoreCase(colorcorrecto2)) {
            pos4 = verde;
        }
        else if (color4.equalsIgnoreCase(colorcorrecto3)) {
            pos4 = amarillo;
        }

        else if (color4.equalsIgnoreCase(colorcorrecto4)) {
            pos4 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 5: ");
        String color5 = entrada.next().toLowerCase();
        if (color5.equalsIgnoreCase(colorcorrecto1)) {
            pos5 = rojo;
        }
        else if (color5.equalsIgnoreCase(colorcorrecto2)) {
            pos5 = verde;
        }
        else if (color5.equalsIgnoreCase(colorcorrecto3)) {
            pos5 = amarillo;
        }

        else if (color5.equalsIgnoreCase(colorcorrecto4) ){
            pos5 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 6: ");
        String color6 = entrada.next().toLowerCase();
        if (color6.equalsIgnoreCase(colorcorrecto1) ){
            pos6 = rojo;
        }
        else if (color6.equalsIgnoreCase(colorcorrecto2) ){
            pos6 = verde;
        }
        else if (color6.equalsIgnoreCase(colorcorrecto3)) {
            pos6 = amarillo;
        }

        else if (color6.equalsIgnoreCase(colorcorrecto4)){
            pos6 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 7: ");
        String color7 = entrada.next().toLowerCase();
        if (color7.equalsIgnoreCase(colorcorrecto1)) {
            pos7 = rojo;
        }
        else if (color7.equalsIgnoreCase(colorcorrecto2)) {
            pos7 = verde;
        }
        else if (color7.equalsIgnoreCase(colorcorrecto3) ){
            pos7 = amarillo;
        }

        else if (color7.equalsIgnoreCase(colorcorrecto4)) {
            pos7 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 8: ");
        String color8 = entrada.next().toLowerCase();
        if (color8.equalsIgnoreCase(colorcorrecto1)) {
            pos8 = rojo;
        }
        else if (color8.equalsIgnoreCase(colorcorrecto2)) {
            pos8 = verde;
        }
        else if (color8.equalsIgnoreCase(colorcorrecto3)) {
            pos8 = amarillo;
        }

        else if (color8.equalsIgnoreCase(colorcorrecto4) ){
            pos8 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 9: ");
        String color9 = entrada.next().toLowerCase();
        if (color9.equalsIgnoreCase(colorcorrecto1)) {
            color9 = rojo;
        }
        else if (color9.equalsIgnoreCase(colorcorrecto2) ){
            pos9 = verde;
        }
        else if (color9.equalsIgnoreCase(colorcorrecto3)) {
            pos9 = amarillo;
        }

        else if (color9.equalsIgnoreCase(colorcorrecto4) ){
            pos9 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}
        System.out.print("color 10: ");
        String color10 = entrada.next().toLowerCase();
        if (color10.equalsIgnoreCase(colorcorrecto1) ){
            pos10 = rojo;
        }
        else if (color10.equalsIgnoreCase(colorcorrecto2)) {
            pos10 = verde;
        }
        else if (color10.equalsIgnoreCase(colorcorrecto3) ){
            pos10 = amarillo;
        }

        else if (color10.equalsIgnoreCase(colorcorrecto4)) {
            pos10 = azul;
        }

        else { System.out.println("Has metido un valor no valido, el juego no funcionara correctamente, recomendamos reejecutar.");}

        //Segunda parte para el segundo jugador:
        System.out.print("El jugador 1 ha metido la siguiente secuencia de colores: \n" + pos1 + pos2+ pos3+ pos4+ pos5+ pos6+ pos7+ pos8+ pos9+ pos10);

        System.out.println("Jugador 2 Memoriza y preparate para jugar, cuando estes listo introduce en terminalalgun caracter y pulsa intro");
        
        String pantalla = entrada.next();
        if (pantalla != null) {
            System.out.print("\033[H\033[2J");
        }


        System.out.println("Devuelve los colores en orden inverso");
        
        
       //Creamos un contador de putos y pedimos las respuestas

       int cont = 0;
       String res1 = entrada.nextLine();
        res1 = entrada.nextLine();
       if (res1.equals(color10)){
           cont++;
           System.out.println("Correcto!! era: \n" + pos10 + "\n Tu contador es: " + cont);
       }

       else { System.out.println("Error!! era: \n" + pos10 + "\n Tu contador es: " + cont);}
       String res2 = entrada.nextLine();
       if (res2.equals(color9)){    
        cont++;
        System.out.println("Correcto!! era \n" + pos9 + "Tu contador es: " + cont);
        }
        else {System.out.println("Error!! era \n" + pos9 + "Tu contador es: " + cont);}
    String res3 = entrada.nextLine();
    if (res3.equals(color8)){
        cont++;
        System.out.println("Correcto!! era \n" + pos8 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos8 + "Tu contador es: " + cont);}
    String res4 = entrada.nextLine();
    if (res4.equals(color7)){
        cont++;
        System.out.println("Correcto!! era \n" + pos7 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos7 + "Tu contador es: " + cont);}
    String res5 = entrada.nextLine();
    if (res5.equals(color6)){
        cont++;
        System.out.println("Correcto!! era \n" + pos6 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos6 + "Tu contador es: " + cont);}
    String res6 = entrada.nextLine();
    if (res6.equals(color5)){
        cont++;
        System.out.println("Correcto!! era \n" + pos5 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos5 + "Tu contador es: " + cont);}
    String res7 = entrada.nextLine();
    if (res7.equals(color4)){
        cont++;
        System.out.println("Correcto!! era \n" + pos4 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos4 + "Tu contador es: " + cont);}
    String res8 = entrada.nextLine();
    if (res8.equals(color3)){
        cont++;
        System.out.println("correcto era \n" + pos3 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos3 + "Tu contador es: " + cont);}
    String res9 = entrada.nextLine();
    if (res9.equals(color2)){
        cont++;
        System.out.println("corrrecto era\n" + pos2 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era\n" + pos2 + "Tu contador es: " + cont);}
    String res10 = entrada.nextLine();
    if (res10.equals(color1)){
        cont++;
        System.out.println("Correcto!! era \n" + pos1 + "Tu contador es: " + cont);
    }
    else {System.out.println("Error!! era \n" + pos1 + "Tu contador es: " + cont);}
    
    System.out.println("Enhorabuena, tu puntuacion total ha sido : " + cont);
    

    }

}
