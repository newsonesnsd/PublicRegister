package publicregistergroup.controller;
import java.sql.*;
import java.util.*;
import java.io.*;
public class ConnectionBuilder {
    public static Connection getConnection(){
        Connection con = null;
        String db_name = "publicRegis";
        String user = "public-2";
        String pass = "public";
        String hostName = "10.4.56.8:3306";
        String driverName = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driverName);
            //System.out.println("driver load");
            String url = "jdbc:mysql://"+hostName+"/"+db_name;
            con = DriverManager.getConnection(url, user, pass);
            //System.out.println("ConnectCreate");
        }
        catch (Exception e){
            System.out.println(e);
        }  
        
        return con;
    }
     public static void main(String[] args)throws SQLException{
        Connection con = ConnectionBuilder.getConnection();
        String sql = "SELECT * FROM user";
        PreparedStatement pre = con.prepareStatement(sql);
        ResultSet rs = pre.executeQuery();
        
        while(rs.next()){
            System.out.println(rs.getString("username"));  
        }
        
    }
}
