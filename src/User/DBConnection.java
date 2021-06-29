package User;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dinet
 */
public class DBConnection {

    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //con=(Connection) DriverManager.getConnection("jdbc:mysql:coop","root","");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dnet", "root", "");
        } catch (Exception ex) {
            System.out.println("error");
        }
        return con;

    }
}
