/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import publicregistergroup.controller.ConnectionBuilder;
//import publicregistergroup.view.ViewClub;

/**
 *
 * @author newso
 */
public class Clubs {
    static Connection con = ConnectionBuilder.getConnection();
    private static int club_id;
    private static String club_name;
    private static String club_description;
    private static String club_picture;
    private static String club_pict;
    private static String club_desc;
    private static String club_editname;

    public static int getClub_id(int clubIndex) {
        club_id = clubIndex;        
        try {
            String sql = "SELECT club_id FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, clubIndex);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_id = rs.getInt("club_id");
                //System.out.println(clubId);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_id;   
    }
    
    public static String getClub_name(int club_id) {
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, club_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_name = rs.getString("club_name");
                //System.out.println(clubName);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_name;      
    } 
    public static String getClub_pic(int club_id) {       
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, club_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_picture = rs.getString("club_picture");
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_picture;  
    }
 

    
    public static String getClub_description(int club_id) {       
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, club_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_name = rs.getString("club_description");
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_name;  
    }
    /*public static String getClub_descriptionUpload(int std_id) {       
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, club_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_desc = rs.getString("club_description");
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_desc;  
    }*/
     public static String getClub_descriptionUpload(long std_id) {       
      try {
            String sql = "SELECT std_role FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
//            System.out.println(res);
            int club_id =0;
            String std_role=null;
//            System.out.println(std_role);
            while (res.next()) {
                std_role = res.getString("std_role");        //                System.out.println(std_role);
                club_id = Integer.parseInt(std_role);       //                System.out.println(club_id);
                sql = "SELECT club_description FROM clubs WHERE club_id = ?";
                PreparedStatement pre2 = con.prepareStatement(sql);
                pre2.setInt(1, club_id);
                ResultSet rs = pre2.executeQuery();
//                System.out.println("133");
                if(rs.next()) {
//                    System.out.println("135");
                    club_desc =rs.getString("club_description");
                }

                if(std_role!=null){
                }
            }
      }
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_desc;
     }
    
    /*public static String getClub_picture(int club_id) {       
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, club_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_pict = rs.getString("club_picture");
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_pict;  
    }*/
     public static String getClub_picture(long std_id) {   
        try {
            String sql = "SELECT std_role FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_picture FROM clubs WHERE club_id = ?";
                PreparedStatement pre2 = con.prepareStatement(sql);
                pre2.setInt(1, club_id);
                ResultSet rs = pre2.executeQuery();
                if(rs.next()) {
                    club_pict =rs.getString("club_picture");
                }

                if(std_role!=null){
                   
                }
            }
        }
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_pict;
     }
    
     public static String getClub_nameEdit(long std_id) {   
        try {
            String sql = "SELECT std_role FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_picture FROM clubs WHERE club_id = ?";
                PreparedStatement pre2 = con.prepareStatement(sql);
                pre2.setInt(1, club_id);
                ResultSet rs = pre2.executeQuery();
                if(rs.next()) {
                    club_editname =rs.getString("club_picture");
                }

                if(std_role!=null){
                   
                }
            }
        }
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return club_editname;
     }


    
      
 
    public static ArrayList<String> getAllClubs() {
        ArrayList<String> str = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM clubs order by club_id ASC";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                //System.out.println("Club ID: " + res.getInt("club_id") + " Club Name: " + res.getString("club_name"));
                str.add(res.getString("club_name"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return str;
    }
    
    public static void main(String[] args) {
        System.out.println(getAllClubs());
    }
}
