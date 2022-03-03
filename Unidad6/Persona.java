public class Persona {

    //Declaracion de atributos

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private final char sexodefecto = 'H';

    public Persona (){ //constructor por defecto. 
        
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = sexodefecto;
        this.peso = 0;
        this.altura = 0;
        
    }

    //Creacion de los otros 2 constructores que nos piden.

    public Persona (String nombre, int edad, char sexo){
        
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona (String nombre, int edad, char sexo, double peso, double altura ) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Implementando metodos 

    public int calcularIMC() {

        double IMC =  (peso/(altura*altura));
        final int bajoimc = -1;
        final int normalimc = 0;
        final int altoimc = 1;

        if (IMC<20){
            return bajoimc;
        }

        else if (IMC>=20 && IMC<=25) {
            return normalimc;
        }

        else {
            return altoimc;
        }

    }
    
    public boolean esMayorDeEdad() {
            
        final int mayoriaDeEdad = 18;
        if (edad >= mayoriaDeEdad){
            return true;
        }

        else {return false;}
        
    }

    private void comprobarSexo(char sexo) {

        if (this.sexo != sexo){
            this.sexo=sexodefecto;
             
        }
    }

    public String toString() {
        return "Persona [DNI=" + DNI + ", altura=" + altura + ", edad=" + edad + ", nombre=" + nombre + ", peso=" + peso
                + ", sexo=" + sexo + "]";
    }

     private String generaDNI(){
        
        int aleatoriodni = (int) (Math.random()*99999999);

        int resto = aleatoriodni %23;
        char list [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',

        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        char letra = list[resto];

        String falsodni = String.valueOf(aleatoriodni) + letra;

        return falsodni;

    }

   public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
