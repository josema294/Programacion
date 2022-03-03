//Tarea 1 ejercicio 6

public class Cuenta {

    private String titular;
    private double cantidad;

    //Creo el metodo constructor, con sobrecarga para que el mismo nombre tenga las dos opciones que nos piden.
    public Cuenta (String titular) {

        this.titular = titular;
        
    }

    public Cuenta (String titular, double cantidad){
        
        this.cantidad = cantidad;
        this.titular = titular;
    }

    //A continuacion metodos get set y toString 
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   public String toString() {
        return "Cuenta [el titular es: " + titular + " La cantidad depositada es: " +  cantidad + "]";
    }

    //Por ultimo los metodos para operar con la cuenta, retirar e ingresar.
    public double ingresar (double ingreso){

        if (ingreso>=0){
            this.cantidad = this.cantidad + ingreso;
        }
        
        return this.cantidad;
    }
    
    public double retirar (double retirada){

        if ((this.cantidad - retirada) >= 0) {
            this.cantidad= this.cantidad - retirada;
        }

        else  {
            this.cantidad = 0;
        }   
        
        return this.cantidad;
    }
}
