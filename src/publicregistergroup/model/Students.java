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

    public long getStd_id(long std_id) {
        return std_id;
    }

    public void setStd_id(long std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_faculty() {
        return std_faculty;
    }

    public void setStd_faculty(String std_faculty) {
        this.std_faculty = std_faculty;
    }

    public String getStd_department() {
        return std_department;
    }

    public void setStd_department(String std_department) {
        this.std_department = std_department;
    }

    public String getStd_major() {
        return std_major;
    }

    public void setStd_major(String std_major) {
        this.std_major = std_major;
    }

    public String getStd_tel() {
        return std_tel;
    }

    public void setStd_tel(String std_tel) {
        this.std_tel = std_tel;
    }

    public String getStd_role() {
        return std_role;
    }

    public void setStd_role(String std_role) {
        this.std_role = std_role;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
}
