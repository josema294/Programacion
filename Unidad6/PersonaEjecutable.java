

import java.util.Scanner;

public class PersonaEjecutable {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = entrada.next();
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        
        System.out.println("Introduce tu sexo H o M ");
        String sexoentrada = entrada.next();
        char sexo = sexoentrada.charAt(0);
        System.out.println("Introduce tu peso en kg");
        double peso = entrada.nextDouble();
        System.out.println("Introduce tu altura en mts");
        double altura = entrada.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Manolito");
        persona3.setEdad(32);
        persona3.setSexo('H');
        persona3.setPeso(76.5);
        persona3.setAltura(1.75);

        
        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona3.esMayorDeEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());






        
    }
    
}
