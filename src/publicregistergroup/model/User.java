/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;
import publicregistergroup.controller.ConnectionBuilder;
import java.sql.*;
/**
 *
 * @author newso
 */
public class User {
    static Connection con = ConnectionBuilder.getConnection();
    private int user_id;
    private long username;
    private String password;
    private Date create_at;
    private Date update_at;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public long getUsername() {
        return username;
    }

    public void setUsername(long username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
    
    public static User getUser(long username) {
        User user = new User();
        long std = 0;
        /*String query = "SELECT a.std_id as username, a.std_name, b.password "
                + "FROM students AS a LEFT OUTER JOIN user as b ON a.std_id = b.username "
                + "WHERE a.username = ?";*/
        String sql = "select std_id from user where std_id == 57130500121 ";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
           
            // statement.setLong(1, username);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                System.out.println();
            }
            //std = user.username = res.getLong("username");
            //if(std==){
            //    std == 
            //}
            //user.password = res.getString("password");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
}
