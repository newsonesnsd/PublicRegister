/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import java.sql.Connection;
//import java.sql.Date;
import java.util.Date;
import publicregistergroup.controller.*;
/**
 *
 * @author newsone
 * This is Class for student in database not ldap 5555
 */
public class Students {
    static Connection con = ConnectionBuilder.getConnection();
    private long std_id;
    private String std_name;
    private String std_faculty;
    private String std_department;
    private String std_major;
    private String std_tel;
    //private bla bla std_picture;
    private String std_role;
    private Date created_at;
    private Date updated_at;
    
}
