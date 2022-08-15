/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.DB;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class ConnectionProvider {
     private static Connection con;
    public static Connection getConnection() {
        
    try {
        
       if (con==null) {
           //driver class load
       
       Class.forName("com.mysql.jdbc.Driver");
        
        //create a connection
        con=DriverManager.getConnection("jdbc:mysql://localhost/delivereat", "root", "admin");
        
       }
        
        
    } catch(Exception e) {
        
          e.printStackTrace();
    }
  
        
        return con;
    }
}
