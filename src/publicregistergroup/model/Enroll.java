/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Date;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.view.Login;
import publicregistergroup.view.ViewRegist;

/**
 *
 * @author newso
 */
public class Enroll {
    static Connection con = ConnectionBuilder.getConnection();
    private static int enroll_id;
    private static int club_id = ViewRegist.getClub_id();
    private static long std_id = Login.getStdId();
    private static Timestamp create_at;
    private static Timestamp update_at;
    private static int countId = getCountId();
    
    private static int getCountId() {
        try {
            Statement st = con.createStatement();
            String sql = "SELECT COUNT(*) FROM enroll";
            ResultSet res = st.executeQuery(sql);
            if (res.next()) {
                countId = res.getInt("COUNT(*)");
            }
        } 
        catch (SQLException ex) {
            System.out.println(ex + "\n" + ex.getMessage());
            ex.printStackTrace();
        }
        return countId+1;
    }
    
    private static boolean isEnroll() {
        boolean status = false;
        try {
            String sql = "SELECT create_at FROM enroll WHERE enroll_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            if (res.next()) {
                status = true;
            }
        } 
        catch (SQLException ex) {
            System.out.println(ex + "\n" + ex.getMessage());
            ex.printStackTrace();
        }
        return status;
    }
    
    public static void enrollClub() {
        create_at = new Timestamp(System.currentTimeMillis());
        update_at = new Timestamp(System.currentTimeMillis());
        if (isEnroll()) {
            try {
                String sql = "INSERT INTO enroll (enroll_id, club_id, std_id, create_at) VALUES (?, ?, ?, ?);";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, getCountId());
                pre.setInt(2, club_id);
                pre.setLong(3, std_id);
                pre.setTimestamp(4, create_at);
                pre.executeUpdate();

            } 
            catch (SQLException ex) {
                System.out.println(ex + "/n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        else {
            try {
                String sql = "INSERT INTO enroll (enroll_id, club_id, std_id, update_at) VALUES (?, ?, ?, ?);";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, getCountId());
                pre.setInt(2, club_id);
                pre.setLong(3, std_id);
                pre.setTimestamp(4, update_at);
                pre.executeUpdate();

            } 
            catch (SQLException ex) {
                System.out.println(ex + "/n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
               
    }
    
    public static void main(String[] args) {
        enrollClub();
    }
    
    
}
