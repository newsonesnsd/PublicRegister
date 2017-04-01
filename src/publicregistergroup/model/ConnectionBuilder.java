package publicregistergroup.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author INT303
 */
public class ConnectionBuilder {

    private static org.apache.derby.jdbc.ClientDataSource ds = null;
    public static Connection getConnection() {
        Connection con=null;
        try {
            String host="jdbc:derby://10.4.56.8/PublicRegis";
            String userName="regis-2";
            String userPass="regis";
            
            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://10.4.56.8:3306/PublicRegis", "public-1", "public");
            System.out.println("Driver loaded");
            
            
            con = DriverManager.getConnection(host,userName,userPass);
            System.out.println("Conncetion Created");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
        
   

    public static void main(String[] args) {
        Connection con = ConnectionBuilder.getConnection();
        
    }
}
