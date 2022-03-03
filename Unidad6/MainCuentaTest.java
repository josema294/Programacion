public class MainCuentaTest {

    public static void main(String[] args) {
        
        //instanciamos objeto y comprobamos que getCantidad y Get titular nos lo devuelven bien.
        Cuenta cuentajose = new Cuenta ("Jose", 2347.34);
        System.out.println(cuentajose);
        System.out.println(cuentajose.getCantidad());
        System.out.println(cuentajose.getTitular());
        
        //Probamos setter cambiando datos
        cuentajose.setTitular("Jose Maria");
        cuentajose.setCantidad(3234.67);
        System.out.println(cuentajose);
        
        //Operamos con los metodos retirar e ingrear y comprobamos que los outputs sean correctos.
        cuentajose.retirar(5000);
        System.out.println(cuentajose);
        cuentajose.ingresar(3000);
        System.out.println(cuentajose);
        cuentajose.retirar(500);
        System.out.println(cuentajose);
        cuentajose.ingresar(-10);
        System.out.println(cuentajose);
        


        

    }
    
}
