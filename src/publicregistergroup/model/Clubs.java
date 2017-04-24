/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import java.sql.Connection;
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


    
    
}
