/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import publicregistergroup.controller.ConnectionBuilder;
import java.sql.*;
import java.util.*;

/**
 *
 * @author newso
 */
public class DetailHomePage {
    static Connection con = ConnectionBuilder.getConnection();
    private String search ;
    private int clubId;
    private String clubName;
    private String clubDescription;
    private String pic;

    public static Connection getCon() {
        return con;
    }

    public String getSearch() {
        return search;
    }

    public int getClubId() {
        try{
        Connection conn= ConnectionBuilder.getConnection();
        String sql = "select club_id from clubs";
        PreparedStatement pre = con.prepareStatement(sql);
        ResultSet rs = pre.executeQuery();
            while(rs.next()){
                return clubId;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return 0 ;
    }

    public String getClubName() {
        return clubName;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public String getPic() {
        return pic;
    }

    public static void setCon(Connection con) {
        DetailHomePage.con = con;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    
    
}
