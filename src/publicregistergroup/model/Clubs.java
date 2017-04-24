/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public int getClub_id() {
        return club_id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public String getClub_name() {
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
    
    public static String getAllClubs() throws SQLException {
        String allClub;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM clubs";
            ResultSet res = st.executeQuery(sql);
            if(res.next()) {
                System.out.println("");
            }
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        return null;
    }
}
