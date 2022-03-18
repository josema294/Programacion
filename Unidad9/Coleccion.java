package Unidad9;

import java.util.ArrayList;

public class Coleccion {



private ArrayList<Producto> lista = new ArrayList< Producto >();



    public int tamaño(){

                

        return lista.size();

    }

    public void adicionar(Producto e){



        lista.add(e);

    }

    public void eliminar(int pos){

    

        lista.remove(pos);

    }

    public Producto obtener(int pos){



        return lista.get(pos);

    }

    public Producto buscar(int cod){

        Producto encontrar = null;

        for (int i = 0; i < lista.size(); i++) {
            
            
            if ((lista.get(i)).verCodigo() == cod){
               encontrar = lista.get(i); 
               return encontrar;
            }

            
        }
        
           return encontrar;

    }  

public void mostrarTodo(){

    for (Producto p : lista) {

        System.out.println("El producto " + p + " tiene codigo " + p.verCodigo() + " nombre " + p.verNombre() + " tipo " + p.verTipo() + " precio " 
        + p.verPrecio() + " y existecias " + p.verExistencias());
    }

}

public void aumentoPrecio(){

    for (Producto p : lista) {

        double precio = p.verPrecio()*1.1;

        p.modificarPrecio(precio);
        
    

        }

    }
}
