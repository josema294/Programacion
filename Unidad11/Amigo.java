package Unidad11;

import java.io.Serializable;
import java.time.LocalDate;

public class Amigo implements Serializable {

    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private transient int edad;
    
    public Amigo() {
    }

    public Amigo(String nombre, String apellido, LocalDate fecha, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Amigo [apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + "]";
    }
    
}
