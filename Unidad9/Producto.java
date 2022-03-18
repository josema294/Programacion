package Unidad9;

public class Producto {

    private int codigo;
    
    private String nombre;
    
    private String tipo;
    
    private double precio;
    
    private int existencias; 
    
    
    
    public Producto( int cod, String nom, String tp, double pvp, int stock)
    
    {
    
    codigo=cod;
    
    nombre=nom;
    
    tipo=tp;
    
    precio=pvp;
    
    existencias=stock; 
    
    }
    
         //-------------------------------------------
    
    public int verCodigo()
    
    {
    
    return codigo;
    
    }
    
    
    
    public String verNombre()
    
    {
    
    return nombre;
    
    }
    
    public String verTipo()
    
    {
    
    return tipo;
    
    }
    
    public double verPrecio()
    
    {
    
    return precio;
    
    }
    
    public int verExistencias()
    
    {
    
    return existencias;
    
    }
    
    //---------------------------------------
    
    public void modificarCodigo(int cod)
    
    {
    
    codigo=cod;
    
    }
    
     
    
    public void modificarNombre(String nom)
    
    {
    
    nombre=nom;
    
    }
    
    public void modificarTipo(String tp)
    
    {
    
    tipo=tp;
    
    }
    
    public void modificarPrecio(double pvp)
    
    {
    
    precio=pvp;
    
    }
    
    public void modificarExistencias(int stock)
    
    {
    
    existencias=stock;
    
    }
    
    }
    
   