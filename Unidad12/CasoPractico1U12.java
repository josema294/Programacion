package Unidad12;

import java.sql.Connection;
import java.sql.DriverManager;

public class CasoPractico1U12 {

    public static void main(String[] args) {

        String url = "";
        String user = "";
        String password = "";
        
        try {

            Connection con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
