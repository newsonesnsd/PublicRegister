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

/**
 *
 * @author newso
 */
public class Clubs {
    static Connection con = ConnectionBuilder.getConnection();
    private int club_id;
    private String club_name;
    private String club_description;

    public int getClub_id(int clubIndex) {
        club_id = clubIndex+1;        
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, ""+clubIndex);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                club_id = rs.getInt("club_id");
                //System.out.println(clubId);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
        }
        return club_id;   
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public String getClub_name(int club_id) {
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
        }
        return club_name;      
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public String getClub_description() {
        return club_description;
    }

    public void setClub_description(String club_description) {
        this.club_description = club_description;
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
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return str;
    }
    
    public static void main(String[] args) {
        System.out.println(getAllClubs());
    }
}
