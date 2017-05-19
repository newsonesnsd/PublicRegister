/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.view.Login;

/**
 *
 * @author newso
 */
public class enroll {
    static Connection con = ConnectionBuilder.getConnection();
    private static int enroll_id;
    private static int club_id;
    private static long std_id = Login.getStdId();
    private static Date create_at;
    private static Calendar update_at = Calendar.getInstance();
    
    public static void enrollClub() {
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM ...";
        } catch (SQLException ex) {
            System.out.println(ex + "/n" + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
}
