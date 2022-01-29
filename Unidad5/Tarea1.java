import java.util.Scanner;

public class Tarea1{

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String user = askuser();
        String pass = askpass();

        boolean resultado = chekcredenciales(user, pass);

        System.out.println(result(resultado)); 





        
        
    }

      static String askuser (){

        
        System.out.println("Introduce tu usuario");
        String user = in.nextLine();
        return user;

    }

    static String askpass(){
        
        System.out.println("Introduce tu password");
        String pass = in.nextLine();
        return pass;
    }

     static boolean chekcredenciales (String user,String pass){

        String trueuser = "Usuario1";
        String truepass = "abcd";

        return (trueuser.equals(user) && truepass.equals(pass)? true:false);

    }

    static String result (boolean resultado){

        if (resultado == true) {
            return "Credenciales correctas, bienvenido a tu cuenta de usuario";
        }
        else {
            return "Credenciales incorrectas, acceso denegado";
        }

    }


}


