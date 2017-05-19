/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;
import publicregistergroup.controller.ConnectionBuilder;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import publicregistergroup.controller.LdapAuthen;
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

    public int getUser_id() {
        return user_id;
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
    
    public static User getUsers(long username) {
        User user = new User();
        long std = 0;
        /*String query = "SELECT a.std_id as username, a.std_name, b.password "
                + "FROM students AS a LEFT OUTER JOIN user as b ON a.std_id = b.username "
                + "WHERE a.username = ?";*/
        try {
            String sql = "SELECT * FROM publicRegis.students s join publicRegis.users u on s.std_id = u.username where u.username = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setLong(1, username);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                //System.out.println(username);
                System.out.println("ID: "+res.getLong("std_id"));
                System.out.println("NAME: "+res.getString("std_name"));
                System.out.println("FACULTY: "+res.getString("std_faculty"));
                System.out.println("DEPARTMENT: "+res.getString("std_department"));
                System.out.println("MAJOR: "+res.getString("std_major"));
            }
            //std = user.username = res.getLong("username");
            //if(std==){
            //    std == 
            //}
            //user.password = res.getString("password");
            con.close();
        } 
        catch (SQLException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e + "\n" + e.getMessage());
        }
        return user;
    }
    
    public static boolean getLogin(JTextField jtfUsername, JPasswordField jpfPassword) {
        boolean status = false;
        String stdUsername;
        String stdPassword;
        stdUsername = jtfUsername.getText();
        stdPassword = String.valueOf(jpfPassword.getPassword());
        status = LdapAuthen.getLogin(stdUsername, stdPassword);
        return status;
//        try {
//            String stdUsername;
//            String stdPassword;
//            stdUsername = jtfUsername.getText();
//            stdPassword = String.valueOf(jpfPassword.getPassword()); // Password not Hash
//            //Connection con = ConnectionBuilder.getConnection();
//            PreparedStatement pre;
//            String sql;
//            sql = "select username, password from users where username = ? and password = ?";
//            pre = con.prepareStatement(sql);
//            pre.setString(1, stdUsername);
//            pre.setString(2, stdPassword);
//            ResultSet rec = pre.executeQuery();
//            if (rec.next()) {
//                //this.setVisible(false);
//                //Homepage newHome = new Homepage();
//                //newHome.setVisible(true);
//                status = true;
//            }
//            else {
//                status = false;
//            }
//        } 
//        catch (SQLException e) {
//            System.out.println(e);
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
          
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER");
        long inputUsername = input.nextLong();
        getUsers(inputUsername);
    }
}
