/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;


import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        countId++;
        return countId;
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
        if (!isEnroll()) {
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
    
    /*
    * List All Student Enrolled Club
    */
    public static String getClubRegister(){
        ArrayList<String> regis = new ArrayList<>();
        try {
            String sql = "SELECT s.std_id, s.std_name , s.std_faculty , s.std_department , s.std_email , s.std_tel "
                    + "FROM enroll e JOIN students s on e.std_id = s.std_id "
                    + "WHERE e.club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, club_id);
            ResultSet res = pre.executeQuery();
            while(res.next()) {
                regis.add("Student ID: " + res.getLong("s.std_id") + "\n"
                            + "Student Name: "+res.getString("std_name") + "\n"
                            + "Student Faculty: " + res.getString("std_faculty") + "\n"  
                            + "Student Department: " + res.getString("std_department") + "\n"
                            + "Student Email: " + res.getString("std_email") + "\n"
                            + "Student Telephone: " + res.getString("std_tel") + "\n"
                            + "---------------------------------" + "\n"); 
            }
            
            
        } 
        catch (SQLException ex) {
            System.out.println(ex + "\n" + ex.getMessage() + "\n" + ex.getSQLState()); 
            ex.printStackTrace();
        }
        String clubRegis = regis.toString();
        clubRegis = clubRegis.replaceAll(", ", "").replace("[", "").replace("]", "").trim();
        return clubRegis;
    }
    
    /**
     * Export All Student enrolled club
     */
    public static void getFileClubRegister() {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("ClubRegistered.txt"));
            dos.writeUTF(getClubRegister());
            JOptionPane alertFinishExportFile = new JOptionPane();
            JOptionPane.showMessageDialog(alertFinishExportFile, "Export Complete");
            dos.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } 
        
        
    }
    
    public static void getStudentEnroll() {
        try {
            String sql = "SELECT c.club_name "
                    + "FROM clubs c JOIN enroll e on c.club_id = e.club_id "
                    + "WHERE e.std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            while(res.next()) {
//                System.out.println(res.getLong("c.club_id"));
                System.out.println(res.getString("c.club_name"));
//                System.out.println(res.getString("c.club_dessciption"));
            } 
        } 
        catch (SQLException ex) {
            System.out.println(ex + "\n" + ex.getMessage() + "\n" + ex.getSQLState()); 
            ex.printStackTrace();
        }   
    }
    
    public static ArrayList<String> getAllStudentsEnroll() {
        ArrayList<String> str = new ArrayList<>();
        try {
            String sql = "SELECT c.club_name "
                    + "FROM clubs c JOIN enroll e on c.club_id = e.club_id "
                    + "WHERE e.std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            while(res.next()) {
//                System.out.println(res.getLong("c.club_id"));
                str.add(res.getString("c.club_name"));
//                System.out.println(res.getString("c.club_dessciption"));
            } 
        } 
        catch (SQLException ex) {
            System.out.println(ex + "\n" + ex.getMessage() + "\n" + ex.getSQLState()); 
            ex.printStackTrace();
        }   
        return str;
    }
    
    public static void main(String[] args) {
        getClubRegister();
    }
    
    
    
}
