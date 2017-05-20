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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.view.Login;

/**
 *
 * @author newso
 */
public class Enroll {
    static Connection con = ConnectionBuilder.getConnection();
    private static int enroll_id;
    private static int club_id = 48;
    private static long std_id = 59130500004L;//Login.getStdId();
    private static Date create_at;
    private static Calendar update_at = Calendar.getInstance();
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
    
    public static void enrollClub() {
        try {
            String sql = "INSERT INTO enroll (enroll_id, club_id, std_id, create_at, update_at) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, getCountId());
            pre.setInt(2, club_id);
            pre.setLong(3, std_id);
            pre.setDate(4, new java.sql.Date(new Date().getTime()));
            pre.setDate(5, new java.sql.Date(new Date().getTime()));
            pre.executeUpdate();
            
        } 
        catch (SQLException ex) {
            System.out.println(ex + "/n" + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        enrollClub();
    }
}
