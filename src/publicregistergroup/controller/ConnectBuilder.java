package publicregistergroup.controller;
import java.sql.*;

public class ConnectBuilder {
    public void getConnection(){
        String db_name = "publicRegis";
        String user = "public-2";
        String pass = "public";
        String hostName = "10.4.56.8:3306";
        String driverName = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driverName);
            String url = "jdbc:mysql://"+hostName+"/"+db_name;
            Connection con = DriverManager.getConnection(url, user, pass);
            //System.out.println("ConnectComplete");
        }
        catch (Exception e){
            System.out.println(e);
        }  
    }
    public static void main(String[] args){
          new ConnectBuilder().getConnection();
    }
}
