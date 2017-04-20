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
//        String sql = "SELECT * FROM user";
//        PreparedStatement pre = con.prepareStatement(sql);
//        ResultSet rs = pre.executeQuery();
//        
//        while(rs.next()){
//            System.out.println(rs.getString("username"));  
//        }
//        try {
//            Scanner input = new Scanner(System.in);
//            String stdUsername = input.next();
//            String stdPassword = input.next();
//            PreparedStatement pre;
//            String sql = "select username, password from user where username = ? and password = ?";
//            pre = con.prepareStatement(sql);
//            pre.setString(1, stdUsername);
//            pre.setString(2, stdPassword);
//            ResultSet rec = pre.executeQuery();
//            if (rec.next()) {
//                System.out.println("IF");
//            }
//            else {
//                System.out.println("False");
//            }
//         } 
//        catch (Exception e) {
//            System.out.println(e);
//        }
           
    }
}
